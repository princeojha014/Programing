import java.util.Scanner;

public class Operator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number : ");
        float n1 = input.nextFloat();
        System.out.print("Enter 2nd Number : ");
        float n2 = input.nextFloat();
        System.out.print("Enter Your Operator (+, -, *, /) : ");
        char op = input.next().charAt(0);
        if(op == '+')
        {
            float add = n1 + n2;
            System.out.print("Addition Of Numbers Are :  " +add);
        }
        else if(op == '-')
        {
            float sub = n1 - n2;
            System.out.print("Substraction Of Numbers Are :  " +sub);
        }
        else if(op == '*')
        {
            float mul = n1 * n2;
            System.out.print("Multilplication Of Numbers Are :  " +mul);
        }
        else if(op == '/')
        {
            float div = n1 / n2;
            System.out.print("Division Of Numbers Are :  " +div);
        }
        else
        {
            System.out.println("Invalid Entry");
        }
    }
}
