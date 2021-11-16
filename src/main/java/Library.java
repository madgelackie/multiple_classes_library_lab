import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int capacity;

    public Library(){
        this.books = new ArrayList<>();
        this.capacity = 5;
    }

    public void addBook(Book book){
        if(this.capacity > this.books.size()) {
            this.books.add(book);
        }
    }

    public int bookCount() {
        return this.books.size();
    }

    public Book removeBook() {
        if (this.books.size() >= 1) {
            return this.books.remove(0);
        }
        return
    }
}
