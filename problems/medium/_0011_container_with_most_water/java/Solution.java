package medium._0011_container_with_most_water.java;

public class Solution {

  public int maxArea(int[] height) {
    // 컨테이너 가로 = left.index - right.index
    // 컨테이너 세로 = min(left, right)

    // 양쪽 끝에 포인터를 두고 안쪽으로 좁혀나간다.(while left < right)
    // 옮겨야 하는 포인터 = min(left, right)

    var left = 0;
    var right = height.length - 1;
    var volume = 0;

    while (left < right) {
      var currentVolume = (right - left) * Math.min(height[left], height[right]);
      if (currentVolume > volume) {
        volume = currentVolume;
      }

      if (height[left] < height[right]) {
        left++;
      } else {
        right--;
      }
    }

    return volume;
  }
}