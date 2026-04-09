package dataStructures.nonLinear.binarySearchTrees;

class TreeNode{
    int data;
    TreeNode left, right;

    TreeNode(int value){
        this.data = value;
        left = right = null;
    }
}

public class BinarySearchTree {

    public static void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    static TreeNode insert(TreeNode root, int key){
        if(root == null){
            return new TreeNode(key);
        }

        if(key < root.data){
            root.left = insert(root.left, key);
        }
        else if(key > root.data){
            root.right = insert(root.right, key);
        }

        return root;
    }

    static TreeNode search(TreeNode root, int key){
        if(root == null || root.data == key){
            return root;
        }

        if(key > root.data){
            return search(root.right, key);
        }

        return search(root.left, key);
    }

    static TreeNode minValueNode(TreeNode node){
        TreeNode current = node;
        while(current.left != null){
            current = current.left;
        }
        return current;
    }

    static TreeNode deleteNode(TreeNode root, int key){
        if(root == null){
            return root;
        }

        if(key < root.data){
            root.left = deleteNode(root.left, key);
        }
        else if(key > root.data){
            root.right = deleteNode(root.right, key);
        }
        else{

            // case 1 & 2
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            // case 3
            TreeNode temp = minValueNode(root.right);
            root.data = temp.data;
            root.right = deleteNode(root.right, temp.data);
        }

        return root;
    }

    public static void main(String[] args) {

        TreeNode root = null;

        root = insert(root, 50);

        int[] arr = {60,20,30,10,58,100};

        for(int i = 0; i < arr.length; i++){
            root = insert(root, arr[i]);
        }

        System.out.println("BST:");
        inOrder(root);
        System.out.println();

        TreeNode result = search(root, 30);
        if(result == null){
            System.out.println("Key not found");
        }else{
            System.out.println("Key Found");
        }

        root = deleteNode(root, 20);

        System.out.println("After deleting 20:");
        inOrder(root);
    }
}