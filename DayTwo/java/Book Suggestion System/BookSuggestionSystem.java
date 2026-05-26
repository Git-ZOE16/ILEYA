public class BookSuggestionSystem{
                            // book slots with blank spaces
public String book1 = "";
public String book2 = "";
public String book3 = "";
public String book4 = "";
public String book5 = "";              
public int count = 0;                   //counter to check number of book slots
    
public int getCount(){                  // Counter to know number of books
    return count;
}


public void addBook(String name){
                                // Checking slots to see if books already exist
    if(name.equals(book1)) {return;}
    if(name.equals(book2)) {return;}
    if(name.equals(book3)) {return;}
    if(name.equals(book4)) {return;}
    if(name.equals(book5)) {return;}
    
    if(count == 0){
        book1 = name;
        count = 1;                      // Adding books to the List
    } else if (count == 1){
        book2 = name;
        count = 2;
    } else if (count == 2){
        book3 = name;
        count = 3;
    } else if (count == 3){
        book4 = name;
        count = 4;
    } else if (count == 4){
        book5 = name;
        count = 5;
    }
}

//BOOKS LAYOUT WITH TEXT AS TITLE OF THE BOOK

public String showBooks(){
    String text = "";       // Starting with empty message
    
    if (count >= 1) { text = text + "1. " + book1 + "\n";}
    if (count >= 2) { text = text + "2. " + book2 + "\n";}
    if (count >= 3) { text = text + "3. " + book3 + "\n";}
    if (count >= 4) { text = text + "4. " + book4 + "\n";}
    if (count >= 5) { text = text + "5. " + book5 + "\n";}
    
    return text;
}

//UPDATING THE BOOKS

public void updateBook(String oldName, String newName){

    if (book1.equals(oldName)) {book1 = newName;}
    if (book2.equals(oldName)) {book2 = newName;}
    if (book3.equals(oldName)) {book3 = newName;}
    if (book4.equals(oldName)) {book4 = newName;}
    if (book5.equals(oldName)) {book5 = newName;}
}




}










