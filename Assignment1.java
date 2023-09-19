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

    //Fahrenheit to Celsius/
    Scanner input = new Scanner(System.in); {
      System.out.println("please enter a number in Fahrenheit:");
      Double Fahrenheit = input.nextDouble();
      Double Celsius = (Fahrenheit - 32.0) * 5.0/9.0; //Conversion equation for Fahrenheit
      System.out.println("Temperature in Celsius" + Celsius);

      //
     input.close();
    }
  }
}

