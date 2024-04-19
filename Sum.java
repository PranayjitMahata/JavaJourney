import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int num1 = input.nextInt();

        System.out.print("Enter the second number:");
        int num2 = input.nextInt();

        System.out.print("The sum of the two numbers is: " + (num1 + num2));
    }
    
}
