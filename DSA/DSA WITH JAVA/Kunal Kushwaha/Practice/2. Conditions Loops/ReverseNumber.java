import java.util.*;
public class ReverseNumber
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number : ");
        int n = input.nextInt();
        int ans = 0;
        while ( n > 0 )
        {
            int rem = n%10;
            n = n/10;
            ans = ans*10+rem;
        }
        System.out.println("Your Reversed Number Is  : " +ans);
    }
    
}
