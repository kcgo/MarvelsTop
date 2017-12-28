package sample.tqi.com.br.marveltops;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import sample.tqi.com.br.marveltops.R;

public class MainActivity extends AppCompatActivity {
    ImageView iv_banner;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main);
        iv_banner=(ImageView)findViewById( R.id.iv_banner );
        Picasso.with( getApplicationContext()).load("http://i.annihil.us/u/prod/marvel/i/mg/e/c0/4cbcd33563abd").into(iv_banner);
    }
}
