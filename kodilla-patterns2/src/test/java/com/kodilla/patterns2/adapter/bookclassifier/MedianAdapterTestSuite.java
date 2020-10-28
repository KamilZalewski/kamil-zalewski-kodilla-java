package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MedianAdapterTestSuite {

    @Autowired
    private MedianAdapter medianAdapter;

    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Test author", "Test title", 2010, "Test signature");
        Book book2 = new Book("Test author", "Test title", 2009, "Test signature");
        Book book3 = new Book("Test author", "Test title", 1999, "Test signature");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        //When
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        Assert.assertEquals(2009, median);
    }
}
