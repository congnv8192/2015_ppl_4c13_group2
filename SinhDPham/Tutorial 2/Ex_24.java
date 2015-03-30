import java.util.Scanner;
import java.io.*;

public class Ex_24{
    public static void main(String[] args){
        float a, b, c, d, e;
       
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of quaters: ");
        a = s.nextFloat();
        System.out.print("Enter the number of dimes: ");
        b = s.nextFloat();
        System.out.print("Enter the number of nickels: ");
        c = s.nextFloat();
        System.out.print("Enter the number of pennies: ");
        d = s.nextFloat();
        
        e = (float) (a*0.25 + b*0.1 + c*0.05 + d*0.01);
        System.out.println("Your balance is: "+e+" USD.");
        System.out.println("Thank you!");}}
        
        