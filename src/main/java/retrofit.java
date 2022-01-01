import retrofit2.Call;

import java.io.IOException;

public class retrofit {
    public static void main(String[] args) {
        Call<Object> result = retrofitClient.getApi().getUsers(2);

        try {
            System.out.println(result.execute().body());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
