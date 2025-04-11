import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.twoSum(nums, 3)));
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> complementIndexMapper = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (complementIndexMapper.containsKey(numbers[i])) {
                int[] result = new int[2];
                result[0] = complementIndexMapper.get(numbers[i]) + 1;
                result[1] = i + 1;
                return result;
            }
            complementIndexMapper.put(complement, i);
        }
        return null;
    }
}
