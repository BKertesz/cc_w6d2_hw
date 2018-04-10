import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book1;
    private Book book2;
    private Library library;

    @Before
    public void setup(){
        book1 = new Book();
        book2 = new Book();
        library = new Library(1);
    }

    @Test
    public void startEmpty(){
        assertEquals(0,library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1,library.bookCount());
    }

    @Test
    public void failToAddBook(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(1,library.bookCount());
    }
}
