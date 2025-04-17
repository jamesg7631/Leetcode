public class Main {
    public static void main(String[] args) {
        //Test Case 1
//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        // Test Case 2
//        int[] nums = {1};
        // Test Case 3
        int[] nums = {5,4,-1,7,8};
        Solution sol = new Solution();
        System.out.println(sol.maxSubArray(nums));
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = 0;

        for (int i = 0; i < nums.length; i++) {
            curSum = Math.max(0, curSum);
            curSum += nums[i];
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }
}
