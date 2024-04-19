//Fibonacci Number: 0, 1, 1(0+1), 2(1+1), 3(1+2), 5(3+2), 8(5+3), 13(5+8),......,

import java.util.Scanner;

public class FiboNum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("_th Fibonacci Number? - ");

        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while(count <= n){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.print(b);
    }
}
