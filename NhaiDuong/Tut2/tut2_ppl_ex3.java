

/**
 * Write a description of class tut2_ppl_ex3 here.
 * 
 * @author (your name) Nhai Duong (1301040156)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class tut2_ppl_ex3
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String Str1 = new String();
        System.out.print("Please enter your name:");
        Str1 = s.nextLine();
        String Str2 = new String();
        Str2 = Str1.toUpperCase();
        System.out.print("Hello, "+Str2+", nice to meet you!");
    }
}