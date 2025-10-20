
public class exception {
    public static void main(String[] args) {
        int a  = 10;
        int result1 = a/3;
        System.out.println("Done");
        int result = a/0; // after this exception the below code will not excute 
        System.out.println("Done");
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
        // at Exception.main(Exception.java:5)
    }
}
