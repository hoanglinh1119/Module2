package Arrays.ThuatToanTK;

import javax.swing.tree.TreeNode;

public class TreeBinary {
    public TreeNode root;
    public static class TreeNode{
        int number;
        TreeNode left;
        TreeNode right;
        TreeNode(int number,TreeNode left,TreeNode right){
            this.number=number;
            this.left=left;
            this.right=right;
        }
    }
    public  TreeBinary(int[] arrTree){
        for (int number: arrTree)
            addNumber(number);
        }
        public  void addNumber(int number){
           if(root==null){
              root=new TreeNode(number,null,null);
           }else {
               TreeNode node=root;
               while (node!=null){
                   if (number<node.number){
                       if (node.left==null){
                           node.left=new TreeNode(number,null,null);
                           break;
                       }
                       node=node.left;
                   }
                   else if (node.right==null){
                       node.right=new TreeNode(number,null,null);
                       break;
                   }
                   node=node.right;
               }
           }
        }
        public boolean searchElement(int element){
        TreeNode currentNode=root;
        while (currentNode!=null){
            if (element>currentNode.number){
                currentNode=currentNode.right;
            } else if (element<currentNode.number){
                currentNode=currentNode.left;
            }else return true;
        }
        return false;
        }
    }
