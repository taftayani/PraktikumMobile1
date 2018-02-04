package com.example.breda.praktikum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText food;
    EditText porsi;

    String restaurant,menu;
    int portion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        food=(EditText)findViewById(R.id.EditText);
        porsi=(EditText)findViewById(R.id.editText);
    }

    public void abnormal(View view) {
        Intent intent= new Intent(this, HomeActivity.class);
        menu= food.getText().toString();
        restaurant="abnormal";
        portion=Integer.parseInt(porsi.getText().toString());
        int total= 30000*portion;
        Log.d("total harga","Rp."+total);
        intent.putExtra("restaurant",restaurant);
        intent.putExtra("menu",menu);
        intent.putExtra("porsi",portion);
        intent.putExtra("price",total);
        startActivity(intent);
    }

    public void eatbus(View view) {
        Intent intent= new Intent(this, HomeActivity.class);
        menu= food.getText().toString();
        restaurant="eatbus";
        portion=Integer.parseInt(porsi.getText().toString());
        int total= 50000*portion;
        Log.d("total harga","Rp."+total);
        intent.putExtra("restaurant",restaurant);
        intent.putExtra("menu",menu);
        intent.putExtra("porsi",portion);
        intent.putExtra("price",total);
        startActivity(intent);
    }
}
