public class StudentGradingSystem{

public int[][] createStudentsResultSheet(int numberOfStudentsInClass, int numberOfSubjectOffered){

    if(numberOfStudentsInClass <= 0 || numberOfSubjectOffered <= 0){
    
    int[][] emptySheet = new int [0][0];
    
        return emptySheet;
    }
    int[][] studentResultSheet = new int[numberOfStudentsInClass][numberOfSubjectOffered];
    
    return studentResultSheet;
}

public boolean checkIfScoreIsBetweenZeroAndHundred(int originalScore){
if(originalScore >= 0 && originalScore <= 100){
    return true;
}else{
    return false;
    
    }
    
  }
  
// public int calculateTotalOfOneStudentScores(int[] student1TestSheet){
//    int sumOfStudent1TestSheet = 0;
//
//    for (int student = 0; student < subjects.length; student++) {
//        for (int subject = 0; subject < subjects[student].length; subject++) {
//            sumOfStudent1TestSheet += subjects[student][subject];
//        }
//    }
//
//    return sumOfStudent1TestSheet;
//}
 }
 
