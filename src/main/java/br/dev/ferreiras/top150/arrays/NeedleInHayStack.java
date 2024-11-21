package br.dev.ferreiras.top150.arrays;

/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, 
or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: 
"sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.

Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: 
"leeto" did not occur in "leetcode", so we return -1.
 
Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
 */
public class NeedleInHayStack {

  public static void main(String[] args) {
    String haystack = "hello";
    String needle = "ll";

    int index = findNeedleInHaystack(haystack, needle);
    System.out.println(index);
  }

  private static int findNeedleInHaystack(String haystack, String needle) {

    int size = haystack.length();
    int sizeNeedle = needle.length();
    String search;

    if(haystack.equals(needle)) return 0;
    for (int i = 0; i <= size - sizeNeedle; i++) {

      search = haystack.substring(i, i+sizeNeedle);
      if (search.equals(needle) ) {
        return haystack.indexOf(search);
      }
    }
    return -1;
  }



//    for (int i=0; i<=right-left; i++) {
//
//    if (needle.equals(haystack.substring(i, i+left))) {
//      return haystack.indexOf(needle);
//    }
//
//  }
//
//    return r;
//}
}
