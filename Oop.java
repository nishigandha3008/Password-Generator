/*class: it is a group of datamembers(Variables and arrays) and member function(method);
class contains:
1)Fields 2]methods 3] Constructor 4]block 5]Nested class and interfaces
declaration: class class_name{
//body
instance variables
}
class_name object_name=new class_name();
Object: entities having its own property and behaviours;
 */
import java.util.*;
import java.io.*;
class Test{
    int rollno;
    String name;
    int marks;
    void getData()//method
    {
    System.out.println("Enter your Roll no:");
    Scanner sc= new Scanner(System.in);
    rollno=sc.nextInt();
    System.out.println("Enter your name:");
    name=sc.next();
    System.out.println("Enter your marks:");
    marks=sc.nextInt();
    }
    void grade()//Method
    {
        if(marks>80){
            System.out.println("Passed with Distinction");    
        }
        else if(marks>60 && marks<80){
            System.out.println("Passed with B grade");
        }else if(marks>40 && marks<60){
            System.out.println("Passed with C grade");
        }else{
            System.out.println("Fail");
        }
    }

}
class Oop{
    public static void main(String[] args) {
        int i;
        int n;
        System.out.println("Enter No.of Test:");
        Scanner a=new Scanner(System.in);
        n=a.nextInt();
        Test obj=new Test();//object is created  of class Test
        obj.getData();
        obj.grade();
        Test[] t;//declaration of an array:if we have to run the method  multiple time then we can run it using array;
        t= new Test[n];
        
        for( i=0;i<n;i++){
           
            obj.getData();
            obj.grade();
        }

        }
}