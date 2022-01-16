import java.io.*;
import java.nio.charset.StandardCharsets;

public class Exception02 {

//    public static void main(String[] args) throws IOException { //예외의 발생 시그니쳐를 구현
//        File file
//        FileOutputStream out = new FileOutputStream("test.txt");
//        try { //예외가 발생할 가능성이 있는 객체를 ()안에 구현 resource
//            out.write("hello sparata".getBytes());
//            out.flush();
//        }catch (IOException e){
//            System.out.println("IOException 발생: " + e.getMessage());
//            e.printStackTrace();
//        }
//        out.close();

public static void main(String[] args) {
        File file;
        try (FileOutputStream out = new FileOutputStream("test.txt")){ //예외가 발생할 가능성이 있는 객체를 ()안에 구현 resource
            out.write("hello sparata".getBytes());
            out.flush();
        }catch (IOException e){
            System.out.println("IOException 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
