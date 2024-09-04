//print ascii  values of each character in  string
import java.util.*;
import java.io.*;
import java.util.Arrays;
public class Ascii{
    public static void main(String args[])
    {
        char a;
        System.out.println("Enter Character:");
        Scanner sc=new Scanner(System.in);
        a=sc.next().charAt(0);
        int ascii=a;
        int castAscii=(int) a;
        System.out.println("The ASCII value of " + a + " is:" + ascii);
    }

} 