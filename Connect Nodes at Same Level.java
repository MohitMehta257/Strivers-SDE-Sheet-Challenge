public static void connectNodes(BinaryTreeNode<Integer> root) {
        BinaryTreeNode<Integer> dummy = new BinaryTreeNode<Integer>(null);
        while (root != null) {
            BinaryTreeNode<Integer> curr = root;
            BinaryTreeNode<Integer> next = dummy;
            while (curr != null) {
                if (curr.left != null) {
                    next = next.next = curr.left;
                }
                if (curr.right != null) {
                    next = next.next = curr.right;
                }
                curr = curr.next;
            }
            root = dummy.next;
            dummy.next = null;
        }
}
