import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class tryCatch_2 {

    public static void main(String[] args) {

        try(FileOutputStream out = new FileOutputStream("test.txt")) {
            out.write("Hello plo".getBytes());
            out.flush();
        }catch (IOException e){
            System.out.println("IOException 발생"+e.getMessage());
            e.printStackTrace();
        }
    }
}
