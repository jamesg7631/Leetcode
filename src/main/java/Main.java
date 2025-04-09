public class Main {
    public static void main(String[] args) {

    }
}

// My Solution
class Solution {
    public int removeDuplicates(int[] nums) {
        int insertionPoint = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            nums[insertionPoint] = nums[i];
            insertionPoint++;
        }
        return insertionPoint;
    }
}
