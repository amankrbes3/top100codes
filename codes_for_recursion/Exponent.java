package codes_for_recursion;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base :");
        int base = scan.nextInt();
        System.out.print("Enter Power : ");
        int power = scan.nextInt();
        System.out.println(base+" to the power "+power+" : "+getPower(base, power));
        scan.close();
    }
    //Method-1 Brute-Force Approach
    public static int getPower(int base,int power){
        int result = 1;
        if(power == 0){
            return result;
        }
        for(int i=0;i<power;i++){
            result = result * base ;
        }
        return result;
    }
}
