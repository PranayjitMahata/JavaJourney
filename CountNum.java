import java.util.Scanner;

public class CountNum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Number:");

        int n = in.nextInt();
        int count = 0;
        while(n > 0){
            int rem = n % 10; //last digit
            if(rem == 5){
                count++;
            }
            n = n / 10;
        }
        System.out.print(count);
    }
    
}
