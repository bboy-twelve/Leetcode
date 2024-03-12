package SlidingWindow;

public class LC209MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0, j = 0, min = Integer.MAX_VALUE, sum = 0;
        while (j <nums.length ){
            sum += nums[j];
            while(sum >= target && i <= j){
                min = Math.min(min, j+1 -i);
                sum-= nums[i];
                i++;
            }
            j++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;

    }


    // tc = n^2 sc = 1 out of time
//     int minSubArrayLen(int target, int[] nums) {
//        //corner case ----------------------------
//        if(target < 0)return 0;
//        if(nums == null || nums.length == 0) return 0;
//        // core ----------------------------------------------
//        int min = Integer.MAX_VALUE;
//        boolean flag = true;
//        for (int i = 0; i < nums.length; i++) {
//            int sum = 0;
//            for (int j = i; j < nums.length; j++) {
//                sum += nums[j];
//                if (sum >= target) {
//                    min = Math.min(min, j - i + 1);
//                    break;
//                }
//                // sum of array < target
//                if (i == 0 && j == nums.length - 1 && sum < target) flag = false;
//            }
//        }
//        return min = flag == true ? min : 0;
//    }
}
