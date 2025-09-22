package Recursion.Recursion_01;
// For Stack Height n
public class XtoPow_n {
    public static void xtopow_n(int x,int n,int temp) {
        if(n==0){
            System.out.println(temp);
            return;
        }
              temp = temp *x;
              xtopow_n(x, n-1, temp);
    }

    // call Stack for n
//     calPow(2, 5) → waits for calPow(2, 4)
//   calPow(2, 4) → waits for calPow(2, 3)
//     calPow(2, 3) → waits for calPow(2, 2)
//       calPow(2, 2) → waits for calPow(2, 1)
//         calPow(2, 1) → waits for calPow(2, 0)
//           calPow(2, 0) → returns 1
//         calPow(2, 1) → 2 × 1 = 2
//       calPow(2, 2) → 2 × 2 = 4
//     calPow(2, 3) → 2 × 4 = 8
//   calPow(2, 4) → 2 × 8 = 16
// calPow(2, 5) → 2 × 16 = 32

    public static int calPow(int x, int n){
        if(n==0) return 1;
        if(x==0) return 0;
        int xtopownm1 = calPow(x, n-1);
        int xtopown = x*xtopownm1;
        return xtopown;
    }
    //   Call Stack for logn
//      CalPow(2, 5) → calls CalPow(2, 2)
//   CalPow(2, 2) → calls CalPow(2, 1)
//     CalPow(2, 1) → calls CalPow(2, 0)
//       CalPow(2, 0) → returns 1
//     CalPow(2, 1) → 1 × 1 × 2 = 2
//   CalPow(2, 2) → 2 × 2 = 4
// CalPow(2, 5) → 4 × 4 × 2 = 32

    // For Stack Height logn
    public static int CalPow(int x, int n){
        if(n==0) return 1;
        if(x==0) return 0;
        int half = CalPow(x, n/2);
        // If n i even
        if(n%2==0){
             return half*half;
        }else{ // if n is odd 
            return half*half*x;
        }

    }

    public static void main(String s []){
   xtopow_n(2, 2, 1);
  System.out.println( calPow(2, 2));
  System.out.println(CalPow(2, 4));
    }
}
