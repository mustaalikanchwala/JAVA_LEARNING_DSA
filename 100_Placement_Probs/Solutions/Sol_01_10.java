import java.util.*;

public class Sol_01_10 {
    // Sol 01
    // public static void main(String s[]){
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the Size of Array");
    // int size = sc.nextInt();
    // int arr[] = new int[size];
    // System.out.println("Enter Array Elements");
    // int sum = 0;
    // for(int i = 0; i<size;i++){
    // arr[i]=sc.nextInt();
    // }
    // for(int i = 0;i<arr.length;i++){
    // if(arr[i]%2==0){
    // sum = sum+arr[i];
    // }
    // }
    // System.out.println("Sum of Even no. in Array is : "+sum);
    // }

    // Sol 02

    // public static void main(String a []){
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter String");
    // String s = sc.next();
    // int n = s.length();
    // int k = s.length()-1;
    // for(int i = 0;i<n/2;i++){
    // if(s.charAt(i)==s.charAt(k)){
    // k--;
    // }else{
    // System.out.println("String is Not Palindrome");
    // return;
    // }
    // }
    // System.out.println("String is palindrome");
    // }

    // Sol 03
    // In general:
    // If

    // java
    // Copy
    // Edit
    // A mod B = 0
    // then B is a factor of A.

    // Example:

    // 20 mod 5 = 0 → 5 is a factor of 20

    // 21 mod 4 = 1 → 4 is not a factor of 21 (because remainder ≠ 0)

    // public static int[] factor(int n){
    // int fact[] = new int[n];
    // int j = 0;
    // for(int i = 1; i<=n;i++){
    // if(n%i==0){
    // fact[j]=i;
    // j++;
    // }
    // }
    // return Arrays.copyOf(fact,j);
    // }
    // public static void main(String s []){
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number to find factor of it ");
    // int n = sc.nextInt();
    // System.out.println("Factors of "+n+" is : "+Arrays.toString(factor(n)));
    // }

    // Sol 04

    // public static int factorial(int n){
    // int fact = 1;
    // for(int i = 1;i<=n;i++ ){
    // fact = fact *i;
    // }
    // return fact;
    // }
    // public static void main(String a[]){
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number for factorial");
    // int n = sc.nextInt();
    // System.out.println("The factorial of "+n+" is : "+factorial(n));
    // }

    // Sol 05

    // The summation of the digits of a number is found by adding each digit of the
    // number together. For example, the sum of the digits of the number 123 is 1 +
    // 2 + 3 = 6.
    // to take last digit of number.
    // | `num` | `num % 10` | Last digit |
    // | ----- | ---------- | ---------- |
    // | 1234 | 4 | 4 |
    // | 980 | 0 | 0 |
    // | 7 | 7 | 7 |

    // to remove last digit of number.
    // | Step | `firstDigit` | Condition `>=10` | New value after `/10` |
    // | ---- | ------------ | ---------------- | --------------------- |
    // | 1 | 9876 | true | 987 |
    // | 2 | 987 | true | 98 |
    // | 3 | 98 | true | 9 |
    // | 4 | 9 | false | loop ends |

    // public static int summation(int n ){
    // int result = 0;
    // int lastDigit;
    // while(0<n){
    // lastDigit = n%10;
    // n= n/10;
    // result = (result+lastDigit);
    // }
    // return result;
    // }
    // public static void main(String s[]){
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter number for summation of digit");
    // int n = sc.nextInt();
    // System.out.println("The Summation of "+n+" is : "+summation(n));
    // }

    // Sol 06

    // public static void main(String s[]){
    // for(int i = 1; i<=4;i++){
    // for(int j = 1;j<=i;j++){
    // System.out.print(j+" ");
    // }
    // System.out.println();
    // }
    // }

    // Sol 07

