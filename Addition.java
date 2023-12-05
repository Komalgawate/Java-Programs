import java.util.Scanner;
public class Addition
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int r,c;
        System.out.println("enter the element of rows\n");
        r=sc.nextInt();
        System.out.println("enter the element of column\n");
        c=sc.nextInt();
        int A[][]=new int[r][c];
        int B[][]=new int[r][c];
        int C[][]=new int[r][c];
        System.out.println("enter the element of Matrix A");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               A[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the element of Matrix B");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               A[i][j]=sc.nextInt();
            }
        }
        System.out.println("Addition of two matrix is");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
              C[i][j]=A[i][j]+B[i][j];
            }
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
               System.out.println(C[i][j]);
            }
            System.out.println("");
        }
    }
}
