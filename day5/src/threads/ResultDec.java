package threads;

public class ResultDec{

    synchronized void declareResult() throws Exception{
        System.out.println("Waiting for approval......");
        wait();
        System.out.println("Result Declared");
    }

    synchronized void approve(){
        notify();
    }

    public static void main(String[]args) throws Exception{

        ResultDec res=new ResultDec();

        new Thread(() ->{
            try{
                res.declareResult();
            }catch(Exception e){}
        }).start();

        Thread.sleep(2000);

        new Thread(() ->{
            res.approve();
        }).start();
    }
}