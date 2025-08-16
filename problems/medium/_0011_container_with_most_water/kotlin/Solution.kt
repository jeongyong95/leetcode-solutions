package medium._0011_container_with_most_water.kotlin

import kotlin.math.min

class Solution {
    fun maxArea(height: IntArray): Int {
        var left = 0
        var right = height.lastIndex
        var volume = 0

        while (left < right) {
            val currentVolume = (right - left) * min(height[left], height[right])

            if (currentVolume > volume) {
                volume = currentVolume
            }

            if (height[left] > height[right]) {
                right--
            } else {
                left++
            }
        }

        return volume
    }
}