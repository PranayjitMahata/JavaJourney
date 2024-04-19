import java.util.Scanner;

public class LargNum {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);

        System.out.print("Enter the First number:");
        int a = in.nextInt();

        System.out.print("Enter the Second number:");
        int b = in.nextInt();

        System.out.print("Enter the Third number:");
        int c = in.nextInt();

        /*int max = a;
        if(b > max){
            max = b;
        } if(c > max){
            max = c;
        }
        System.out.print("The Max Number is :" + max);*/



        //Another Way
        /*int max = 0 ;
        if (a>b){
            max = a;
        } else{
            max = b;
        }
        if (c>max){
            max = c;
        }
        System.out.print("Largest Number is: " + max);*/




        //OPTIMIZING
        int max = Math.max(c, Math.max(a, b));
        System.out.print("The Maximum Number is: " + max);
    }
}
