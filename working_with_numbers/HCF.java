package working_with_numbers;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        System.out.println("Hcf is :"+new HCF().getHCF(firstNumber,secondNumber));
        sc.close();
    }

    //Method-1 Using Recursion;
    public int getHCF(int first, int second){
        if(second == 0){
            return first;
        }
        return getHCF(second , first % second);
    }
}
