package two_sum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

  public static void main(String[] args) {
    int[] nums = new int[]{1, 2, 3, 4};
    int target = 4;

    System.out.println(Arrays.toString(twoSum(nums, target)));
  }

  public static int[] twoSum(int[] nums, int target) {

    HashMap<Integer, Integer> integerHashMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int currentItem = nums[i];
      int complement = target - currentItem;

      if (integerHashMap.containsKey(complement)) {
        return new int[]{integerHashMap.get(complement), i};
      }

      integerHashMap.put(currentItem, i);
    }
    throw new IllegalArgumentException("Values not matched");
  }

}
