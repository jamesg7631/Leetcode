public class Main {
    public static void main(String[] args) {
        // Test case 1
        String s = "tab a cat";
        Solution sol = new Solution();
        System.out.println(sol.isPalindrome(s));
    }
}

class Solution {
    public boolean isPalindrome(String s) {
        // Find first char
        char[] charArray = s.toCharArray();
        int forward = 0;
        int reverse = s.length() -1;

        while (forward <= reverse && forward < charArray.length && reverse >= 0) {
            //Check if char is valid)
            while (forward < charArray.length &&!isValidChar(charArray[forward])) {
                forward++;
            }

            while (reverse >= 0 && !isValidChar(charArray[reverse])) {
                reverse--;
            }

            if ((forward <= reverse) && Character.toLowerCase(charArray[forward]) != Character.toLowerCase(charArray[reverse])){
                return false;
            }
            forward++;
            reverse--;
        }
        return true;
    }

    private boolean isValidChar(char c) {
        return ('a' <= c && c <= 'z') || ('A' <= c && c <= 'Z') || ('0' <= c && c <= '9');
    }

}
