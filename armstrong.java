import java.util.Scanner;
public class armstrong
{
    public static void main(String[] agrg)
    {
        int temp,sum=0,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num=sc.nextInt();
        temp=num;
        while(num>0)
        {
            r=num%10;
            sum=sum+(r*r*r);
            num=num/10;
        }
        if(sum==temp)
        {
            System.out.println("number is armstrong ");
        }
        else
        {
            System.out.println("number is not armstrong ");
        }
     }
}

