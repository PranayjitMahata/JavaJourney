import java.util.Scanner;

public class TempConv {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.print("Tempareture on Celsius:");

        float temC = in.nextFloat();
        float temF = ((temC * 9) / 5) + 32;
        System.out.println(temC + " Celsius = " + temF + " Fahrenheit");
    }
}
