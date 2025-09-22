import java.util.*;
public class Sol_11_15 {

//  Sol 11

//     An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits. In other words, if a number has n digits, it's an Armstrong number if the sum of the nth power of each digit equals the original number. 
// For example: 
// 153: is an Armstrong number because 1³ + 5³ + 3³ = 1 + 125 + 27 = 153.
// 370: is also an Armstrong number because 3³ + 7³ + 0³ = 27 + 343 + 0 = 370.

// public static boolean isArmstrong(int nums){
//     int lastdigit;
//     int count = 0;
//     int temp = nums; 
//     int originalnums = nums;
//     while(temp>0){
//         temp = temp/10;
//         count++;
//     }
// int sum=1;
// int result = 0;
//     while(nums>0){
//         lastdigit=nums%10;
//         nums= nums/10;
//         for(int i = 1;i<=count;i++){
//            sum = sum*lastdigit;
//         }
//         result = result+sum;
//         sum = 1;
//     }
//     if(result == originalnums){
//         return true;
//     }
//     return false;
// }
// public static void main(String s[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("enter a nums to check Armstrong : ");
//     int nums = sc.nextInt();
// if(isArmstrong(nums)){
//     System.out.println("The number is armstrong");
// }else{System.out.println("The number is not Armstrong");}

// }


//   Sol 12

//    public static void main(String s[]){
//     Scanner sc = new Scanner(System.in);
//     int Avg;
//     int sum = 0;
//     System.out.println("Enter for how many value to enter : ");
//     int n = sc.nextInt();
//     int Max = Integer.MIN_VALUE;
//     int Min = Integer.MAX_VALUE;
//    int nums;
//    System.out.println("Enter nums : ");
//    for(int  i = 1; i<=n;i++){
//      nums = sc.nextInt();
//        if(Max<nums){
//            Max=nums;
//         }
//         if(Min>nums){
//             Min = nums;
//         }
//         sum = sum + nums;
//     } 
     
//  Avg = sum/n;
//  System.out.println("Avg is : "+Avg);
//  System.out.println("Max is : "+Max);
//  System.out.println("Min is : "+Min);

//    }


//  Sol 13

// | Part                  | Meaning                                                               |
// | --------------------- | --------------------------------------------------------------------- |
// | `i`                   | Current row of matrix 1 (m1) and result matrix (m3)                   |
// | `j`                   | Current column of matrix 2 (m2) and result matrix (m3)                |
// | `k` (in loop)         | Index to move across columns of m1 and rows of m2                     |
// | `m1[i][k]`            | k-th element in row `i` of matrix 1                                   |
// | `m2[k][j]`            | k-th element in column `j` of matrix 2                                |
// | `m1[i][k] * m2[k][j]` | Multiply elements and accumulate the total                            |
// | `+=`                  | Keep adding the product for each `k` to build the final value in `m3` |


// ✅ Matrix Multiplication Formula:
// C[i][j] = A[i][k]*B[k][j] + A[i][k+1]*B[k+1][j]

// int[][] A = {
//     {1, 2},
//     {3, 4}
// };

// int[][] B = {
//     {5, 6},
//     {7, 8}
// };

// int[][] C = new int[2][2]; // result matrix

// 🧮 Dry Run (step-by-step):
// 1. C[0][0] = A[0][0] * B[0][0] + A[0][1] * B[1][0]
// = 1×5 + 2×7 = 5 + 14 = 19

// 2. C[0][1] = A[0][0] * B[0][1] + A[0][1] * B[1][1]
// = 1×6 + 2×8 = 6 + 16 = 22

// 3. C[1][0] = A[1][0] * B[0][0] + A[1][1] * B[1][0]
// = 3×5 + 4×7 = 15 + 28 = 43

// 4. C[1][1] = A[1][0] * B[0][1] + A[1][1] * B[1][1]
// = 3×6 + 4×8 = 18 + 32 = 50

// public static int[][] Matrix(int[][] m1,int[][] m2){
//     int[][] m3 = new int[m1.length][m2[0].length];
//     if(m1.length == m2[0].length){
//     for(int i = 0;i<m1.length;i++){
//         for(int j = 0 ; j<m2[0].length;j++){
//          m3[i][j] = 0;
//          for(int k = 0; k<m1.length;k++){
//      m3[i][j] += m1[i][k]*m2[k][j]; 
//          }
//         }
//     }
// }
//     return m3;
// }
// public static void main(String s []){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the size of row for matrix  : ");
//     int rows = sc.nextInt();
//     System.out.println("Enter the Size of col for matrix  : ");
//     int col = sc.nextInt();
//     int m1[][] = new int[rows][col];
//     int m2[][] = new int[rows][col];
//     System.out.println("Enter The elements for M1");
//     for(int i = 0; i<rows;i++){
//         for(int j = 0;j<col;j++){
//         m1[i][j] = sc.nextInt();
//         }
//     }
//     System.out.println("Enter The elements for M2");
//     for(int i = 0; i<rows;i++){
//         for(int j = 0;j<col;j++){
//         m2[i][j] = sc.nextInt();
//         }
//     }
//     System.out.println("The Multiplication of matrix is : "+Arrays.deepToString(Matrix(m1, m2)));
// }


//   Sol  14

// The angle between the hour and minute hands is calculated using the formula |(30h - 5.5m)|. Explanation: Using |(30 × 3 - 5.5 × 30)| = |90 - 165| = 75 degrees, we find the angle between the hands.


// public static double AngleBtw_Hour_Minu(int hour, int minute){
//     double degrees;
//     if(hour>=1 && minute>=0){
//       degrees = (30*hour-5.5*minute);
//       return degrees;
//     }
//     return 0.0;
// }
// public static void main(String s[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter hour");
//     int hour = sc.nextInt();
//     System.out.println("Enter minute");
//     int minute = sc.nextInt();
//     double degrees = AngleBtw_Hour_Minu(hour, minute);
//     if(degrees==0.0){
//         System.out.println("Invalid Hour Or minute ");
//         return;
//     } 
//     if(degrees<0){
//         degrees = degrees*-1;
//     }
//     System.out.println("The Angle between hour and minute is : "+degrees+" degrees");
// }

//   Sol 15

// BCD or binary-coded decimal is a special kind of representation of a decimal number in binary numbers


// | Decimal Digit | BCD Code (4-bit Binary) |
// | ------------- | ----------------------- |
// | 0             | 0000                    |
// | 1             | 0001                    |
// | 2             | 0010                    |
// | 3             | 0011                    |
// | 4             | 0100                    |
// | 5             | 0101                    |
// | 6             | 0110                    |
// | 7             | 0111                    |
// | 8             | 1000                    |
// | 9             | 1001                    |

// . return 0000 (etc.) is not valid in Java.
// 0000 is treated as an octal number (starts with 0) and all of them (0000, 0001, 0010, etc.) are just integers, not binary or strings.

// Also, you can't return a binary like 0001 as an int and expect to preserve leading 0s
//  so i change the type of BCD function form int to String;
// public static String BCD(int digit){
//     if(digit == 0) return "0000";
//     else if(digit==1) return "0001";
//     else if(digit==2) return "0010";
//     else if(digit==3) return "0011";
//     else if(digit==4) return "0100";
//     else if(digit==5) return "0101";
//     else if(digit==6) return "0110";
//     else if(digit==7) return "0111";
//     else if(digit==8) return "1000";
//     else if(digit==9) return "1001";
//  return "";
// }
// public static StringBuilder Decimal_To_BCD(int num){
//     StringBuilder sb = new StringBuilder();
//     String numStr = String.valueOf(num);  // it converts number which we input from user to string
//    for(int i = 0 ;i<numStr.length();i++){
//     int digit = numStr.charAt(i)-'0'; 
// //     ✅ Why subtract '0'?
// // When you get a digit from a string like:
// // char ch = '5';
// // If you directly try to convert it to an integer:
// // int num = ch; // gives 53 (ASCII of '5'), NOT 5
// // But if you do:
// // int num = ch - '0';
// // You get:
// // '5' - '0' → 53 - 48 = 5 ✅
//     sb.append(BCD(digit)).append(" ");
//    }
   
//     return sb;
// }
// public static void main(String s []){
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter a number to Convert to BCD");
//     int num = sc.nextInt();
//     System.out.println("The BCD is : "+Decimal_To_BCD(num));

// }

}
