import userlib.TextIO;
import java.util.Scanner;
import java.io.*;
public class Ex_26{
    public static void main(String[] args){
        String name;
        int exam1, exam2, exam3;
        double average;
        
        TextIO.put("Please enter your name: ");
        name=TextIO.getln();
        TextIO.put("Please enter your exam 1 score: ");
        exam1=TextIO.getlnInt();
        TextIO.put("Please enter your exam 2 score: ");
        exam2=TextIO.getlnInt();
        TextIO.put("Please enter your exam 3 score: ");
        exam3=TextIO.getlnInt();
        
        TextIO.writeFile("data.txt");
        TextIO.putln(name);
        TextIO.putln("Exam 1: %d",exam1);
        TextIO.putln("Exam 2: %d",exam2);
        TextIO.putln("Exam 3: %d",exam3);
        
        average = (exam1 + exam2 + exam3)/3.0;

        TextIO.readFile("data.txt");
        System.out.println(name.toUpperCase());
        System.out.printf("The average grade: %1.1f", average);
        ;}}