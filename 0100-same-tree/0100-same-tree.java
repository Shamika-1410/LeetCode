class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        List<Integer> pList = new ArrayList<>();
        List<Integer> qList = new ArrayList<>();
        check(p, pList);
        check(q, qList);
        return pList.equals(qList);
    }

    public static void check(TreeNode tree, List<Integer> list) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            TreeNode front = queue.poll();
            if (front != null) {
                list.add(front.val); 
                queue.add(front.left);  
                queue.add(front.right); 
            } else {
                list.add(null);
            }
        }
    }
}
