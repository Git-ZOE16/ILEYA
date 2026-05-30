import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MbtiTest{

@Test
public void testToGetFirstQuestion(){
    Mbti mbti = new Mbti();
        
    String question1 = mbti.getQuestion(1); //Getting the first question 
        
    String expected = "A. expend energy, enjoy groups\nB. conserve energy, enjoy one-on-one";
        
    assertEquals(expected, question1);
}
    
@Test
public void testToSaveAnswer(){
    Mbti mbti = new Mbti();
        
    mbti.saveAnswer(1, "A"); // Save Answer A for question 1 inside mbti
  
    assertEquals("A", mbti.getSavedAnswer(1));    
 }
 
@Test
public void testForInvalidAnswer(){
    Mbti mbti = new Mbti();
        
    mbti.saveAnswer(1, "C"); 
  
    assertNull(mbti.getSavedAnswer(1));    
 }
 
@Test
public void testToCalculateEvsIAndReturnExtrovert(){
    Mbti mbti = new Mbti();
        
    mbti.saveAnswer(1, "A");
    mbti.saveAnswer(5, "A");
    mbti.saveAnswer(9, "A");
    mbti.saveAnswer(13, "A");
    mbti.saveAnswer(17, "A");
    
    String result = mbti.calculateEvsI(); 
  
    assertEquals("E", result);    
 }
 
@Test
public void testToCalculateSvsNAndReturnSensing(){
    Mbti mbti = new Mbti();
        
    mbti.saveAnswer(2, "A");
    mbti.saveAnswer(6, "A");
    mbti.saveAnswer(10, "A");
    mbti.saveAnswer(14, "A");
    mbti.saveAnswer(18, "A");
    
    String result = mbti.calculateSvsN(); 
  
    assertEquals("S", result);    
 }
@Test
public void testToCalculateTvsFAndReturnThinking(){
    Mbti mbti = new Mbti();
        
    mbti.saveAnswer(3, "A");
    mbti.saveAnswer(7, "A");
    mbti.saveAnswer(11, "A");
    mbti.saveAnswer(15, "A");
    mbti.saveAnswer(19, "A");
    
    String result = mbti.calculateTvsF(); 
  
    assertEquals("T", result);   
 }
@Test
public void testToCalculateJvsPAndReturnJudging(){
    Mbti mbti = new Mbti();
        
    mbti.saveAnswer(4, "A");
    mbti.saveAnswer(8, "A");
    mbti.saveAnswer(12, "A");
    mbti.saveAnswer(16, "A");
    mbti.saveAnswer(20, "A");
    
    String result = mbti.calculateJvsP(); 
  
    assertEquals("J", result);   
 }
 
@Test
public void testToCalculateAllMbtiTypeAndReturnInfj(){
    Mbti mbti = new Mbti();
                                // INTROVERT (I)       
    mbti.saveAnswer(1, "B");
    mbti.saveAnswer(5, "B");
    mbti.saveAnswer(9, "B");
    
                                // INTUITION (N)       
    mbti.saveAnswer(2, "B");
    mbti.saveAnswer(6, "B");
    mbti.saveAnswer(10, "B");
    
                                // FEELING (F)       
    mbti.saveAnswer(3, "B");
    mbti.saveAnswer(7, "B");
    mbti.saveAnswer(11, "B");
    
                                // JUDGING (J)       
    mbti.saveAnswer(4, "A");
    mbti.saveAnswer(8, "A");
    mbti.saveAnswer(12, "A");
   
    String finalType = mbti.getMbtiResult(); 
  
    assertEquals("INFJ", finalType);   
 }
}
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
