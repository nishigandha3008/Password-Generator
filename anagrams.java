/*to check two strings  are anagrams of each other or not */
//anagrams:if two strings have same length  same letters but different sequence eg: ARMY and MARY
import java .util.*;
import java.io.*;
public class anagrams{
    public static void main(String args[]){
        String str1,str2;
        System.out.println("Enter Str1 and Str2");
        Scanner sc=new Scanner(System.in);
        str1=sc.nextLine();
        str2=sc.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if(str1.length()!= str2.length()){
            System.out.println("Both the strings are not anagrams");
        }
        else{
            char[] string1=str1.toCharArray();
            char[] string2=str2.toCharArray();
            Arrays.sort(string1);
            Arrays.sort(string2);
            if(Arrays.equals(string1, string2)==true){
                
                System.out.println("Both the strings are anagrams");
            }
            else{
                System.out.println("Both the strings are not anagrams");
            }
            }
    }
}
