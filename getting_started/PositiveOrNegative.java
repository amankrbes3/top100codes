package getting_started;

import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number :");
        int number = input.nextInt();
        System.out.println(isPositive(number)?"Positive":"Negative");
        input.close();
    } 
    
    public static boolean isPositive(int number){
        return number>0;
    }
}
