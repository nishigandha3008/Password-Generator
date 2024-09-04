/*swap the two strings without using third string object*/
import java.util.*;
import java.io.*;
public class swapping{
    public static void main(String args[]){
        String s1;
        String s2;
        System.out.println("enter S1 and S2");
        Scanner sc=new Scanner(System.in);
        s1=sc.nextLine();
        s2=sc.nextLine();
        int i=s1.length();
        s1=s1+s2;
        s2=s1.substring(0, i);
        s1=s1.substring(i);
        System.out.println("Value os S1 after swapping:"+ s1);
        System.out.println("Value of S2 after swapping:"+ s2);



    }
}