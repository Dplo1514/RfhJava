package NetworkService;

import retrofit2.Call;

import javax.imageio.IIOException;
import java.io.IOException;

public class Networking01 {
    public static void main(String[] args) {
        Call<Object> result =  RetrofitClient.getApi().getUsers(2);

        try {
            System.out.println(result.execute().body());
        }catch (IOException e){
            System.out.println("IOException e" + e.getMessage());
        }
    }
}
