package com.example.variablesesion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        recibe();
    }
    private void recibe(){
        SharedPreferences sharedPreferences=getSharedPreferences(MainActivity.globalPreferenceName,MODE_PRIVATE);
        String nusuario=sharedPreferences.getString("username","Indefinido");
        int estatura=sharedPreferences.getInt("estatura",0);
        Toast.makeText(this, "Usuario:"+nusuario+", estatura:"+estatura, Toast.LENGTH_SHORT).show();
    }
}
