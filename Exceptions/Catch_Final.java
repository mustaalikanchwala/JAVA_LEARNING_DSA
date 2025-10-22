public class Catch_Final{
    public static void main(String[] args) {
        try {
        int result = 10 / 1; // it is ArithmeticException will go in first catch block 
        int [] arr = {1,2,3,4};
        System.out.println(arr[7]);  // This Index Out of bound Exception it will go in ArrayIndexOutOfBoundsException Actch block.   
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Occur "+e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occur "+e);
        } finally {
            System.out.println("ALWAYS EXCUTE");
            System.out.println("in Finally Block");
            System.out.println("Finally Block Will always Occur even if Exception is there or not");
    }
}
}