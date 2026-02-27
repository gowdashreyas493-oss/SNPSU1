package threads;

public class TicketTask implements Runnable  {
    String task;
    TicketTask(String task){
        this.task=task;
    }
    public void run(){
        System.out.println(task+"in progress");

    }

    public static void main(String[] args) {

    }
}
