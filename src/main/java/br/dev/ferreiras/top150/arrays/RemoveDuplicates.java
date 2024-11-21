package br.dev.ferreiras.top150.arrays;

import java.util.*;

/*
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element
appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements
 in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present
in nums initially. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

The judge will test your solution with the following code:

int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
If all assertions pass, then your solution will be accepted.



Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).


Constraints:

1 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.
 */
public class RemoveDuplicates {

  public static void main(String[] args) {
    int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//    removeDuplicate(nums);
    removeDuplicates(nums);
    duplicatesRemoved(nums);

  }

  public static int removeDuplicate(int[] nums) {
    Map<Integer, Integer> map = new LinkedHashMap<>();
    int size = nums.length;
    for (int i = 0; i < size; i++) {
      map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
    }
    System.out.println(map);
    int k = 0;
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      nums[k] = entry.getKey();
      k++;
    }

    System.out.println(Arrays.toString(nums));
    return map.size();
  }

  public static int removeDuplicates(int[] nums) {

    Set<Integer> set = new HashSet<>();
    for (int num : nums) {
      set.add(num);
    }
    System.out.println(set.size());

    nums = new int[set.size()];
    System.out.println(Arrays.toString(nums));
    int count = 0;
    for (int s : set) {
      nums[count] = s;
      count++;

    }
    System.out.println(Arrays.toString(nums));
    return 1;
  }

  public static int duplicatesRemoved(int[] nums) {

    int size = nums.length;
    int j = 1;
    List<Integer> list = new ArrayList<>();

    for (int i = 1; i < size; i++) {

      if (nums[i] != nums[i - 1]) {
        nums[j] = nums[i];
        j++;
      }

    }
    int[] numbers = new int[j];
    for (int i = 0; i < j; i++) {
      numbers[i] = nums[i];
    }
    System.out.println(Arrays.toString(numbers));

    return j;
  }
}
