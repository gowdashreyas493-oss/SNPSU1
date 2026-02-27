package threads;

public class FoodOrder extends Thread{
    String task;

    FoodOrder(String task){
        this.task=task;
    }

    public void run(){
        System.out.println(task+" started");
    }

    public static void main(String[]args){
        FoodOrder cook=new FoodOrder("Cooking");
        FoodOrder pack=new FoodOrder("Packing");
        FoodOrder del=new FoodOrder("Assigning agent");

        cook.start();
        pack.start();
        del.start();
    }
}