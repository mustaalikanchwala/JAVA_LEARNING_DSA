package Recursion.REcursion_02;
import java.util.HashSet;

public class UniqueSubSequence {
    public static void uniqueSubS(String s, int i , String newS,HashSet<String> set){
          if(i==s.length()){
             if(set.contains(newS)){
              return;
             }else{
              System.out.println(newS);
              set.add(newS);
              return;
             }
          }

        char c = s.charAt(i);

        // to be 
        uniqueSubS(s,i+1,newS+c,set);

        // not to be
        uniqueSubS(s,i+1,newS,set);

    }
    public static void main(String[] args) {
      String a = "aaa";
      HashSet<String> set = new HashSet<>();
      uniqueSubS(a, 0, "",set);
    }
}

// Root: (0, "")  // Start, set empty
// ├── Include 'a' → (1, "a")
// │   ├── Include 'a' → (2, "aa")
// │   │   ├── Include 'a' → (3, "aaa") → Print "aaa" (new, add to set)
// │   │   └── Exclude → (3, "aa") → Print "aa" (new, add to set)
// │   └── Exclude → (2, "a")
// │       ├── Include 'a' → (3, "aa") → Skip ("aa" already in set)
// │       └── Exclude → (3, "a") → Print "a" (new, add to set)
// └── Exclude → (1, "")
//     ├── Include 'a' → (2, "a")  // Paths here lead to duplicates
//     │   ├── Include 'a' → (3, "aa") → Skip (duplicate)
//     │   └── Exclude → (3, "a") → Skip (duplicate)
//     └── Exclude → (2, "")
//         ├── Include 'a' → (3, "a") → Skip (duplicate)
//         └── Exclude → (3, "") → Print "" (new, add to set)

