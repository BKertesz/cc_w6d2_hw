import java.util.ArrayList;

public class Library {

    private ArrayList<Book> catalog;
    private int maxCapacity;

    public Library(int maxCapacity){
        this.catalog = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    public int bookCount(){
        return catalog.size();
    }

    public void addBook(Book book){
//        catalog.add(book);
       if(bookCount()<maxCapacity){
           catalog.add(book);
       }
    }

}
