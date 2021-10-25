package com.example.foodex;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Recipe extends AppCompatActivity {
    Button btnChole,btnSamosa,btnNoodles,btnRice,btnPav,btnPaneer,btnMisal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        btnChole=findViewById(R.id.btnChole);
        btnSamosa=findViewById(R.id.btnSamosa);
        btnNoodles=findViewById(R.id.btnNoodles);
        btnPav=findViewById(R.id.btnPav);
        btnPaneer=findViewById(R.id.btnPaneer);
        btnRice=findViewById(R.id.btnRice);
        btnMisal=findViewById(R.id.btnMisal);
        ActionBar actionBar=getSupportActionBar();
        // actionBar.setSubtitle("Welcome to our App");
        actionBar.setTitle("Recipe");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);
        btnChole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+ "www.youtube.com/watch?v=C9xA0KpHfq8"));
                startActivity(intent);

            }
        });

        btnPaneer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+ "www.youtube.com/watch?v=T9hQV22Uezw"));
                startActivity(intent);

            }
        });
        btnNoodles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+ "www.youtube.com/watch?v=vWHGc5Jta0k"));
                startActivity(intent);

            }
        });
        btnSamosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+ "www.youtube.com/watch?v=FT2QJBr-kuE"));
                startActivity(intent);

            }
        });
        btnPav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+ "www.youtube.com/watch?v=Qe8ejVPAFu8"));
                startActivity(intent);
            }
        });
        btnRice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+ "www.youtube.com/watch?v=hoZccEa0Pqo"));
                startActivity(intent);
            }
        });

        btnMisal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+ "www.youtube.com/watch?v=hoZccEa0Pqo"));
                startActivity(intent);
            }
        });
    }
}






















