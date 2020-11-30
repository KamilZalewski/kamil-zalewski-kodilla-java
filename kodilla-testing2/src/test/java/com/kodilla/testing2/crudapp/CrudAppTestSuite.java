package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class CrudAppTestSuite {

    private static final String BASE_URL = "https://kamilzalewski.github.io/";
    private WebDriver driver;
    private Random generator;

    @Before
    public void initTest() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get(BASE_URL);
        generator = new Random();
    }

    @After
    public void cleanUpAfterTest() {
        driver.close();
    }

    public String createCrudAppTestTask() throws InterruptedException {
        final String XPATH_TASK_NAME = "//form[contains(@action,\"createTask\")]/fieldset[1]/input";
        final String XPATH_TASK_CONTENT = "//form[contains(@action,\"createTask\")]/fieldset[2]/textarea";
        final String XPATH_ADD_BUTTON ="//form[contains(@action,\"createTask\")]/fieldset[3]/button";
        String taskName = "Task number " + generator.nextInt(100000);
        String taskContent = taskName + " content";

        WebElement name = driver.findElement(By.xpath(XPATH_TASK_NAME));
        name.sendKeys(taskName);

        WebElement content = driver.findElement(By.xpath(XPATH_TASK_CONTENT));
        content.sendKeys(taskContent);

        WebElement addButton = driver.findElement(By.xpath(XPATH_ADD_BUTTON));
        addButton.click();
        Thread.sleep(2000);

        return taskName;
    }

    private void sendTestTaskToTrello(String taskName) throws InterruptedException {
        driver.navigate().refresh();

        while(!driver.findElement(By.xpath("//select[1]")).isDisplayed());

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        findTask(taskName, anyForm))
                .forEach(theForm -> {
                    exportTask(theForm);
                });
        Thread.sleep(5000);
    }

    private void exportTask(WebElement theForm) {
        WebElement selectElement = theForm.findElement(By.xpath(".//select[1]"));
        Select select = new Select(selectElement);
        select.selectByIndex(1);

        WebElement buttonCreateCard =
                theForm.findElement(By.xpath(".//button[contains(@class, \"card-creation\")]"));
        buttonCreateCard.click();
    }

    private boolean findTask(String taskName, WebElement anyForm) {
        boolean result = anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                .getText().equals(taskName);
        return result;
    }

    private boolean checkTaskExistsInTrello (String taskName) throws InterruptedException{
        final String TRELLO_URL = "http://trello.com/login";
        boolean result = false;
        WebDriver driverTrello = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driverTrello.get(TRELLO_URL);

        driverTrello.findElement(By.id("user")).sendKeys("kamilzalewski89@gmail.com");
        driverTrello.findElement(By.id("password")).sendKeys("Ambiwalencja1");
        WebElement el = driverTrello.findElement(By.id("login"));
        el.submit();

        Thread.sleep(16000);

        driverTrello.findElement(By.id("password")).sendKeys("Ambiwalencja1");
        driverTrello.findElement(By.id("login-submit")).submit();

        Thread.sleep(16000);

        driverTrello.findElements(By.xpath("//a[@class=\"board-tile\"]")).stream()
                .filter(aHref -> aHref.findElements(By.xpath(".//div[@title=\"Kodilla Aplication\"]")).size() > 0)
                .forEach(WebElement::click);

        Thread.sleep(16000);

        result = driverTrello.findElements(By.xpath("//span")).stream()
                .anyMatch(theSpan -> theSpan.getText().equals(taskName));

        driverTrello.close();

        System.out.println("Result = " + result);
        return result;
    }

    private void deleteCrudAppTestTask(String taskName) throws InterruptedException {
        Thread.sleep(5000);

        driver.findElements(By.xpath("//form[@class=\"datatable__row\"]")).stream()
                .filter(anyForm ->
                        anyForm.findElement(By.xpath(".//p[@class=\"datatable__field-value\"]"))
                                .getText().equals(taskName))
                .forEach(theForm -> {
                    WebElement buttonDelete =
                            theForm.findElement(By.xpath(".//button[4]"));
                    buttonDelete.click();
                });
        Thread.sleep(5000);

    }

    @Test
    public void shouldCreateTrelloCard () throws InterruptedException {
        String taskName = createCrudAppTestTask();
        sendTestTaskToTrello(taskName);
        driver.switchTo().alert().accept();
        deleteCrudAppTestTask(taskName);
        assertTrue(checkTaskExistsInTrello(taskName));
    }

}