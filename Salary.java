// Take input of a salary, if the salary is greater than 10,000 add bonus as 2,000, otherwise add bonus as 1,000.

import java.util.Scanner;

public class Salary{
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Enter the old salary: ");
        
        int sal = input.nextInt();
        if (sal > 10000) {
            int s1 = sal + 2000;
            System.out.println("Updated Salary is: " + s1 );
        }
        else{
            System.out.println("Updated Salary is: " + (sal + 1000));
        }
    }       
}