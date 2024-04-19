import java.util.Scanner;

public class Inputs{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int roll = input.nextInt();
        System.out.print("Your roll number is: " + roll);
    }
}