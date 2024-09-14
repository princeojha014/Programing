import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args)
{
    System.out.print("Enter Your Number : ");
    Scanner input = new Scanner(System.in);
    int number = input.nextInt();
    if(number%2 == 0)
    {
        System.out.println("Its An Even Number " );
    }
    else
    {
        System.out.println("Its An Odd Number " );
    }
}
}