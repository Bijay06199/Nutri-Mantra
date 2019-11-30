package com.example.nutrimantra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView sources;
    private ImageView ivpotato;
    private ImageView ivbroccoli;
    private ImageView ivgreenbean;
    private ImageView ivspinach;
    private ImageView ivcabbage;
    private ImageView ivcauliflower;
    private ImageView ivpea;
    private ImageView iveggplant;
    private ImageView ivpomegranate;
    private ImageView ivapple;
    private ImageView ivwatermelon;
    private ImageView ivavocado;
    private ImageView ivcherry;
    private ImageView ivstrawberrry;
    private ImageView ivbanana;


    private ImageView ivapricot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        sources=(TextView)findViewById(R.id.sources);
        ivpotato= findViewById(R.id.ivpotato);
        ivbroccoli= findViewById(R.id.ivbroccoli);
        ivspinach= findViewById(R.id.ivspinach);
        ivcabbage= findViewById(R.id.ivcabbage);
        ivcauliflower=findViewById(R.id.ivcauliflower);
        ivpea=findViewById(R.id.ivpea);
        iveggplant=findViewById(R.id.iveggplant);
        ivpomegranate=findViewById(R.id.ivpomegranate);
        ivapple=findViewById(R.id.ivapple);
        ivwatermelon=findViewById(R.id.ivwatermelon);
        ivavocado=findViewById(R.id.ivavocado);
        ivcherry=findViewById(R.id.ivcherry);
        ivstrawberrry=findViewById(R.id.ivstrawberry);
        ivapricot=findViewById(R.id.ivapricot);
        ivbanana=findViewById(R.id.ivbanana);











        sources.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(MainActivity.this,SourceActivity.class);
                startActivity(intent);


            }
        });
    }







}
