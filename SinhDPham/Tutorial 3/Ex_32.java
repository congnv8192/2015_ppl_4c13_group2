import java.util.*;
import java.io.*;
import userlib.TextIO;

public class Ex_32{
    public static void main(String[] args){
        double a, b, r;
        char o;
        
        while (true){
        System.out.print("Enter a value: ");
        a = TextIO.getDouble();
        if(a==0){
            break;}
        System.out.print("Enter operator: ");
        o = TextIO.getChar();
        System.out.print("Enter b value: ");
        
        b = TextIO.getDouble();
        
        switch(o){
            case '+':
            r = a + b;
            break;
            case '-':
            r = a - b;
            break;            
            case '*':
            r = a * b;
            break;            
            case '/':
            r = a / b;
            break;            
            default: 
            TextIO.putln("Invalid operator!");
            continue;
        }
        
        TextIO.putln(" = "+r);
        TextIO.putln();
    }}}