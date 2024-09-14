import java.util.Scanner;

public class SimpleInterest 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Principal Ammount : ");
        float Principal= input.nextFloat();
        System.out.print("Enter Time In Yers : ");
        float Time = input.nextFloat();
        System.out.print("Enter Rate Of Interest : ");
        float Rate = input.nextFloat();
        float Si = (Principal * Rate * Time) / 100;
        System.out.print("Your Simple Intrest Is : " +Si);
    }
}
