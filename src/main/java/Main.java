import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // Test Case 1
//        TreeNode root = new TreeNode(3, new TreeNode(1, null, new TreeNode(2)),new TreeNode(4));
        // Test Case 2
        TreeNode root = new TreeNode(5,new TreeNode(3,new TreeNode(2,new TreeNode(1),null) ,new TreeNode(4)) , new TreeNode(6));
        System.out.println(sol.kthSmallest(root, 3));
    }
}

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        AtomicInteger current = new AtomicInteger(0);
        TreeNode kthSmallest = kthSmallestHelper(root, k, current);
        return kthSmallest.val;
    }

    private TreeNode kthSmallestHelper(TreeNode root, int k, AtomicInteger current) {
        if (root == null) {
            return root;
        }
        TreeNode returnedLeftSubtree = kthSmallestHelper(root.left, k, current);
        if (current.get() == k) {
            return returnedLeftSubtree;
        }
        current.incrementAndGet();
        if (current.get() ==  k) {
            return root;
        }
        TreeNode returnedRightSubTree = kthSmallestHelper(root.right, k, current);
        if (returnedRightSubTree != null && current.get() + 1>= k) {
            return returnedRightSubTree;
        }
        return null;
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
