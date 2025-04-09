import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // Example 1
        Pair pair1 = new Pair(5, "apple");
        Pair pair2 = new Pair(2, "banana");
        Pair pair3 = new Pair(9, "cherry");

        List<Pair> pairs = new ArrayList<>();
        pairs.add(pair1);
        pairs.add(pair2);
        pairs.add(pair3);

        List<List<Pair>> result = sol.insertionSort(pairs);
    }
}

class Pair {
    int key;
    String value;

    Pair(int key, String value) {
        this.key = key;
        this.value = value;
    }
}

class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> result = new ArrayList<>();
        if (!pairs.isEmpty()) {
            result.add(pairs);
        }
        List<Pair> shallowCopy = new ArrayList<>(pairs);
        for (int i = 1; i < shallowCopy.size(); i++) {
            int j = i - 1;
            while (j >= 0 && shallowCopy.get(j + 1).key < shallowCopy.get(j).key) {
                Pair tmp = shallowCopy.get(j);
                shallowCopy.set(j, shallowCopy.get(j + 1));
                shallowCopy.set(j + 1, tmp);
                j--;
            }
            List<Pair> insertion = new ArrayList<>(shallowCopy);
            result.add(insertion);
        }
        return result;
    }
}