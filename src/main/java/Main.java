import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
//        int[] nums = {3,2,2,3};
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(sol.removeElement(nums, 2));
        System.out.println(Arrays.toString(nums));
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
