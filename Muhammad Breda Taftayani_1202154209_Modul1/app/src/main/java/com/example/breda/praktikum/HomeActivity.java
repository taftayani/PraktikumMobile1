package com.example.breda.praktikum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    TextView tvRestaurant,tvMenu,tvPortion,tvPrice;
    String restaurant,menu;
    int price,portion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvRestaurant=(TextView)findViewById(R.id.restaurant);
        tvMenu=(TextView)findViewById(R.id.menu);
        tvPortion=(TextView)findViewById(R.id.portion);
        tvPrice=(TextView)findViewById(R.id.price);
        Intent intent=getIntent();

        restaurant=intent.getStringExtra("restaurant");
        menu=intent.getStringExtra("menu");
        portion=intent.getIntExtra("porsi",0);
        price=intent.getIntExtra("price",0);

        //set data
        tvRestaurant.setText(restaurant);
        tvMenu.setText(menu);
        tvPortion.setText(""+portion);
        tvPrice.setText(""+price);
        Toast toast=null;
        if(price<65000){
            toast=Toast.makeText(getApplicationContext(),"karena harga murah, makan disini yaa", Toast.LENGTH_SHORT);
        }
        else {
            toast=Toast.makeText(getApplicationContext(),"karena harga mahal, pulang ya ", Toast.LENGTH_SHORT);
        }
        toast.show();
    }
}
