package br.dev.ferreiras.top150.arrays;

import java.util.Arrays;

/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation:
There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.

 */
public class LongestPrefix {

  public static void main(String[] args) {
    String[] strings = {"flower","flow","flight"};

    String longest = longestCommonPrefix(strings);
    System.out.println(longest);
  }

  private static String longestCommonPrefix(String[] strings) {
    Arrays.sort(strings);
    System.out.println(Arrays.toString(strings));
    String s1 = strings[0];
    String s2 = strings[strings.length-1];
    int idx = 0;
    while(idx < s1.length() && idx < s2.length()){
      if(s1.charAt(idx) == s2.charAt(idx)){
        idx++;
      } else {
        break;
      }
    }
    return s1.substring(0, idx);
  }

}
