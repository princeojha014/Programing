/* For Loop


import java.util.Scanner;

public class Number 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter A Number  : ");
        int n = input.nextInt();
        for (int i=0; i<=n; i++)
        {
            System.out.println(i);
        }
    }

}
*/


/* While Loop

import java.util.Scanner;

public class Number 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter A Number  : ");
        int n = input.nextInt();
        int i=0;
        while(i<=n)
        {
            System.out.println(i);
            i = i+1;
        }
    }

}*/

//Do While Loop 
import java.util.Scanner;

public class Number 
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter A Number  : ");
        int n = input.nextInt();
        int i=0;
        do 
        {
            System.out.println(i);
            i=i+1;
        } while(i<=n);
}}