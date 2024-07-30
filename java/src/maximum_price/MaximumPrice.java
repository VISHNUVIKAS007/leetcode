package maximum_price;

import java.util.Stack;

public class MaximumPrice {

  public static void main(String[] args) {
    int[] nums = new int[]{7, 1, 5, 3, 6, 4};

    System.out.println(maxProfit(nums));
  }

  public static int maxProfit(int[] prices) {
    int complement = 0;
    Stack<Integer> stack = new Stack<>();
    for (int price : prices) {
      if (stack.isEmpty()) {
        stack.push(price);
      } else {
        int value = stack.peek();
        if (value > price) {
          stack.push(price);
        } else {
          int diff = price - value;
          if (complement < diff) {
            complement = diff;
          }
        }
      }
    }
    return complement;
  }

}
