 //Individual Nodes 
class Node{
    int data;
    Node left;
    Node right; 
}

class BST{

    public Node createNewNode(int k){
        Node a = new Node();
        a.data=k;
        a.left=null;
        a.right = null; 

        return a; 
    }

    public Node insert(Node node, int val){
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

    }
}

public class BST_intro {

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

    }
}