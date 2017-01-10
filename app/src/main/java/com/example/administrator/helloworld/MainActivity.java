package com.example.administrator.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_film;
    Button btn_news;
    Button btn_reader;
    Button btn_sharea;
    Button btn_design;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_film= (Button) findViewById(R.id.film);
        btn_news= (Button) findViewById(R.id.news);
        btn_reader= (Button) findViewById(R.id.reader);
        btn_design= (Button) findViewById(R.id.design);
        btn_sharea= (Button) findViewById(R.id.shares);
        btn_film.setOnClickListener(this);
        btn_news.setOnClickListener(this);
        btn_reader.setOnClickListener(this);
        btn_design.setOnClickListener(this);
        btn_sharea.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.film:
                Toast.makeText(this,"film",Toast.LENGTH_SHORT).show();
                break;
            case R.id.shares:
                Toast.makeText(this,"shares",Toast.LENGTH_SHORT).show();
                break;
            case R.id.reader:
                Toast.makeText(this,"reader",Toast.LENGTH_SHORT).show();
                break;
            case R.id.design:
                Toast.makeText(this,"design",Toast.LENGTH_SHORT).show();
                break;
            case R.id.news:
                Toast.makeText(this,"news",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
