import java.util.Scanner;
public class methodoverloading
{
    public int addition(int a,int b)
    {
        return a+b;
    }
    public double addition(int a,int b,int c)
    {
        return a+b+c;
    }
    public double addition(double a,double b,double c)
    {
        return a+b+c;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        methodoverloading m=new methodoverloading();
        System.out.println("Addition of two num is " +m.addition(6,7));
        System.out.println("Addition of three num is " + m.addition(5,7,7));
        System.out.println("Addition of two num is " + m.addition(6.2,7.4,6.2));

    }
}
