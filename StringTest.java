//to reverse each word of a string 
import java.util.*;
import java .util.Arrays;
import java.io.*;
 public class StringTest{
    public static void main(String args[])
    {
        String s1=new String("This is test");
        String S2[]=s1.split(" ");
        s1=" ";
        for(String str:S2 )
        {
            StringBuffer a =new StringBuffer(str);
            s1=s1+a.reverse();
        }
        System.out.println(s1);
    }
}