package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Set;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        Library library = new Library("First Library");
        Set<Book> theList = library.getBooks();

        Book book1 = new Book("Title 1", "Author 1", LocalDate.of(2013, 1, 21));
        Book book2 = new Book("Title 2", "Author 2", LocalDate.of(1901, 11, 16));
        Book book3 = new Book("Title 3", "Author 3", LocalDate.of(1979, 7, 4));

        theList.add(book1);
        theList.add(book2);
        theList.add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Second Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Third Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        Book book4 = new Book("Tile 4", "Author 4", LocalDate.of(1916, 1, 11));
        theList.add(book4);


        Assert.assertEquals(4, theList.size());
        assert clonedLibrary != null;
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        assert deepClonedLibrary != null;
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(theList, clonedLibrary.getBooks());
        Assert.assertNotEquals(clonedLibrary.getBooks(), deepClonedLibrary.getBooks());
    }
}