//remove whitespaces from the program 
//to count how many times a particular substring exist in the main string
import java.util.*;
import java.util.Arrays;
import java.io.*;
public class Measure
{
    public static void main(String args[])
    {
        
        String s1=new String("This is test");
        String s2="is";
        int count=0;
        for(int i=0;i<s1.length()-s2.length();i++)
        {
            if(s1.substring(1,s2.length()).equals(s2))
            count ++;
            
        }
        System.out.println(count);
    }
}
