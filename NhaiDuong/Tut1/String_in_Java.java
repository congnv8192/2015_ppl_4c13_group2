
/**
 * Write a description of class String_in_Java here.
 * 
 * @author (your name) Nhài Dương
 * @version (a version number or a date) 22/03/2015
 */
import java.util.Scanner;
public class String_in_Java
{
    public static void main() {
        Scanner s = new Scanner(System.in);
        String Str1 = new String();
        
        System.out.print("Enter your name:");
        Str1 = s.nextLine();
        System.out.println(Str1);
        
        String Str2 = Str1.toUpperCase();
        System.out.println(Str2);
        
        String Str3 = Str2.toLowerCase();
        System.out.println(Str3);
    }
}
    