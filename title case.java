/*go to title case*/
import java.util.Arrays;
import java.util.*;
class StringTest {
    public static void main(String args[]){
        String s1="This is test ";
        String s2[]=s1.split(" ");
        s1="";
        for(String str:s2)
        {
            s1=s1+Character.toUpperCase(str.charAt(0))+str.substring(1);


        }System.out.println(s1);
    }
}