import java.util.Scanner;

public class sum {
    public static void main(String[] args)
    {
        System.out.print("Enter 1st Number : ");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        System.out.print("Enter 2nd Number : ");
        int n2 = input.nextInt();
        int Sum = n1+n2;
        System.out.println("Sum Of Numbers Are :" +Sum);

    }
}
