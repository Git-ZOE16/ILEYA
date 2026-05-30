public class Mbti{
    public String[] optionA ={
        "expend energy, enjoy groups",
        "interpret literally",
        "logical, thinking, questioning",
        "organized, orderly",
        "more outgoing, think out loud",
        "practical, realistic experiential",
        "candid, straight forward, frank",
        "plan, schedule",
        "seek many tasks, public activities, interaction with others",
        "standard, usual, conventional",
        "firm, tend to criticize, hold the line",
        "regulated, structure",
        "external, communicative, express yourself",
        "focus on here-and-now",
        "tough-minded, just",
        "preparation, plan ahead",
        "active, initiate",
        "acts, things, what is",
        "matter of fact, issue-oriented",
        "control, govern"
        };
        
    public String[] optionB ={
        "conserve energy, enjoy one-on-one",
        "look for meaning and possibilities",
        "empathetic, feeling, accommodating",
        "flexible, adaptable",
        "more reserved, think to yourself",
        "imaginative, innovative, theoretical",
        "frank tacful, kind, encouraging",
        "unplanned, spontaneous",
        "seek private, solitary activities with quite to concentrate",
        "different, novel, unique",
        "gentle tend to appreciate, conciliate",
        "easygoing, live-and-let-live",
        "internal, reticent, keep to yourself",
        "look to the future, global perspective, big picture",
        "tender-hearted, merciful",
        "go with the flow, adapt as you go",
        "reflextive, deliberate",
        "ideas, dreams, what could be, philosophical",
        "sensitive, people-oriented, compassionate",
        "latitude, freedom"
        };
        
    public String getQuestion(int number){
        for(int index = 0; index < 20; index = index +1){
            if((index + 1) == number){
            return "A. " + optionA[index] + "\nB. " + optionB[index];
            }
        }
        return "";
  }
  
// COLLECTION OF ANSWERS

     public String[] userAnswers = new String[20]; 
     
     public void saveAnswer(int questionNumber, String answer){ //Storing of Ans
     
     if(!answer.equals("A") && !answer.equals("B")){
        System.out.println("Expecting A or B as Response");
        System.out.println("Error, please try again");
        return;
     }
     for(int index = 0; index < 20; index = index + 1){ 
        if((index + 1) == questionNumber){ // comparing user's Answer
            userAnswers[index] = answer; // saving answer in the right slot
        }
        }
     }
     
  public String getSavedAnswer(int questionNumber){
    for(int index = 0; index < 20; index = index + 1){
        if((index + 1) == questionNumber){
            return userAnswers[index]; // returns text found
        }
       }
       return "";
     }
  
public String calculateEvsI(){
    int countA = 0;
    int countB = 0;
    
int[] evsI_Indexes = {0, 4, 8, 12, 16}; // indexes of 1,5,9,13,17

    for(int index : evsI_Indexes){
        if("A".equals(userAnswers[index])){
            countA = countA + 1;
        } else if("B".equals(userAnswers[index])){
            countB = countB + 1;
      }
    }
     if (countA > countB){
        return "E";
     } else{
        return "I";
}  
}
public String calculateSvsN(){
    int countA = 0;
    int countB = 0;
    
int[] svsN_Indexes = {1,5,9,15,17}; // indexes of 2,6,10,14,18

    for(int index : svsN_Indexes){
        if("A".equals(userAnswers[index])){
            countA = countA + 1;
        } else if("B".equals(userAnswers[index])){
            countB = countB + 1;
        
        }
      }
       if(countA > countB){
            return "S";
       } else{
            return "N";
}

}

public String calculateTvsF(){
    int countA = 0;
    int countB = 0;
    
int[] tvsF_Indexes = {2,6,10,14,18}; //indexes of 3,7,11,15,19

    for(int index : tvsF_Indexes){
        if("A".equals(userAnswers[index])){
            countA = countA + 1;
        } else if("B".equals(userAnswers[index])){
            countB = countB + 1;
        } 
       }
        if(countA > countB){
            return "T";
        } else{
            return "F";
}
}
public String calculateJvsP(){
    int countA = 0;
    int countB = 0;
    
int[] jvsP_Indexes = {3,7,11,15,19}; //indexes of 4,8,12,16,20

    for(int index : jvsP_Indexes){
        if("A".equals(userAnswers[index])){
            countA = countA + 1;
        } else if("B".equals(userAnswers[index])){
            countB = countB + 1;
        }
       }
        if(countA > countB){
            return "J";
        } else{
            return "P";
}
}
public String getMbtiResult(){

    String introExtro = calculateEvsI();
    String senseIntuition = calculateSvsN();
    String thinkFeel = calculateTvsF();
    String judgePerceive = calculateJvsP();
    
    return introExtro + senseIntuition + thinkFeel + judgePerceive;
}

}















