
/**
 * 
 */
import java.lang.Math;
public class TutorsChallengeBonus2
{
   public static void main(){
     int randomInt=(int)(Math.random()*12)+1;
     //Math.random() is by default a double value so I casted it to a int
     switch(randomInt){
         case 1:System.out.println("This random month is January");break;
         case 2:System.out.println("This random month is Feburary");break;
         case 3:System.out.println("This random month is March");break;
         case 4:System.out.println("This random month is April");break;
         case 5:System.out.println("This random month is May");break;
         case 6:System.out.println("This random month is June");break;
         case 7:System.out.println("This random month is July");break;
         case 8:System.out.println("This random month is August");break;
         case 9:System.out.println("This random month is September");break;
         case 10:System.out.println("This random month is October");break;
         case 11:System.out.println("This random month is November");break;
         case 12:System.out.println("This random month is December");break;
     }
     
      
       
    }
}
