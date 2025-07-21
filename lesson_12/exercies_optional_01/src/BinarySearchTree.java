public class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void postOrderTraversal(TreeNode node) {
        if(node == null){
            return;
        }

        postOrderTraversal(node.left);

        postOrderTraversal(node.right);

        System.out.println(node.data + " ");
    }

    public void insert(int data){
        root = insertRec(root, data);
    }

    public TreeNode insertRec(TreeNode node, int data) {
        if(node == null){
            return new TreeNode(data);
        }
        if(data< node.data){
            node.left = insertRec(node.left, data);
        }else if(data > node.data){
            node.right = insertRec(node.right, data);
        }
        return node;
    }
}
