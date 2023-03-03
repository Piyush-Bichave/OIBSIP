import java.util.Random;
import java.util.Scanner;

public class MyGame {
    public int number;
    public int inputNumber;
    public int NumberOfGuesses=0;


    MyGame(){
        Random ran=new Random();
        this.number= ran.nextInt(100);
    }

    void takeUserInput(){

        System.out.println("Guess the Number");
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();

    }

    boolean isCorrectNumber(){
        NumberOfGuesses++;
        if(inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, NumberOfGuesses);
            System.out.println();
            return true;
        }
        else if(inputNumber>number){
            System.out.print(inputNumber + " is higher than the actual number");
        }

        else if(inputNumber<number){
            System.out.println(inputNumber + " is less than the actual number");
        }
        return false;

    }
}
