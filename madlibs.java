import java.util.Scanner;
/**
 * This program prints out a madlib with user inputs
 *
 * @author Akshay Krishnamoorthy
 * @date 9/18/22
 */
public class madlibs
{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter your name:");
  String username = input.nextLine();
  //System.out.println(username);
  System.out.print("Enter the number month:");
  int month = input.nextInt();
  System.out.print("Enter the number day:");
  int day = input.nextInt();
  System.out.print("Enter the number year:");
  int year = input.nextInt();
  input.nextLine();
  System.out.print("Enter your favorite sport:");
  String Sport = input.nextLine();
  System.out.print("Enter the weather:");
  String Weather = input.nextLine();
  System.out.print("Enter the season:");
  String Season = input.nextLine();
  System.out.print("Enter your clothing:");
  String Clothing = input.nextLine();
  System.out.print("Enter your favorite team:");
  String Favoriteteam = input.nextLine();
  System.out.println("My name is "+username);
  System.out.println("The date is "+month+ "/" +day+ "/" +year);
  System.out.print("Nothing beats a game of "+Sport+ " on a " +Weather+ " " +Season+" day. Fans dress in their team's "+Clothing+ " to show their support."+"\n"+ "My favorite team is " +Favoriteteam+ ".");
  
  
  }
  
    }
