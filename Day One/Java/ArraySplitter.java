import java.util.ArrayList;

public class ArraySplitter{
    public static void main(String[] args){
    
        int[] numbers = {45, 60, 3, 10, 9, 22 };
        
    ArrayList<Integer> evens = new ArrayList<>();
    ArrayList<Integer> odds = new ArrayList<>();
    
    for(int number : numbers){
    
        if(number % 2 == 0){
            evens.add(number);
        } else{
            odds.add(number);
    }
                
     }       
            
 System.out.println("Evens:" + evens);
 System.out.println("Odds:" + odds);           

    }
}
