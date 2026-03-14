package dataStructures.linear.queues;

public class IntegerQueue {
    private static final int MAXSIZE=5;
    private int[] arr=new int [MAXSIZE];
    private int front;
    private int rear;
    public IntegerQueue(){
        front=rear=-1;
    }
    public boolean isEmpty(){
        return(front==1&&rear==1);
    }
    public boolean isFull(){
        return rear==MAXSIZE-1;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full Can't add more elements");
            return;
        }
        if(isEmpty()){
            front =rear=0;
        }else{
            rear++;
        }
        arr[rear]=data;
        System.out.println("Enqueud:"+data+" into the queue");
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty Can't remove data");
            return;
        }else if(front == rear){
            front=rear=-1;
        }else{
            front++;
        }
    }
    public int getFront(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return-1;
        }
        return arr[front];
    }
    public int getRear(){
        if(isEmpty()){
            System.out.println("Queue is empty can't get rear");
            return-1;
        }
        return arr[rear];
    }
    public int getSize(){
        if(isEmpty()) return 0;
        return rear-front+1;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("queue is empty can't display");
            return;
        }
        for(int i =front;i<=rear;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        IntegerQueue queue= new IntegerQueue();
        int[]arr={1,2,3,4,5,6,7};
        for(int x: arr){
            queue.enqueue(x);
        }
        queue.display();
        queue.dequeue();
        System.out.println(queue.getSize());
        System.out.println(queue.getFront());
        System.out.println(queue.getRear());
    }
}
