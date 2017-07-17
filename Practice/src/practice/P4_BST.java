/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author karth
 */
class BST
    {
        BST left;
        int value;
        BST right;
        BST(int value)
        {
            left = right = null;
            this.value = value;
        }
    }
public class P4_BST {
    
    
    
    public static void insertBST(BST root,int value)
    {
        BST temp = new BST(value);
        while(root != null)
        {
            if(value < root.value)
            {
                if(root.left == null)
                {
                    root.left = temp;
                    return;
                }
                root = root.left;
            }
            else 
            {
                if(root.right == null)
                {
                    root.right = temp;
                    return;
                }
                root = root.right;            
            }
        }
        
    }
    
    public static void inorderTra(BST root)
    {
        if(root == null)
            return;
        
        inorderTra(root.left);
        
        inorderTra(root.right);
        System.out.println(root.value);
   
    }
    public static void main(String args[])
    {
        BST root = new BST(40);
        insertBST(root,30);
        insertBST(root,35);
        insertBST(root,27);
        insertBST(root,25);
        insertBST(root,50);
        insertBST(root,45);
        insertBST(root,22);
        insertBST(root,26);
        insertBST(root,15);
        inorderTra(root);
//        System.out.println(root.value);
/*
         40
      30    50
    27 35 45  
  15 25          
    22 26   
        */
               
    }
}
