import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //Test Case 1
//        int[] nums = {1,2,3,4};
        // Test Case 2
        int[] nums = {2, 7, 11, 15};
        // Test Case 3
//        int[] nums = {2, 3, 4};
//        // Test Case 4
//        int[] nums = {-1, 0};
        // Test Case 5
//        int[] nums = {-10, -8, -2, 1, 2, 5, 6};
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.twoSum(nums, 9)));
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length -1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] {(left + 1), (right + 1)};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        throw new RuntimeException("Total is never reached");
    }
}
