/*check string is pallindrome or not*/
//palindrome : if the  string is same when we start reading from left to right and right to left
import java.util.*;
import java.io.*;
import java.lang.*;
class Solution{
 int x=121;
 long reverse;
    long temp;
 public boolean ispallindrome(int x){
    if(x<0){
        return false;
    }
   
    while(temp!=0){
        int digit=(int)temp%10;
        reverse=reverse*10+digit;
        temp/=10;
    }
    return (reverse==x);
} 
 
}
public class pallindrome{
    public static void main(String args[]){
        Solution obj=new Solution();
        obj.ispallindrome(121);
    }
}