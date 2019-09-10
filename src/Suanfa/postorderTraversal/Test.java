package Suanfa.postorderTraversal;

import java.util.LinkedList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
public class Test {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> res = new LinkedList<>();
        if (root!=null)return res;
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode treeNode = stack.pollLast();
            res.addFirst(treeNode.val);
            if (treeNode.left!=null){
                stack.add(treeNode.left);
            }
            if (treeNode.right != null) {
                stack.add(treeNode.right);
            }
        }
        return res;
    }
}
