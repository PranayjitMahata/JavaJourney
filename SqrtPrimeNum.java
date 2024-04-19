// Input a number & print whether it is prime or not. [ used: c < sqrt(num)]

import java.util.Scanner;

public class SqrtPrimeNum{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Number: ");
        int n = input.nextInt();
        if (n <= 1){
            System.out.println("Neither Prime nor Composite!");

        int c = 2;

        while (c * c <= n){
            if (n % c == 0) {
                System.out.println("Not PRIME !!");   
            }
            c += 1;
        }
        System.out.println("The Number is PRIME.");
        }
    }
}