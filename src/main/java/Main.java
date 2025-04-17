import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        Solution sol = new Solution();
        List<Integer> result = sol.inOrderTraversal(root);
        System.out.println();
    }
}

class Solution {
    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inOrderTraversalHelper(root, list);
        return list;
    }

    private void inOrderTraversalHelper(TreeNode root, List<Integer> ints) {
        if (root == null) {
            return;
        }
        inOrderTraversalHelper(root.left, ints);
        ints.add(root.val);
        inOrderTraversalHelper(root.right, ints);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
