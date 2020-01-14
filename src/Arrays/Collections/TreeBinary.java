package Arrays.Collections;

public class TreeBinary {
    public class Node{
        public int key;
        public Node left;
        public Node right;
        public Node(int item){
            key=item;
            left=null;
            right=null;
        }
    }
    Node root;
    TreeBinary(){
        root=null;
    }
    public void deleteKey(int key){
        root=deleteRec(root,key);
    }
    Node deleteRec(Node root,int key){
        if(root==null) return root;
        if (key<root.key){
            root.left=deleteRec(root.left,key);
        }else if(key>root.key){
            root.right=deleteRec(root.right,key);
        }else {
            if(root.left==null)return root.right;
            if (root.right==null)return root.left;
            root.key=minValue(root.right);
            root.right=deleteRec(root.right,root.key);
        }
        return root;
    }
    int minValue(Node root){
        int minv=root.key;
        while (root.left!=null){
            minv=root.left.key;
            root=root.left;
        }
        return minv;
    }
    void insert(int key){
        root=insertRec(root,key);
    }
    Node insertRec(Node root,int key){
        if (root==null){
            root=new Node(key);
            return root;
        }
        if (key<root.key){
            root.left=insertRec(root.left,key);
        }else if (key>root.key){
            root.right=insertRec(root.right,key);
        }
        return root;
    }
    void sort(){
        sortRec(root);
    }
    void sortRec(Node root){
        if (root!=null){
            sortRec(root.left);
            System.out.println(root.key +" ");
            sortRec(root.right);
        }
    }
}
