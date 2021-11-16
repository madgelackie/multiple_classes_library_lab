import java.util.ArrayList;

public class Borrower {
    private ArrayList<Book> bookBag;

    public Borrower (){
        this.bookBag = new ArrayList<>();
    }

    public int booksInBag(){
        return this.bookBag.size();
    }

    public void borrow(Library library) {
        Book borrowedBook = library.removeBook();
        bookBag.add(borrowedBook);
    }
}
