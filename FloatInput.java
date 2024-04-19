import java.util.Scanner;

public class FloatInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value:");
        
        float marks = input.nextFloat();
        System.out.println("Your marks is " + marks);
    }
    
}
