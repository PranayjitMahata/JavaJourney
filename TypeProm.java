public class TypeProm {
    public static void main(String[] args) {
        
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 5006;
        float f = 5.76f;
        double d = 0.1234;

        double res = (f * b) + (i / c) + (d * s);
        System.out.println((f * b) + "" + (i / c) + "" + (d * s));
        
        System.out.println(res);
    }
    
}
