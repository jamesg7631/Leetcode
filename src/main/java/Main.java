public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] getConcatenation(int[] nums) {
        int newSize = nums.length * 2;
        int[] ans = new int[newSize];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }

        for (int i = nums.length; i < newSize; i++) {
            ans[i] = nums[i -nums.length];
        }

        return ans;
    }
}