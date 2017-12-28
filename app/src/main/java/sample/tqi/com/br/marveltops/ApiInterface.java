package sample.tqi.com.br.marveltops;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;
import sample.tqi.com.br.marveltops.main.Comic;

/**
 * Created by katia.goncalves on 27/12/2017.
 */

public interface ApiInterface {

    @POST("BASE_URL")
    Call<List<Comic>> getComic();
}
