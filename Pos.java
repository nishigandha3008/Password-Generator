import  java.util.*;
import java.io.*;
public class Pos{
    public static void main(String[]  args){
        int n;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>0)
            System.out.println("Positive");
        else if(n<0)
            System.out.println("Negative");
        else
            System.out.println("zero");
    }
    
}
