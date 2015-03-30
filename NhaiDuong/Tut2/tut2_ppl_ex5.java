
/**
 * Write a description of class tut2_ppl_ex5 here.
 * 
 * @author (your name) Nhai Duong (1301040156)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class tut2_ppl_ex5
{
    public static void main(String[] agrs)
    {
        Scanner s = new Scanner(System.in);
        int N;
        
        System.out.print("Please enter the number of eggs:");
        N = s.nextInt();
        int gross = (int) N/144;
        int dozen = (int) (N-gross*144)/12;
        int mod = N%12;
        System.out.print("Your number of eggs is "+gross+" gross, "+dozen+" dozen and "+mod+" ");
        
    }
}