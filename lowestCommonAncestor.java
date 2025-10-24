// 236. Lowest Common Ancestor of a Binary Tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q)
            return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if (left != null && right != null)
            return root;

        return (left != null) ? left : right;
    }
}

public class lowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        Solution sol = new Solution();

        TreeNode p = root.left;        // Node 5
        TreeNode q = root.right;       // Node 1
        TreeNode lca = sol.lowestCommonAncestor(root, p, q);
        System.out.println("LCA of " + p.val + " and " + q.val + " = " + lca.val);

        p = root.left;                 // Node 5
        q = root.left.right.right;     // Node 4
        lca = sol.lowestCommonAncestor(root, p, q);
        System.out.println("LCA of " + p.val + " and " + q.val + " = " + lca.val);
    }
}
