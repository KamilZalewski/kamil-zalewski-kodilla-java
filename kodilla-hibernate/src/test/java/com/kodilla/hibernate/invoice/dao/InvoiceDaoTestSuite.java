package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@SpringBootTest
@RunWith(SpringRunner.class)
@Transactional
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ProductDao productDao;

    @Test
    public void testInvoiceDaoSave() {

        //Given
        Product bread = new Product("Bread");
        Product milk = new Product("Milk");
        Product cheese = new Product("Cheese");
        Product honey = new Product("Honey");
        Product eggs = new Product("Eggs");

        Item item1 = new Item(bread, new BigDecimal(5), 1, new BigDecimal(5));
        Item item2 = new Item(milk, new BigDecimal(3), 3, new BigDecimal(9));
        Item item3 = new Item(cheese, new BigDecimal(37), 1, new BigDecimal(37));
        Item item4 = new Item(honey, new BigDecimal(25), 2, new BigDecimal(50));
        Item item5 = new Item(eggs, new BigDecimal(10), 3, new BigDecimal(30));

        Invoice invoice1 = new Invoice("FV 123/2020");
        Invoice invoice2 = new Invoice("FV 124/2020");


        bread.getItems().add(item1);
        milk.getItems().add(item2);
        cheese.getItems().add(item3);
        honey.getItems().add(item4);
        eggs.getItems().add(item5);

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice2.getItems().add(item3);
        invoice2.getItems().add(item4);
        invoice2.getItems().add(item5);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        item3.setInvoice(invoice2);
        item4.setInvoice(invoice2);
        item5.setInvoice(invoice2);

        //When
        productDao.save(bread);
        productDao.save(milk);
        productDao.save(cheese);
        productDao.save(honey);
        productDao.save(eggs);
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        itemDao.save(item4);
        itemDao.save(item5);
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);

        // Then
        Assert.assertNotEquals(0, item1.getId());
        Assert.assertNotEquals(0, item3.getId());
        Assert.assertEquals(3, invoice2.getItems().size());

        //CleanUp
        invoiceDao.delete(invoice1);
        invoiceDao.delete(invoice2);
        productDao.delete(bread);
        productDao.delete(milk);
        productDao.delete(cheese);
        productDao.delete(honey);
        productDao.delete(eggs);
        itemDao.delete(item1);
        itemDao.delete(item2);
        itemDao.delete(item3);
        itemDao.delete(item4);
        itemDao.delete(item5);
    }
}

