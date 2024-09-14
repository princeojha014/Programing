import java.util.Scanner;

public class Temprature {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temprature In C : ");
        float temprature = input.nextFloat(); 
        float tempf = (temprature* 9/5) + 32 ;
        System.out.println("Temparature In F : " +tempf);
    }
}
