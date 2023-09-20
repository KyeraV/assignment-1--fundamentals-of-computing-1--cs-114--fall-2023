import java.util.Scanner;
import java.util.Random;
/* Goal: Print out your initials for your first and last name in large letter blocks.
Next ask user to enter a number in Fahrenheit, the program should convert the value to
Celsius, save it. take the input from the user in a 5-character string, save the string
the string in reverse without the first and last characters. Next generate and save a 
random number between 32 - 16,384. Finally combine the results from steps 2 - 4 and print
 it to the screen.*/
public class Assignment1 {
  public static void main(String[] args) {
    Scanner input;
    Double Fahrenheit, Celsius;
    String abaft, newString;
    int min = 32, max = 16384;

    System.out.println();
    System.out.println("          KKK         KKK    VVV               VVV");
    System.out.println("          KKK       KKK       VVV             VVV");
    System.out.println("          KKK     KKK          VVV           VVV");
    System.out.println("          KKK   KKK             VVV         VVV");
    System.out.println("          KK  KKK                VVV       VVV");
    System.out.println("          KKK   KKK               VVV     VVV");
    System.out.println("          KKK    KKK               VVV   VVV");
    System.out.println("          KKK       KKK             VVV VVV");
    System.out.println("          KKK         KKK             VVV");

    //Fahrenheit to Celsius
    input = new Scanner(System.in);
    System.out.println("please enter a number in Fahrenheit:");
    Fahrenheit = input.nextDouble();
    Celsius = (Fahrenheit - 32.0) * 5.0/9.0; //Conversion equation for Fahrenheit
    System.out.println("Temperature in Celsius" + Celsius);
    //

    //5-character string
    System.out.println("Enter a 5-character string:");
    abaft = input.next();
    newString = new StringBuilder(abaft.substring(1, 4)).reverse().toString(); //Remove the first and last character and reverse it;

    //Random number generator
    Random num = new Random();
    System.out.println("Give me a random number between "+min+" to "+max);


    input.close();
  }
}

