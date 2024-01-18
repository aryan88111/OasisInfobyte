import java.util.Random;
import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
      Random rand =new Random();
      int randomNumber=rand.nextInt(100)+1;
      System.out.println("random number"+randomNumber);
      int count=0;
      while(true){
      System.out.println("Enter the number between 1-100");
      int playerGuess=sc.nextInt();
      count++;
      if(playerGuess==randomNumber){
        System.out.println("Number Guess is Correct \n You Win!!!!!!!");
        System.out.println("Number of tries you took is:"+count);
        break;
      }else if(randomNumber>playerGuess){
        System.out.println("Your guess is too low\n Try Again ");
      }
      else
      {
        System.out.println("Nope! Your guess is too higher");
      }
    }
    sc.close();
     }
 }
  