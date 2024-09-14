import java.util.*;
public class AreaOfTrangle 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base Of A Trangle : ");
        double base= input.nextDouble();
        System.out.print("Enter Height Of A Trangle : ");
        double Height= input.nextDouble();
        double area =  0.5 * (base*Height);
        System.out.println("Area Of A Trangle Is :  " +area);
    }
}
