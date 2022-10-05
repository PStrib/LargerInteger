import java.util.Scanner;
/**
 * Program to find the larger of two integers
 * @author Peter Stribblehill
 * @version 05/10/2022
 */
public class LargerDouble {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println("Enter two double precision numbers seperated by one or more spaces");
        double a=scan.nextDouble();
        double b=scan.nextDouble();
        System.out.println("The larger double is "+Math.max(a,b));
    }
}