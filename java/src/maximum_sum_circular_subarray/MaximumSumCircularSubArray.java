package maximum_sum_circular_subarray;

import java.util.Arrays;

public class MaximumSumCircularSubArray {

  public static void main(String[] args) {
    int[] nums = new int[]{5,-3,5};
    System.out.println(maxSubarraySumCircular(nums));
  }

  public static int maxSubarraySumCircular(int[] nums) {
    int count = 0;
    Arrays.sort(nums);
    int maxItem = nums[nums.length - 1];
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == maxItem) {
        count++;
      }
    }
    return count*maxItem;
  }
}
