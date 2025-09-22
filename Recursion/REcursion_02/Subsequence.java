package Recursion.REcursion_02;
public class Subsequence {
    public static void subsequence(String s,int i,String news){
      if(i==s.length()){
        System.out.println(news);
        return;
      }
        char c = s.charAt(i);

        // to be 
        subsequence(s, i+1 , news+c);
        // not to be 
        subsequence(s, i+1, news);
    }
    public static void main(String[] args) {
        subsequence("abc", 0, "");
    }
}



// Root: subsequence("abc", 0, "")  // Stack: [this call]
// ├── Include 'a': subsequence("abc", 1, "a")  // Stack: [root, this]
// │   ├── Include 'b': subsequence("abc", 2, "ab")  // Stack: [root, prev, this]
// │   │   ├── Include 'c': subsequence("abc", 3, "abc") → Print "abc" (base), pop
// │   │   └── Exclude 'c': subsequence("abc", 3, "ab") → Print "ab" (base), pop
// │   └── Exclude 'b': subsequence("abc", 2, "a")  // Stack: [root, prev, this]
// │       ├── Include 'c': subsequence("abc", 3, "ac") → Print "ac" (base), pop
// │       └── Exclude 'c': subsequence("abc", 3, "a") → Print "a" (base), pop
// └── Exclude 'a': subsequence("abc", 1, "")  // Stack: [root, this]
//     ├── Include 'b': subsequence("abc", 2, "b")  // Stack: [root, prev, this]
//     │   ├── Include 'c': subsequence("abc", 3, "bc") → Print "bc" (base), pop
//     │   └── Exclude 'c': subsequence("abc", 3, "b") → Print "b" (base), pop
//     └── Exclude 'b': subsequence("abc", 2, "")  // Stack: [root, prev, this]
//         ├── Include 'c': subsequence("abc", 3, "c") → Print "c" (base), pop
//         └── Exclude 'c': subsequence("abc", 3, "") → Print "" (base), pop
