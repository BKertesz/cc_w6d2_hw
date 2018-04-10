import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> myBooks;

    public Borrower(String name){
        this.name = name;
        myBooks = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void borrowBook(Book book){
        myBooks.add(book);
    }

    public int getBookCount(){
        return myBooks.size();
    }
}
