package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_ACCEPT = "//*[@id=\"u_0_h\"]";
    public static final String XPATH_CREATE = " //*[@id=\"u_0_2\"]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement buttonAccept = driver.findElement(By.xpath(XPATH_ACCEPT));
        buttonAccept.click();

        Thread.sleep(2000);

        WebElement buttonCreateAccount = driver.findElement(By.xpath(XPATH_CREATE));
        buttonCreateAccount.click();

        Thread.sleep(2000);

        WebElement selectCombo = driver.findElement(By.name("birthday_day"));
        Select selectDay = new Select(selectCombo);
        selectDay.selectByIndex(15);

        Thread.sleep(2000);

        WebElement selectCombo1 = driver.findElement(By.name("birthday_month"));
        Select selectMonth = new Select(selectCombo1);
        selectMonth.selectByIndex(5);

        Thread.sleep(2000);

        WebElement selectCombo2 = driver.findElement(By.name("birthday_year"));
        Select selectYear = new Select(selectCombo2);
        selectYear.selectByIndex(31);
    }
}
