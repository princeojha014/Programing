import java.util.Scanner;

public class Greeting 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter Your Name : ");
        Scanner input = new Scanner (System.in);
        String name = input.nextLine();
        System.out.print("Thank You " +name); 
        System.out.println (" For Entering Your Name ");
        
    }
}
