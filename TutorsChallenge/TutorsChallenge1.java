
/**
 * Name - Afsar Ahmed
 * Student Number 991432327
 * Proffesor's Name - Moskal, Robert
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class TutorsChallenge1
{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int dateOfBirth;//Stores user initial input
      int year,month,date;//stores the numbers for the date
      System.out.println("Enter date in YYYYMMDD:");
      dateOfBirth=sc.nextInt();
     
     if(dateOfBirth>=11111111 && dateOfBirth<=99999999){//makes sure the user enters an 8 digit number
      year=dateOfBirth/10000;//calculates the year
      month=(dateOfBirth-(year*10000))/100;//calculates the month
      date=dateOfBirth%100;//calculates the date
     
       System.out.println("You were born on: " + date + "-" + month + "-" + year);
     }
        
    }
}
