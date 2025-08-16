package containerwithmostwater

func maxArea(height []int) int {
	left := 0
	right := len(height) - 1
	volume := 0

	for left < right {
		currentVolume := (right - left) * min(height[left], height[right])
		if currentVolume > volume {
			volume = currentVolume
		}

		if height[left] < height[right] {
			left++
		} else {
			right--
		}
	}

	return volume
}
