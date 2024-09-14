import java.util.*;
public class AlphabetCaseCheck 
{
    public static void main (String[] args)
    {
        char ch;
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Alphabet : ");
        ch = input.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z')
        {
            System.out.print("LowerCase");
        }
        else if (ch >= 'A' && ch <= 'Z')
        {
            System.out.println("UpperCase");
        }
        else 
        {
            System.out.println("Invalid Entry ");
        }
    }
}
