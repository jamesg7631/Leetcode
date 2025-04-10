import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Solution sol = new Solution();
        System.out.println(sol.hasDuplicate(nums));
    }
}

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> uniqueNums = new HashSet<>();
        for (Integer num: nums) {
            if (uniqueNums.contains(num)) {
                return true;
            }
            uniqueNums.add(num);
        }
        return false;
    }
}
