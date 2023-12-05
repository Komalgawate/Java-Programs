import java.util.Scanner;
public class largestArray 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        int i;

        // Remove the semicolon at the end of the following line
        for (i = 0; i < arr.length; i++) {
            System.out.println("Enter the array element");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println("Maximum Number of Array: " + max);
    }
}
