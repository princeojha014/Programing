import java.util.Scanner;

public class LargestNumber 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int n1 = input.nextInt();
        System.out.print("Enter 2nd Number : ");
        int n2 = input.nextInt();
        if (n1>n2) 
        {
            System.out.print("Largest Number Is  : " +n1);             
        }
        else if (n2>n1) 
        {
            System.out.print("Largest Number Is  : " +n2);             
        }
        else if (n1==n2) 
        {
            System.out.print("Both Are Same Numbers :");             
        }
    }
}
