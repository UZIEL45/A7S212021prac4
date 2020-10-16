package mx.edu.tesoem.isc.ubb.a7s212021prac4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class UrlActivity extends AppCompatActivity {

    ImageView MiImagen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_url);

        MiImagen = findViewById(R.id.miimagen);

        Picasso.get()
                .load("https://lh3.googleusercontent.com/proxy/bWAq7BDvN-0o1-JLN07-IJSmji_TPIzS9Cj-fa3YWQn_o2Hz74bj0YmcJX6Ee-LxhI_oenrMqFPsN9wUl68DVwg7pJ0b0g9JU7Qi_Y6a")
                .fit()
                .error(R.mipmap.ic_launcher_round)
                .into(MiImagen);
    }
}