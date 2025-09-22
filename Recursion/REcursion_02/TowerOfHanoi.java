package Recursion.REcursion_02;
public class TowerOfHanoi {
    public static void towerofhanoi(int n, String src,String helper,String dest){
        if(n==1){
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerofhanoi(n-1, src, dest, helper);
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        towerofhanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        towerofhanoi(3, "S", "H", "D");
    }
}
// 🧱 Stack-Based Explanation
// We'll show:

// 🟩 = Current function call

// ↩️ = Returning (popping from stack)

// 🖨️ = Print action (moving a disk)

// 🟢 Initial Call:
// Call: towerofhanoi(3, S, H, D)
// To move 3 disks from S → D using H

// 🔁 Push onto stack:
// Call: towerofhanoi(3, S, H, D)
//   → Call: towerofhanoi(2, S, D, H)
//     → Call: towerofhanoi(1, S, H, D)
// ✅ Base case reached for n = 1:
//     → 🖨️ transfer disk 1 from S to D
//     ← Return from towerofhanoi(1, S, H, D)
// 🟦 Back to towerofhanoi(2, S, D, H)
//     → 🖨️ transfer disk 2 from S to H
//     → Call: towerofhanoi(1, D, S, H)
// ✅ Base case again:
//       → 🖨️ transfer disk 1 from D to H
//       ← Return from towerofhanoi(1, D, S, H)
// 🟦 Back to towerofhanoi(2, S, D, H)
//     ← Return from towerofhanoi(2, S, D, H)
// 🟩 Back to towerofhanoi(3, S, H, D)
//   → 🖨️ transfer disk 3 from S to D
//   → Call: towerofhanoi(2, H, S, D)
//     → Call: towerofhanoi(1, H, D, S)
// ✅ Base case:
//       → 🖨️ transfer disk 1 from H to S
//       ← Return from towerofhanoi(1, H, D, S)
// 🟦 Back to towerofhanoi(2, H, S, D)
//     → 🖨️ transfer disk 2 from H to D
//     → Call: towerofhanoi(1, S, H, D)
// ✅ Base case:
//       → 🖨️ transfer disk 1 from S to D
//       ← Return from towerofhanoi(1, S, H, D)
// ✅ All Done
//     ← Return from towerofhanoi(2, H, S, D)
//   ← Return from towerofhanoi(3, S, H, D)
// 🧾 Final Output (Prints in order):
// transfer disk 1 from S to D
// transfer disk 2 from S to H
// transfer disk 1 from D to H
// transfer disk 3 from S to D
// transfer disk 1 from H to S
// transfer disk 2 from H to D
// transfer disk 1 from S to D
