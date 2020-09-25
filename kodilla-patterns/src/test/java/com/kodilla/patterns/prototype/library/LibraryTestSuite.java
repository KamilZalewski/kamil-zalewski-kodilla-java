package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Board;
import com.kodilla.patterns.prototype.Task;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("TestingLibrary");
        Book bookToRemove = new Book("Tytuł książki", "Autor książki", LocalDate.of(2020, 7, 13));
        library.getBooks().add(bookToRemove);
        library.getBooks().add(new Book("Tytuł książki1", "Autor książki1", LocalDate.of(2020, 7, 14)));
        library.getBooks().add(new Book("Tytuł książki2", "Autor książki2", LocalDate.of(2020, 7, 15)));
        library.getBooks().add(new Book("Tytuł książki3", "Autor książki3", LocalDate.of(2020, 7, 16)));
        library.getBooks().add(new Book("Tytuł książki4", "Autor książki4", LocalDate.of(2020, 7, 17)));

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("TestingLibrary1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("TestingLibrary2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        //When
        library.getBooks().remove(bookToRemove);
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(4, library.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());

    }
}
