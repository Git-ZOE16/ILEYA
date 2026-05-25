import java.util.Scanner;
import java.util.Random;

public class GuessApp{
public static void main(String[] args){

Random random = new Random();
Scanner inputCollector = new Scanner(System.in);

int secreteNumber = random.nextInt(100);
int count = 0;
int input =0;

while(true){

System.out.println("Guess a number");
input = inputCollector.nextInt();

if (input < 1 || input > 100){
System.out.println("invalid, Enter again");
continue;
}
else{
if(input > secreteNumber){
        System.out.println("lower!");
    }
    else {
        System.out.println("Higher");
    }
    count += 1;
    if(input == secreteNumber){
 break;
        }
}

if (count == 5){
break;
}
}

System.out.println("the correct number is: " + secreteNumber);
System.out.println("the number of attempts is: " + count);

if(input == secreteNumber && count == 1){
 System.out.println("your rating is Legendary"); 
}
else if(input == secreteNumber && count == 2){
    System.out.println("your rating is Excellent");
    }
else if(input == secreteNumber && count == 3 || count == 4){
    System.out.println("your rating is Good");
    }
else if(input == secreteNumber && count == 5){
    System.out.println("your rating is close!");
}

 else {
     System.out.println("no win = Better luck");
    }

}

}






















//
//random_num = Math.floor(Math.random() * 100)
//
//console.log(random_num)
//
//const prompt = require("prompt-sync")()
//
//count = 0
//
//while(true){
//
//    count+=1
//    
//    guessNum = prompt("guess a number: ")
//    if(guessNum > 100){
//        console.log("abort!!!!")
//    }
//    
//    if(guessNum > random_num){
//        console.log("higher")
//    } else if(guessNum < random_num){
//        console.log("lower")
//    } else if(guessNum == random_num){
//        console.log("correct")
//        break
//    }
//    
//    
//    if(count == 5){
//        console.log(trials exceeded, no of tries is ${count})
//        break
//    }
//    
//}
