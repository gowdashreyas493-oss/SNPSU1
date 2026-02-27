package exceptions;

import java.io.IOException;

public class CheckedExc{

    static void readFile() throws IOException{
        throw new IOException("File not Found");
    }

    static void display() throws IOException{
        readFile();
    }

    public static void main(String[]args){
        try{
            display();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}