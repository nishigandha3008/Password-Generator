import java.util.*;
import java.io.*;
class cooler{
    int x,y;
    int sum;
    cooler()//non parameterized connstructor
    {
        x=8;
        y=10;
        System.out.println("This is default  constructor");
    
    }
    cooler(int c,int d){
        x=c;
        y=d;
        System.out.println("This is an example of constructor overloading");
    }
        void calci()
        {
        sum=x+y;
        System.out.println("The Sum of x and y is: "+ sum);
        }
    }
class student{
    int a,b;
    int total;
    student(int n1,int n2)//Parameterized Constructor
    {
        
        System.out.println("This is parameterized constructor");
         a=n1;
        b=n2;
    }void cal(){
        total=a+b;
        System.out.println("total marks:"+ total);
    }
}
public class Constructor {
    public static void main(String[] args) {
        
        cooler obj=new cooler();//implicit call:object is created;
        obj.calci();
        new cooler(10, 20);
        cooler co=new cooler(100, 200);
        co.calci();
        new cooler();//explicit call:without creating object;
        student st=new student(101, 201);
        st.cal();

    }
    
}
