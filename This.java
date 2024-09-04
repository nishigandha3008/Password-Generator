//this kkeyword is  an implicit object of an class which is used to refer class members
class A{
    int a,b;
    A(int a,int b){
        this.a=a;
        this.b=b;
 
    }
    void calci(){
        int sum=a+b;
        System.out.println("sum is:"+ sum);
        
    }
    void calci(int x,int y)//method  overloading:same method name with different parameters.
    {
        int add=x+y;
        System.out.println("addition is:"+ add);
        this.calci();//calling method in method using this keyword;
        
    }
}
public class This {
    public static void main(String[] args) {
        A obj=new A(10, 100);
        obj.calci();
        obj.calci(100, 200);
    }
}//this keyword uses:
/*
 * access current class instance variables;
 * access current class methods;
 * it can call current class constructors;
 * it can be passed as an argument;
 * it can be used to return the current;
 */