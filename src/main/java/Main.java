import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //Test Case 1
//        int[] nums = {1,2,3,4};
        // Test Case 2
//        int[] nums = {2, 7, 11, 15};
        // Test Case 3
//        int[] nums = {2, 3, 4};
//        // Test Case 4
//        int[] nums = {-1, 0};
        // Test Case 5
        int[] nums = {-10, -8, -2, 1, 2, 5, 6};
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.twoSum(nums, 0)));
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int pointer1 = 0;
        int pointer2 = 1;

        while (pointer1 < numbers.length - 1) {
            int sum = numbers[pointer1] + numbers[pointer2];
            if (sum == target) {
                int[] result = new int[2];
                result[0] = pointer1 + 1;
                result[1] = pointer2 + 1;
                return result;
            } else if (sum > target) {
                pointer1++;
                pointer2 = pointer1 + 1;
            } else {
                pointer2++;
                if (pointer2 >= numbers.length) {
                    pointer1++;
                    pointer2 = pointer1 + 1;
                }
            }
        }
        return numbers;
    }
}
