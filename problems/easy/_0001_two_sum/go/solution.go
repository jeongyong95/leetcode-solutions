package twosum

func twoSum(nums []int, target int) []int {
	remainMap := make(map[int]int)

	for i := 0; i < len(nums); i++ {
		if _, exists := remainMap[target-nums[i]]; exists {
			return []int{remainMap[target-nums[i]], i}
		}
		remainMap[nums[i]] = i

	}
	return nil
}
