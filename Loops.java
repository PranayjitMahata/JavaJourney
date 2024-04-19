import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
    
        //Normal Way
        /*System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);*/




        //Using FOR Loop
        /*Scanner in = new Scanner (System.in);
        
        System.out.print("Upto what: ");
        int n = in.nextInt();
        for (int p = 1; p <= n; p++){
            System.out.println(p);
        }*/




        //Using WHILE Lopp
        /*int num = 1;
        while(num <= 5){
            System.out.println(num);
            num++;
        }*/


        //Using DO-WHILE Loop
        int n = 1;
        do{
            System.out.println(n); //at least one.
            n++;
        } while( n <= 5);

    
    }
    
}
