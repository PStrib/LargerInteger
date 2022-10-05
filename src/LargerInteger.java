import java.util.Scanner;
/**
 * Program to find the larger of two integers
 * @author Peter Stribblehill
 * @version 05/10/2022
 */
public class LargerInteger {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        System.out.println("Enter two integers seperated by one or more spaces");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("The larger integer is "+Math.max(a,b));
    }
}