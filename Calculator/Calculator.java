import java.util.*;
/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    private int caseValue;
    public Calculator(){
        caseValue=0;
       
    }
    
    public Calculator(int caseValue){
        this.caseValue= caseValue;
        Scanner sc = new Scanner(System.in);
        boolean val=true;
        do{
        System.out.println("Enter a number");
        //caseValue=sc.nextInt();//asks user for a number
        switch(caseValue){
       case 1: {
                 int add1, add2;//asks user to add two numbers
                 add1=sc.nextInt();
                 add2=sc.nextInt();
                 add(add1,add2);break;
               }
       case 2: {
                 int sub1, sub2;//asks user to sub two numbers
                 sub1=sc.nextInt();
                 sub2=sc.nextInt();
                 subtract(sub1, sub2);break;
               }
       case 3: {
                 int m1, m2;//asks user to multiply two numbers
                 m1=sc.nextInt();
                 m2=sc.nextInt();
                 multiply(m1, m2);break;
               }
        case 4:{
                 int d1, d2;//asks user to divide two numbers
                 d1=sc.nextInt();
                 d2=sc.nextInt();
            
                 divide(d1,d2);break;
               }
        default: System.out.println("something");
    }
    System.out.println("Do you want to continue? Type 1 if you want to continue");
    caseValue=sc.nextInt();
   }
   while(caseValue==1);
    }
    
    public static int add(int add1, int add2){
        int value = add1 + add2;
        return value;
    }
    
    
        public static int subtract(int sub1, int sub2){
        int value = sub1 - sub2;
        return value;
    }
    
        public static int multiply(int m1, int m2){
        int value = m1 * m2;
        return value;
    }
    
        public static int divide(int d1, int d2){
        int value = d1 / d2;
        return value;
    }
}
