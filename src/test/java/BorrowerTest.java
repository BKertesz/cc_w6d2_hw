import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BorrowerTest {
    Borrower guy1;
    Book book1;

    @Before
    public void setup(){
        guy1 = new Borrower("Todd");
        book1 = new Book();
    }

    @Test
    public void hasName(){
        assertEquals("Todd",guy1.getName());
    }

    @Test
    public void hasNoBorrows(){
        assertEquals(0,guy1.getBookCount());
    }

    @Test
    public void borrowsABook(){
        guy1.borrowBook(book1);
        assertEquals(1,guy1.getBookCount());
    }
}
