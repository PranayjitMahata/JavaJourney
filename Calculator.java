import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

    // Take input from user till user does not press 'x' or 'X'
        int ans= 0;
        while (true){
        // Take the operator as input
            System.out.print("What operation do you want to <+, -, *, /, %>: ");
            char op = in.next(). trim(). charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
            // Inout the two numbers
                System.out.print("Enter the two numbers (use <space> to sperate them): ");
                
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                } if (op == '-'){
                    ans = num1 - num2;
                } if (op == '*'){
                    ans = num1 * num2;
                } if (op == '/'){
                    if (num2 != 0){
                        ans = num1 / num2;
                    }
                } if (op == '%'){
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X'){
                break;
            } else{
                System.out.print("INVALID OPERATION! Try Again...");
            }
            System.out.println("Result = " + ans);
        }
    }
    
}
