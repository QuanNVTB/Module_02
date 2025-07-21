public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertRec(root, key);
    }
    private Node insertRec(Node node, int key) {
        if (node == null) {return new Node(key);}
        if(key < node.key){
            node.left = insertRec(node.left, key);
        }else if(key > node.key){
            node.right = insertRec(node.right, key);
        }else{
            return node;
        }
        return node;
    }

    public void delete(int key) {
        root = deleteRec(root, key);
    }
    private Node deleteRec(Node node, int key) {
        if(node == null) return null;
        if(key < node.key){
            node.left = deleteRec(node.left, key);
        }else if(key > node.key){
            node.right = deleteRec(node.right, key);
        }else{
            if(node.left == null){
                return node.right;
            }else if(node.right == null){
                return node.left;
            }
            node.key = minValue(node.right);

            node.right = deleteRec(node.right, node.key);
        }
        return node;
    }

    private int minValue(Node node) {
        int minv = node.key;
        while(node.left != null){
            minv = node.left.key;
            node = node.left;
        }
        return minv;
    }

    public void postOrder(){
        postOrderRec(root);
        System.out.println();
    }
    public void postOrderRec(Node node){
        if(node == null) return;
        postOrderRec(node.left);
        postOrderRec(node.right);
        System.out.print(node.key + " ");
    }

}
