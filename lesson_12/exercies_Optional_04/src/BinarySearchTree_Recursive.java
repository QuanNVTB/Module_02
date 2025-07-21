public class BinarySearchTree_Recursive {
    Node root;

    public BinarySearchTree_Recursive(){
            root = null;
        }
        public void insert(int key) {
            root = insertRec(root, key);
        }
        public Node insertRec(Node node, int key) {
        if (node == null) return new Node(key);
        if(key < node.key){
            node.left = insertRec(node.left, key);
        } else if (key > node.key) {
            node.right = insertRec(node.right, key);
        }
        return node;
        }

        public boolean search(int key) {
        return searchRec(root, key);
        }
        private boolean searchRec(Node node, int key) {
        if(node == null) return false;
        if(key == node.key) return true;
        else if(key < node.key) return searchRec(node.left, key);
        else return searchRec(node.right, key);
        }


}