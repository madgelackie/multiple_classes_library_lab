import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Borrower borrower1;

    @Before
    public void setUp(){
        library = new Library();
        book1 = new Book("Willy Wonka", "Roald Dahl", "Childrens' Books");
        book2 = new Book("Foundation", "Isaac Asimov", "Sci-Fi");
        borrower1 = new Borrower();
    }

    @Test
    public void hasBookBag(){
        assertEquals(0, borrower1.booksInBag());
    }

    @Test
    public void addBookToBag(){
        library.addBook(book1);
        library.addBook(book2);
        library.removeBook();
        borrower1.borrow(library);
        borrower1.borrow(library);
        borrower1.borrow(library);
        assertEquals(3, borrower1.booksInBag());
    }

}
