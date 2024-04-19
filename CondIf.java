public class CondIf {
    public static void main(String[] args) {
        int sal = 28555500;

        // if(sal > 10000){
        //     sal = sal + 2000;
        // } else {
        //     sal += 1000;
        // }
        // System.out.println(sal);
    
    

 // Multiple IF statements
 if (sal > 10000){
    sal += 2000;
 } else if (sal > 20000){
    sal += 3000;
 } else{
    sal += 1000;
 }
System.out.println(sal);
    }
}
