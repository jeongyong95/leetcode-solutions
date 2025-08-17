package medium._1679_max_number_of_k_sum_pairs.java;

import java.util.Arrays;

class Solution {

  // 2개의 값으로 더해지는 k가 나오는 횟수를 반환한다.
  public int maxOperations(int[] nums, int k) {
    Arrays.sort(nums);

    var left = 0;
    var right = nums.length - 1;
    var operation = 0;

    while (left < right) {
      var sum = nums[left] + nums[right];
      if (sum == k) {
        left++;
        right--;
        operation++;
      } else if (sum > k) {
        right--;
      } else {
        left++;
      }
    }
    return operation;
  }
}
