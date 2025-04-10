import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        //Test Case 1
//        int[] nums = {3,4,5,6};
        // Test Case 2
        int[] nums = {5,5};
        System.out.println(Arrays.toString(sol.twoSum(nums, 10)));
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            boolean containsCompliment = complements.containsKey(complement);
            if (containsCompliment) {
                int[] result = new int[2];
                result[0] = complements.get(complement);
                result[1] = i;
                return result;
            }
            complements.put(nums[i], i);
        }
        return null;
    }
}
