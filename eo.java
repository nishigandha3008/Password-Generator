import java.util.*;
import java.io.*;
public class eo {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the value:");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if (num%2==0) {
            System.out.println("Number is even.");
        }
        else{
            System.out.println("Number is odd.");
        }
    }
}
