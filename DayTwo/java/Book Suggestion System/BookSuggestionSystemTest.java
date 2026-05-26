import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookSuggestionSystemTest{

@Test
    public void testThatNewSystemIsEmpty(){
        BookSuggestionSystem system = new BookSuggestionSystem();
        
        assertEquals(0,system.getCount());
    }
    
@Test
    public void testToAddOneSingleBook(){
       BookSuggestionSystem system = new BookSuggestionSystem();
       system.addBook("The Hobbit");
       
       assertEquals(1, system.getCount()); 
    }  
@Test
    public void testToAddDuplicateBook(){
       BookSuggestionSystem system = new BookSuggestionSystem();
       system.addBook("The Hobbit");
       system.addBook("The Hobbit");
       
       assertEquals(1, system.getCount()); 
    }    
@Test
    public void testToAddFourBooks(){
       BookSuggestionSystem system = new BookSuggestionSystem();
       system.addBook("The Hobbit");
       system.addBook("The Mystery");
       system.addBook("Animal Farm");
       system.addBook("Brave Kingdom");
       
       assertEquals(4, system.getCount()); 
    }   
@Test
    public void testToShowBooksLayout(){
       BookSuggestionSystem system = new BookSuggestionSystem();
       system.addBook("The Hobbit");
       system.addBook("The Mystery");
       
       String expectedLayout = "1. The Hobbit\n2. The Mystery\n";
       
       assertEquals(expectedLayout, system.showBooks()); 
    }     
@Test
    public void testToUpdateBookTitle(){
       BookSuggestionSystem system = new BookSuggestionSystem();
       
       system.addBook("The Hobbit");
       
       system.updateBook("The Hobbit", "The Hobbit New Edition");
       
       String expectedLayout = system.showBooks();
       
       assertTrue(expectedLayout.contains("The Hobbit New Edition")); 
    }     
         
}






















