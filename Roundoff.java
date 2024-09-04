import  java.util.*;
import java.io.*;
class Roundoff{
    public static void main(String[] args) {
        double number;
        System.out.println("Enter the decimal number:");
        Scanner sc=new Scanner(System.in);
        number=sc.nextDouble();
        System.out.println(Math.round(number));
        System.out.println(Math.floor(number));
        System.out.println(Math.ceil(number));
    }
}