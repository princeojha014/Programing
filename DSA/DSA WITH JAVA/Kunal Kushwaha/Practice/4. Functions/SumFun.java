import java.util.Scanner;

public class SumFun 
{
    public static void main(String[] args) 
    {  
        int ans = sum();
    }
    
    static int sum()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        int n1 = input.nextInt();
        System.out.print("Enter 2nd Number : ");
        int n2 = input.nextInt();
        int sum = n1+n2;
        return sum;
    }
    
    /*static void sum()
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter 1st Number : ");
            int n1 = input.nextInt();
            System.out.print("Enter 2nd Number : ");
            int n2 = input.nextInt();
            int sum = n1+n2;
            System.out.println("Sum of digits are " +sum);
        }*/
}     