    // public static int[] fabonacci(int n) {
    //     int a = 0;
    //     int b = 1;
    //     int fab[] = new int[n];
    //     fab[0] = a;
    //     if (n > 1) {
    //         for (int i = 1; i < n; i++) { // here i is index of fab array  
    //             fab[i]=b; // here first at index 1 2nd term will store simmilarly at index 4 5 term will store.
    //             int temp = b;
    //             b = a + b;
    //             a = temp;
    //         }
    //     }
    //     return fab;
    // }

    // public static void main(String s[]) {
    //     System.out.println("Enter terrm to print faboncci  ");
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     System.out.println("Fabonacci sereis : "+Arrays.toString(fabonacci(n)));

    // }

    //  Sol 08

    // public static int EvenDigits(int n){
    //     int lastDigit;
    //     int evendigits = 0;
    //     while (n>0) {
    //         lastDigit = n%10;
    //         n= n/10;
    //          if(lastDigit%2==0){
    //             evendigits++;
    //         }
    //     }
    //     return evendigits;
    // }
    // public static int OddDigits(int n){
    //     int lastDigit;
    //     int odddigits = 0;
    //     while(n>0){
    //         lastDigit = n%10;
    //         n=n/10;
    //         if(lastDigit%2!=0){
    //             odddigits++;
    //         }
    //     }
    //     return odddigits;
    // }

    // public static void main(String s[]){
    //     Scanner sc =  new Scanner(System.in);
    //     System.out.println("Enter a number to count even and odd digit");
    //     int n = sc.nextInt();
    //     System.out.println("The no. of Even Digits are : "+EvenDigits(n));
    //     System.out.println("The no. of Odd Digits are : "+OddDigits(n));
    // }


//     //   Sol 09

// //  Using bitwise topic is remaining

// // Sol 10 

// // When dividing a prime number by any other number, the remainder will always be non-zero, unless dividing by 1 or the prime number itself, the remainder is 0, otherwise it is non-zero. 

// // ✅ Example: is 29 a prime?
// // √29 ≈ 5.38, so we check only i = 2 to 5

// // Check if 29 is divisible by 2, 3, 4, or 5

// // It's not → so 29 is prime

// // If we had checked all the way to 28, it would waste time.


// // 🔍 Square root se check kyun karte hain?
// // Chaliye example se samjhte hain.

// // 🧪 Example: 36 ke factors kya hain?
// // 1 × 36

// // 2 × 18

// // 3 × 12

// // 4 × 9

// // 6 × 6

// // Ab dekho:

// // 2 ke saath 18 aaya

// // 3 ke saath 12

// // 4 ke saath 9

// // 6 ke saath 6

// // Matlab: Jab ek bada factor aata hai, uska chhota bhai pehle mil chuka hota hai 😄

// // ✅ Isliye kya karte hain?
// // Agar aap check kar rahe ho ki koi number prime hai ya nahi, toh:

// // Aapko sirf 2 se leke square root tak hi check karna padta hai.

// // Uske baad wale factors already covered hote hain.

// public static boolean iSprime(int num){
//     if(num<=1) return false;
// //     ✅ Why start with 2?
// // Because:

// // Prime numbers are numbers that have only two factors: 1 and itself

// // So, if any number between 2 and √num divides it, that means it's not prime

// // 2 is the smallest possible divisor (other than 1)
//     for(int i = 2;i<=Math.sqrt(num);i++){
//         if(num%i==0){  
// //             | Expression     | Meaning                         |
// // | -------------- | ------------------------------- |
// // | `num % i == 0` | `i` divides `num` completely ✅  |
// // | `num % i != 0` | `i` does **not** divide `num` ❌ |

//             return false; // not prime;
//         }
//     }
//     return true;
//     }

// public static void main(String s[]){
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter Starting range : ");
//     int start = sc.nextInt();
//     System.out.print("Enter Ending range : ");
//     int end = sc.nextInt();
//     for(int i = start;i<=end;i++){
//         if(iSprime(i)){
//             System.out.print(i+" "); // to print prime numbers
//         }
//     }

// }

}