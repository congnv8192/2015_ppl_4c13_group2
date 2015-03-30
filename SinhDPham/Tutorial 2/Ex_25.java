import java.util.Scanner;
import java.io.*;

public class Ex_25{
    public static void main(){
        int a, b, c, d;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the number of your eggs: ");
        a = s.nextInt();
        
        b =(int) a/144;
        c =(int) ((a%144)/12);
        d = a-b*144-c*12;
    
        System.out.println("You have "+b+" gross(es)"+", "+c+" dozen(s)"+", "+d+" egg(s).");
        System.out.println("Thank you!");}}