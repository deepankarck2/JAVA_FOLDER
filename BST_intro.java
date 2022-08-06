public class BST_intro {
    //Individual Nodes 
    static class Node{
        int data;
        Node left;
        Node right; 
    }
    
    static class BST{
    
        public Node createNewNode(int k){
            Node newNode = new Node();
            newNode.data=k;
            newNode.left=null;
            newNode.right = null; 
    
            return newNode; 
        }
    
        public Node insert(Node node, int val){
            // Avergae: time: O(log N) | Space: O(log N) --> since recursive
            // Wrost  : time: O(N)     | Space: O(N)     --> Since recursive

            if(node == null){
                return createNewNode(val); 
            }
            else{
                if( val <= node.data){
                    node.left = insert(node.left, val); //Recursively adding the new item at the appropiate position.
                }
    
                else if(val > node.data){
                    node.right = insert(node.right, val); 
                }
            }
            return node; 
        }
    
        public void inorder(Node root){
            //Inorder goes --> Root Left right.
            if(root != null){
    
                inorder(root.left);
                System.out.println(root.data);
                inorder(root.right);
            }
        }
        
        double min = Double.POSITIVE_INFINITY;

        public double findMin(Node root){
            //NOTE: TODO: Using bst property would be grat too

            //Inorder goes --> Root Left right.
            if(root == null){
                return min;
            }
                findMin(root.left);
                if(root.data < min) min = root.data;
                findMin(root.right);
            
            return min;
        }

        public Node deleteNode(Node root, int data){
            if(root == null) return root; 
            else if(data < root.data) root.left = deleteNode(root.left, data);
            else if(data > root.data) root.right = deleteNode(root.right, data);

            else if(data == root.data){
                //Case 1: No child.
                if(root.left == null && root.right == null){
                   root = null;
                   return root; 
                }
                //Case 2: One Child
                else if(root.left == null){
                        root = root.right;
                        return root;
                }
                else if(root.right == null){
                    root = root.left;
                    return root;
                }
                else{ // Case 3: 2 child 
                    //Search the minimum element in the right subtree. (Max in left sub-tree would also work)
                    int min_node = (int)findMin(root.right);
                    root.data = min_node; 
                    root.right = deleteNode(root.right, min_node);

                    return root;
                }
            }
            return root;
        }
    }
    
   public static void main(String[] args) {
        
        BST myBst = new BST();
        Node root = null; 

        root = myBst.insert(root, 8);
        root = myBst.insert(root, 3);
        root = myBst.insert(root, 6);
        root = myBst.insert(root, 10);
        root = myBst.insert(root, 4);
        root = myBst.insert(root, 7);
        root = myBst.insert(root, 1);
        root = myBst.insert(root, 14);
        root = myBst.insert(root, 13);


        myBst.inorder(root);
        System.out.println("Min: " + myBst.findMin(root.right));
        myBst.deleteNode(root, 8);
        System.out.println("--------------------");
        myBst.inorder(root);

    }
}