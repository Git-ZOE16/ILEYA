import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentGradingSystemTest{

@Test
public void testThatGradingSheetIsCreated(){
    StudentGradingSystem gradingSystem = new StudentGradingSystem();
        
    int[][] actualStudentResultSheet = gradingSystem.createStudentsResultSheet(4,3);
    
    assertNotNull(actualStudentResultSheet);
    
    int totalStudentRowsCreated = actualStudentResultSheet.length;
    
    assertEquals(4, totalStudentRowsCreated);
    
    int totalSubjectColumnsCreated = actualStudentResultSheet[0].length;
    
    assertEquals(3, totalSubjectColumnsCreated);
    }
    
@Test
public void testThatGradingSheetReturnsEmptyIfInputsAreInvalid(){
  StudentGradingSystem gradingSystem = new StudentGradingSystem();
  
  int[][] emptySheetForZeroStudents = gradingSystem.createStudentsResultSheet(0,3);
  
  assertEquals(0, emptySheetForZeroStudents.length); 
}

@Test
public void testToCheckForValidScoresBetweenZeroAndHundred(){
    StudentGradingSystem gradingSystem = new StudentGradingSystem();
    
    boolean minimumScore = gradingSystem.checkIfScoreIsBetweenZeroAndHundred(0);
    assertTrue(minimumScore);
    
    boolean maximumScore = gradingSystem.checkIfScoreIsBetweenZeroAndHundred(100);
    assertTrue(maximumScore);
}
@Test
public void testToCheckForInvalidScoresOutsideZeroAndHundred(){
    StudentGradingSystem gradingSystem = new StudentGradingSystem();
    
    boolean negativeValue = gradingSystem.checkIfScoreIsBetweenZeroAndHundred(-1);
    assertFalse(negativeValue);
    
    boolean aboveHundredValue = gradingSystem.checkIfScoreIsBetweenZeroAndHundred(101);
    assertFalse(aboveHundredValue);
}
//@Test
//public void testToCalculateGrandTotalForNormalGradingSheet(){
//    StudentGradingSystem gradingSystem = new StudentGradingSystem();
//    
//    int[] student1TestSheet = {67, 21, 49};
//    
//    int actualTotalScore = gradingSystem.calculateTotalOfOneStudentScores(student1TestSheet);
//    
//    assertEquals(137, actualTotalScore);
//}

@Test
public void testToCalculateEachStudentAverageScores(){
    StudentGradingSystem gradingSystem = new StudentGradingSystem();
    
    int[][] student1TestSheet ={ {67, 21, 49},
                                {98, 62, 56}
    };
    
    int[] expectedResult = {137, 216};
    int[] actualResult = StudentGradingSystem.calculateTotalOfOneStudentScores(student1TestSheet);
    
    assertArrayEquals(expectedResult, actualResult);
}

}
