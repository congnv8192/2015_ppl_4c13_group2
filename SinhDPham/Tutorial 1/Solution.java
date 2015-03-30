import java.util.Scanner;
public class Solution {
    public static void main()
    {
       float a, b, c, x, x1, x2, del;
       Scanner s = new Scanner(System.in);
       System.out.println("Please enter a: ");
       a = s.nextFloat();
       System.out.println("Please enter b: ");
       b = s.nextFloat();
       System.out.println("Please enter c: ");
       c = s.nextFloat();
       
       if(a==0) {
           x=(float) -b/a;
          System.out.println("x = "+x);
        }
       else {
           del = (float) b*b -4*a*c;
           if(del<0){
               System.out.println("No solution");
            }
           else if(del==0){
           x=(float) -b/2*a;
           System.out.println("x = "+x);
        }
           else{
           x1= (float) (-b-Math.sqrt(del)/2*a*c);
           x2= (float) (-b+Math.sqrt(del)/2*a*c);
           System.out.println("x1 = "+x1);
           System.out.println("x2 = "+x2);
        }}}}