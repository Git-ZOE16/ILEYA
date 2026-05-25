import java.util.Arrays;

public class PalindromeArray{
    public static void main(String[] args){
    
  int[] original = {45, 0, 8, 0, 45};
  
  int[] reversed = new int[original.length];
  
  int backIndex = original.length - 1;
  
  for(int frontIndex = 0; frontIndex < original.length; frontIndex++){
  
    reversed[frontIndex] = original[backIndex];
    
    backIndex = backIndex - 1;
  } 
  System.out.println(Arrays.equals(original, reversed));
  
}
}
