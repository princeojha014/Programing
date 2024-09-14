import java.util.*;
public class FibonacciNumbers {
    public static void main (String[] args)
    {
         Scanner input = new Scanner(System.in);
         System.out.print("Enter Your N : ");
         int n = input.nextInt();
         int a =0;
         int b =1;
         int count =2;

         while (count <= n)
         {
            int temp = b;
            b = b +a;
            a =temp;
            count++;
         }
         System.out.println("Your Fibonacci Number is : " +b);

    }
}