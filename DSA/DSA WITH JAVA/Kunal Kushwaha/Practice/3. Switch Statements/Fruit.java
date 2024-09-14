import java.util.*;
public class Fruit 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fruit Name : ");
        String fruit = input.nextLine();

        switch (fruit)
        {
            case "Mango":
            System.out.println("King Of Fruits");
            break;
            
            case "Apple":
            System.out.println("A Sweet Red Fruit");
            break;
        }
    }
}
