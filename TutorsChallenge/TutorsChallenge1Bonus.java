/**
 *
 * Name - Afsar Ahmed
 * Student Number 991432327
 * Professor's Name - Moskal,Robert
 */
import java.util.Scanner;
public class TutorsChallenge1Bonus {

    /**
     * @param args the command line arguments
     */
    protected static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dateOfBirth;//keeps intial user input
        String[] theDate = new String[3];
        /*I used an array because I did not want to keep 
         * track of soo many variables storing the day, month, and year. 
         */System.out.println("Enter date in YYYYMMDD:");
        dateOfBirth = sc.nextLine();
        
        for(int x=0;x<theDate.length;x++){
            
            switch(x){
                //substing method looks for the position of a character from left to right
                case 0:theDate[2]=dateOfBirth.substring(0, 4); break;//year
                case 1:theDate[1]=dateOfBirth.substring(4, 6); break;//month
                case 2:theDate[0]=dateOfBirth.substring(6, 8); break;//day
            }
            

        }
        System.out.println("You were born on: " + theDate[0] + "-" + theDate[1] + "-" + theDate[2]);
        //This is the output
    }
    
}