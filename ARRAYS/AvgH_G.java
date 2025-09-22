package ARRAYS;
import java.util.*;
public class AvgH_G {
    public static void main(String abs[]){
        System.out.println("Enter the size of Array ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        double Asum=0,Gsum=1,Hsum=0;
        for(int i =0; i<n;i++){
         Asum=Asum+array[i];
         Gsum = Gsum*array[i];
         Hsum = Hsum+(1.0/array[i]);
        }
        double Aresult = Asum/n;
        double Hresult = n/Hsum;
        double Gresult = Math.pow(Gsum,1.0/n);
        System.out.println("Average of array elements is : "+Aresult);
        System.out.println("Geometric mean of array elements is : "+Gresult);
        System.out.println("Harmoni mean of array elements is : "+Hresult);

    }
}
