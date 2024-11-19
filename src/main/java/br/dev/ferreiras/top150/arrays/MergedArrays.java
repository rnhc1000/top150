package br.dev.ferreiras.top150.arrays;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

import java.util.Arrays;

public class MergedArrays {

  private static final Logger logger = (Logger) LogManager.getLogger(MergedArrays.class);
  public static void main(String[] args) {
    int[] nums1 = { 1,2,2,0,0,0};
    int[] nums2 = {4,5,6};
    int m = 3;
    int n = 3;
    merge(nums1, m, nums2, n);
  }

  public static void merge(int[] nums1, int m, int[] nums2, int n) {

    for (int j = 0, i = m; j < n; j++, i++) {
      nums1[i] = nums2[j];
      logger.info("nums1[i] -> {}", nums1[i]);

    }

    Arrays.sort(nums1);

    System.out.println(Arrays.toString(nums1));

  }

}
