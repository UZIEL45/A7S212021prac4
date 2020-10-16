package mx.edu.tesoem.isc.ubb.a7s212021prac4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnpng(View v){
        Intent intent = new Intent(this,PNGActivity.class);
        startActivity(intent);
    }
    public void btnjpg(View v){
        Intent intent = new Intent(this,JpgActivity.class);
        startActivity(intent);
    }
    public void btnurl(View v){
        Intent intent = new Intent(this,UrlActivity.class);
        startActivity(intent);
    }
}