import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void setUp() {
        library = new Library();
        book1 = new Book("Willy Wonka", "Roald Dahl", "Childrens' Books");
        book2 = new Book("Foundation", "Isaac Asimov", "Sci-Fi");
    }

    @Test
    public void addBookToLibraryCollection() {
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void checkCapacityBeforeAdd() {
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        library.addBook(book1);
        assertEquals(5, library.bookCount());
    }

    @Test
    public void checkRemoveBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook();
        assertEquals(1, library.bookCount());
    }

//    @Test
//    public void onlyRemoveIfEnoughBooks(){
//        library.addBook(book1);
//        library.addBook(book2);
//        library.removeBook();
//        library.removeBook();
//        library.removeBook();
//        assertEquals(0, library.bookCount());
//    }

}
