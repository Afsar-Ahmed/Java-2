import java.util.Scanner;
/**
 * Write a description of class TutorsChallenge here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TutorsChallenge3
{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     double C, F;
     System.out.println("Enter a temperature in Fahrenheit");
     do{
     
     F=sc.nextDouble();
     if(F<=-459.67){
         System.out.println("Please try again");
        }
     else{
         C=F-32;
         System.out.println(C);
         break;
        }
     
    }
    while(true);
    
    
     
     
        
    }
}
