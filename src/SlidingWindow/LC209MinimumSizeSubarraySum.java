package SlidingWindow;

public class LC209MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int min = 0;
        //boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                if (sum + nums[j] == target) {
                    Math.min(min, j - i + 1);
                } else if (sum + nums[j] < target) {
                    sum += nums[j];
                } else break;
            }
        }
        return min;
    }
}
