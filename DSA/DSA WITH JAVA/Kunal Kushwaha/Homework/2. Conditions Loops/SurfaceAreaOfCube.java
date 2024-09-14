import java.util.*;

public class SurfaceAreaOfCube 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Edge Of A Cube : ");
        int area = input.nextInt();
        int surfacearea = (6*area*area);
        System.out.println("Surface Area Of A Cube Is : " +surfacearea);
    }
    
}
