package maxnumberofksumpairs

import "sort"

func maxOperations(nums []int, k int) int {
	sort.Ints(nums)

	left := 0
	right := len(nums) - 1
	operation := 0

	for left < right {
		sum := nums[left] + nums[right]
		if sum == k {
			left++
			right--
			operation++
		} else if sum > k {
			right--
		} else {
			left++
		}
	}

	return operation
}
