package Recursion.Recursion_03;
// Time Complextiy O(n!)
/*
================================================================================
                    STRING PERMUTATION ALGORITHM EXECUTION TRACE
                          printPrem("abc", "") - Step by Step
================================================================================

Call Level | str   | prem | i | currentChar | newstr | Action
-----------|-------|------|---|-------------|--------|-------------------------
Level 1    | "abc" | ""   | 0 | 'a'         | "bc"   | Call printPrem("bc", "a")
Level 2    | "bc"  | "a"  | 0 | 'b'         | "c"    | Call printPrem("c", "ab")
Level 3    | "c"   | "ab" | 0 | 'c'         | ""     | Call printPrem("", "abc")
Level 4    | ""    | "abc"| - | -           | -      | Print "abc" ✓

Level 2    | "bc"  | "a"  | 1 | 'c'         | "b"    | Call printPrem("b", "ac")
Level 3    | "b"   | "ac" | 0 | 'b'         | ""     | Call printPrem("", "acb")
Level 4    | ""    | "acb"| - | -           | -      | Print "acb" ✓

Level 1    | "abc" | ""   | 1 | 'b'         | "ac"   | Call printPrem("ac", "b")
Level 2    | "ac"  | "b"  | 0 | 'a'         | "c"    | Call printPrem("c", "ba")
Level 3    | "c"   | "ba" | 0 | 'c'         | ""     | Call printPrem("", "bac")
Level 4    | ""    | "bac"| - | -           | -      | Print "bac" ✓

Level 2    | "ac"  | "b"  | 1 | 'c'         | "a"    | Call printPrem("a", "bc")
Level 3    | "a"   | "bc" | 0 | 'a'         | ""     | Call printPrem("", "bca")
Level 4    | ""    | "bca"| - | -           | -      | Print "bca" ✓

Level 1    | "abc" | ""   | 2 | 'c'         | "ab"   | Call printPrem("ab", "c")
Level 2    | "ab"  | "c"  | 0 | 'a'         | "b"    | Call printPrem("b", "ca")
Level 3    | "b"   | "ca" | 0 | 'b'         | ""     | Call printPrem("", "cab")
Level 4    | ""    | "cab"| - | -           | -      | Print "cab" ✓

Level 2    | "ab"  | "c"  | 1 | 'b'         | "a"    | Call printPrem("a", "cb")
Level 3    | "a"   | "cb" | 0 | 'a'         | ""     | Call printPrem("", "cba")
Level 4    | ""    | "cba"| - | -           | -      | Print "cba" ✓

================================================================================
                              FINAL OUTPUT
================================================================================
1. abc
2. acb  
3. bac
4. bca
5. cab
6. cba

KEY INSIGHT: newstr = str.substring(0, i) + str.substring(i + 1)
This removes the character at index i while preserving all other characters,
enabling complete permutation generation through recursive backtracking.
================================================================================
*/
public class StringPermutaion{
    public static void printPrem(String str,String prem){
        if(str.length()==0){
            System.out.println(prem);
            return;
        }
        for(int i = 0 ; i<str.length();i++){
            
            char currentChar = str.charAt(i);
            String newstr = str.substring(0, i)+str.substring(i+1);
            printPrem(newstr, prem+currentChar);
        }
    }
    public static void main(String[] args) {
        printPrem("abc", "");
    }
} 