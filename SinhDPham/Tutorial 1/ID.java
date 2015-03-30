import java.util.Scanner;
import java.io.*;
public class ID {
    public static void main(String args[]){
        int id;
        Scanner s = new Scanner(System.in);
        
        System.out.println("Please enter you student ID: ");
        id = s.nextInt();
        String lop;
        System.out.println("Please enter your class: ");
        lop = s.next();
        String username = lop.substring(0,2) +id;
        System.out.print("Your username: "+username );

    }}