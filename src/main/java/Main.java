import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // Test Case 1
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};
        // Test Case 2
//        String[] strs = {"x"};
        // Test Case 3
//        String[] strs = {""};
        System.out.println(sol.groupAnagrams(strs));
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramLookup = new HashMap<>();

        for (String str: strs) {
            int[] count = new int[26];
            for (char c: str.toCharArray()) {
                int index = c -'a';
                count[index]++;
            }

            String countString = Arrays.toString(count);
            List<String> values = anagramLookup.get(countString);
            if (values == null) {
                values = new ArrayList<>();
                anagramLookup.put(countString, values);
            }
            values.add(str);
        }
        return new ArrayList<>(anagramLookup.values());
    }
}
