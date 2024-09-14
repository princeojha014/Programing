import java.util.Scanner;
public class AreaOfCircle 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        int r = input.nextInt();
        double pi = 3.142;
        double area = (pi * r * r);
        System.out.println("Area of a circle is :  " +area);
    }
}
