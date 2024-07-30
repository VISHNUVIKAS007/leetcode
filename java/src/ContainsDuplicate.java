import java.util.HashSet;

/**
 * 217. Contains Duplicate Solved Easy Topics Companies
 * <p>
 * Given an integer array nums, return true if any value appears at least twice in the array, and
 * return false if every element is distinct.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1] Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4] Output: false
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [1,1,1,3,3,4,3,2,4,2] Output: true
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105 -109 <= nums[i] <= 109
 **/
public class ContainsDuplicate {

  public static void main(String[] args) {
    int[] nums = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
    System.out.println(containsDuplicate(nums));
  }

  public static boolean containsDuplicate(int[] nums) {
    HashSet<Integer> hashArray = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (hashArray.contains(nums[i])) {
        return true;
      }
      hashArray.add(nums[i]);
    }
    return false;
  }
}
