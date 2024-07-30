package rotate_array;

public class RotateArray {

  public static void main(String[] args) {
    System.out.println(rotate(new int[]{-1,-100,3,99},3));
  }

  public static int[] rotate(int[] nums, int k) {
    int length = nums.length;
    k = k % length;
    reverse(nums, 0, length-1);
    reverse(nums,0,k-1);
    reverse(nums,k,length-1);
    return nums;
  }

  public static void reverse(int[] nums, int start, int end) {
    while (start < end) {
      int temp = nums[start];
      nums[start] = nums[end];
      nums[end] = temp;
      start++;
      end--;
    }
  }

}
