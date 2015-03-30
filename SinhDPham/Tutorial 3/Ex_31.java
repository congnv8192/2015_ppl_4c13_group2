import java.util.*;
import java.io.*;

public class Ex_31{
    public static void main(String[] args){
        int die1, die2;
        int count = 0;
        
        do{
            die1 = (int) (Math.random()*6) +1;
            die2 = (int) (Math.random()*6) +1;
            count++;
        } while (! (die1==1 && die2==1));
        
        System.out.println("We have snake eyes after " + count+ " times rolling the dice.");
    }
    
}