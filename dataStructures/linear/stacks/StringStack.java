package dataStructures.linear.stacks;

public class StringStack {
    private static final int MAX_SIZE=10;
    private String[] arr= new String[MAX_SIZE];
    private int top=-1;
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==MAX_SIZE;
    }
    public void push(String data){
        if(isFull()){
            System.out.println("Stack Overflow Can't add more");
            return;
        }
        arr[++top]=data;
        System.out.println("The string"+data+"was pushed to stack");
    }
   public String pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow can't pop");
            return null;
        }
        String popped =arr[top--];
        return popped;
   }
   public void display(){
        if(isEmpty()){
            System.out.println("Stack Underflow .No elements to display");
            return;
        }
       System.out.println("The elements in order [LIFO] are:");
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
       System.out.println();
   }
   public int size(){
        return top+1;
   }
   public String peek(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return null;
        }
        return arr[top];
   }

    public static void main(String[] args) {
        StringStack stack = new StringStack();
        stack.push("Mango");
        stack.push("Pineapple");
        stack.push("Avacado");
        stack.display();
        System.out.println("Top element:"+stack.peek());
        String popped=stack.pop();
        System.out.println("The popped element is :"+popped);
        stack.display();
        System.out.println("size:"+stack.size());
    }
}
