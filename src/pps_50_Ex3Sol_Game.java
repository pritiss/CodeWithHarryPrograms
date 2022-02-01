//program to demonstrate game
import java.util.Random;
import java.util.Scanner;

class Game {
    public int number;
    public int InputNumber;
    public int noOfGuesses=0;

    public int getnoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

     Game() {
        Random rand = new Random();
        this.number = rand.nextInt();
    }

    void takeUserInput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        InputNumber = sc.nextInt();
       // return InputNumber;
    }

    boolean isCorrectNumber() {
        noOfGuesses++;
        if (InputNumber == number) {
            System.out.format("Yes..u guessed it right, it was %d\n You guessed it in %d attempts",number, noOfGuesses);
            return true;
        } else if (InputNumber < number) {
            System.out.println("Too less...");
        } else if (InputNumber > number) {
            System.out.println("Too high");
        }
        return false;
    }
}
public class pps_50_Ex3Sol_Game {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b= g.isCorrectNumber();
        }
       // g.takeUserInput();
      //  boolean b = g.isCorrectNumber();
       // System.out.println(b);

    }
}
