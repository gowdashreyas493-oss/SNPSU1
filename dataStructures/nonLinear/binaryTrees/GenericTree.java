package dataStructures.nonLinear.binaryTrees;

public class GenericTree<S> {
    private final S data;
    private GenericTree<S> left;
    private GenericTree<S> right;

    public GenericTree(S data) {
        this.data=data;
        this.left=this.right=null;

    }
    void preOrder(){
        System.out.println(this.data+" ");
        if(this.left!=null)this.left.preOrder();
        if(this.right!=null)this.right.preOrder();
    }
    void inOrder(){
        if(this.left!=null)this.left.inOrder();
        System.out.println(this.data+" ");
        if(this.right!=null)this.right.inOrder();
    }
    void postOrder(){
        if(this.left!=null)this.left.postOrder();
        if(this.right!=null)this.right.postOrder();
        System.out.println(this.data+" ");
    }
    public static void main(String[]args){
        GenericTree<Integer> integerRoot=new GenericTree<>(1);
        integerRoot.left=new GenericTree<>(2);
        integerRoot.right=new GenericTree<>(3);
        System.out.println("Preorder Integer tree");
        integerRoot.preOrder();
        System.out.println("Inorder Integer tree");
        integerRoot.inOrder();
        System.out.println("PostOrder Integer Tree");
        integerRoot.postOrder();
        GenericTree<Float>floatRoot=new GenericTree<>(1.2f);
        floatRoot.left=new GenericTree<>(2.4f);
        floatRoot.right=new GenericTree<>(4.6f);
        System.out.println("Preorder float tree");
        floatRoot.preOrder();
        System.out.println("Inorder float tree");
        floatRoot.inOrder();
        System.out.println("PostOrder float Tree");
        floatRoot.postOrder();
        GenericTree<Boolean>booleanRoot=new GenericTree<>(true);
        booleanRoot.left=new GenericTree<>(false);
        booleanRoot.right=new GenericTree<>(true);
        System.out.println("Preorder Bool tree");
        booleanRoot.preOrder();
        System.out.println("Inorder Bool tree");
        booleanRoot.inOrder();
        System.out.println("PostOrder Bool Tree");
        booleanRoot.postOrder();
    }
}
