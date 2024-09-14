import java.util.*;
public class CountingOccurrences 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int n = input.nextInt();
        System.out.print("Enter Your Digit You Want To Find : ");
        int d = input.nextInt();
        int count = 0;
        while ( n > 0 )
        {
            int rem = n%10;
            if (rem == d)
            {
                count++;
            }
            n = n/10;
        }
        System.out.println("Number Of Digits Are : "+count);
    }
    
}
