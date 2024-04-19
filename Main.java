import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        System.out.println("Hello World!");

        System.out.print("Write what you want to show:");

        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
    }
}