package day4.transientkey;
import java.io.*;

class User implements Serializable{
    String username="Saurav";
    transient String password="2901";
}

class TransientDemo{
    public static void main(String[]args)throws Exception{

        User user=new User();

        ObjectOutputStream oos=
                new ObjectOutputStream(new FileOutputStream("user.ser"));
        oos.writeObject(user);
        oos.close();

        ObjectInputStream ois=
                new ObjectInputStream(new FileInputStream("user.ser"));
        User u=(User)ois.readObject();
        ois.close();

        System.out.println(u.username);
        System.out.println(u.password);
    }
}