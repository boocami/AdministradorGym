package com.example.variablesesion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    public static String globalPreferenceName="credencial";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.button);

        SharedPreferences.Editor editor=getSharedPreferences(globalPreferenceName,MODE_PRIVATE).edit();
        editor.putString("username","vmadrid");
        editor.putInt("estatura",180);
        editor.commit();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                traspasar();
            }
        });
    }
    private void traspasar(){
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
