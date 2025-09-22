package Functions;

import java.util.Scanner;

public class PrimeNums {
     //   Sol 09

//  Using bitwise topic is remaining

// Sol 10 

// When dividing a prime number by any other number, the remainder will always be non-zero, unless dividing by 1 or the prime number itself, the remainder is 0, otherwise it is non-zero. 

// ✅ Example: is 29 a prime?
// √29 ≈ 5.38, so we check only i = 2 to 5

// Check if 29 is divisible by 2, 3, 4, or 5

// It's not → so 29 is prime

// If we had checked all the way to 28, it would waste time.


// 🔍 Square root se check kyun karte hain?
// Chaliye example se samjhte hain.

// 🧪 Example: 36 ke factors kya hain?
// 1 × 36

// 2 × 18

// 3 × 12

// 4 × 9

// 6 × 6

// Ab dekho:

// 2 ke saath 18 aaya

// 3 ke saath 12

// 4 ke saath 9

// 6 ke saath 6

// Matlab: Jab ek bada factor aata hai, uska chhota bhai pehle mil chuka hota hai 😄

// ✅ Isliye kya karte hain?
// Agar aap check kar rahe ho ki koi number prime hai ya nahi, toh:

// Aapko sirf 2 se leke square root tak hi check karna padta hai.

// Uske baad wale factors already covered hote hain.

public static boolean iSprime(int num){
    if(num<=1) return false;
//     ✅ Why start with 2?
// Because:

// Prime numbers are numbers that have only two factors: 1 and itself

// So, if any number between 2 and √num divides it, that means it's not prime

// 2 is the smallest possible divisor (other than 1)
    for(int i = 2;i<=Math.sqrt(num);i++){
        if(num%i==0){
//         |     Expression | Meaning                          |
//         | -------------- | -------------------------------  |
//         | `num % i == 0` | `i` divides `num` completely ✅  |
//         | `num % i != 0` | `i` does **not** divide `num` ❌ |

            return false; // not prime;
        }
    }
    return true;
    }

public static void main(String s[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Starting range : ");
    int start = sc.nextInt();
    System.out.print("Enter Ending range : ");
    int end = sc.nextInt();
    for(int i = start;i<=end;i++){
        if(iSprime(i)){
            System.out.print(i+" "); // to print prime numbers
        }
    }

}
}
