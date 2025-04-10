public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "jar";
        String t = "jam";
        System.out.println(sol.isAnagram(s,t));
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] numbers = new int[26];
        for (char c: s.toCharArray()) {
            int index = c - 'a';
            numbers[index] += 1;
        }

        for(char c: t.toCharArray()) {
            int index = c - 'a';
            numbers[index] -= 1;
            if (numbers[index] < 0) {
                return false;
            }
        }

        for (int num: numbers) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}
