package threads;

public class Fest {
    static class FormFilling extends Thread{
        public void run(){
            System.out.println("form filling Started");
        }
    }
    static class DocumentsUpload extends Thread{
        public void run(){
            System.out.println("Document upload started");
        }
    }
    static class EmailNotification extends Thread{
        public void run(){
            System.out.println("confirmation email sent");
        }
    }

    public static void main(String[] args) {
        FormFilling f = new FormFilling();
        DocumentsUpload d = new DocumentsUpload();
        EmailNotification e = new EmailNotification();
        f.start();
        d.start();
        e.start();
    }
}
