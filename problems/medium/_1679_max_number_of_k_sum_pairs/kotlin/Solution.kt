package medium._1679_max_number_of_k_sum_pairs.kotlin

class Solution {
    fun maxOperations(nums: IntArray, k: Int): Int {
        nums.sort()

        var left = 0
        var right = nums.lastIndex
        var operation = 0;

        while (left < right) {
            val sum = nums[left] + nums[right]

            when {
                sum == k -> {
                    left++
                    right--
                    operation++
                }

                sum > k -> {
                    right--
                }

                else -> {
                    left++
                }
            }
        }
        return operation
    }
}