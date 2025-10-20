
public class ExceptionHandeling {
    public static void main(String[] args) {
        // int result = a/0;
        // System.out.println("Dome");

        // try-catch block format
        try {
            // exception genrating statements 
            // critical Statement
            // int result = 10/0;
            int result = 10/2;
            // write the code that will generate the exception ,in try block because if 
            // exception genrate after that no line of code will excute 
        } catch (Exception e) {
            // exception Handeling Statement
            System.out.println("IN CATCH BLOCK");
            System.out.println("Error In Calculation : "+ e);
        }
        System.out.println("DONE");
        int[] arr = {1,2,3};
        try {
            System.out.println(arr[9]);
        } catch (Exception e) {
            System.out.println("Exception Occur : "+e);
        }
        System.out.println("DONE");
    }
}
