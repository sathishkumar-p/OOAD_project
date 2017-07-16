package com.example.user.showtime1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by User on 04-04-2017.
 */

public class Series extends AppCompatActivity {
    void onClick(View view)
    {

        Intent intent=new Intent(Series.this,MainActivity.class);
        startActivity(intent);
    }

    void webso1(View view)
    {
        Intent intent;
        switch (view.getId())
        {
            case R.id.b1:  intent=new Intent(Series.this,WebPage.class);
                intent.putExtra("Name","Arrow SEASON 1");
                intent.putExtra("url","http://dl2.my98music.com/Data/Serial/Arrow/S01/");
                startActivity(intent);
                break;
            case R.id.b2:intent=new Intent(Series.this,WebPage.class);
                intent.putExtra("Name","Arrow SEASON 2");
                intent.putExtra("url","http://dl2.my98music.com/Data/Serial/Arrow/S02/");
                startActivity(intent);
                break;
            case R.id.b3:intent=new Intent(Series.this,WebPage.class);
                intent.putExtra("Name","Arrow SEASON 3");
                intent.putExtra("url","http://dl2.my98music.com/Data/Serial/Arrow/S03/");
                startActivity(intent);
                break;
            case R.id.b4: intent=new Intent(Series.this,WebPage.class);
                intent.putExtra("Name","Arrow SEASON 4");
                intent.putExtra("url","http://dl2.my98music.com/Data/Serial/Arrow/S04/");
                startActivity(intent);
                break;
            case R.id.b5:intent=new Intent(Series.this,WebPage.class);
                intent.putExtra("Name","Arrow SEASON 5");
                intent.putExtra("url","http://dl2.my98music.com/Data/Serial/Arrow/S05/");
                startActivity(intent);
                break;
            case R.id.b6:intent=new Intent(Series.this,WebPage.class);
                intent.putExtra("Name","The Flash SEASON 1");
                intent.putExtra("url","http://dl2.my98music.com/Data/Serial/The%20Flash/S01/");
                startActivity(intent);
                break;
            case R.id.b7:intent=new Intent(Series.this,WebPage.class);
                intent.putExtra("Name","The Flash SEASON 2");
                intent.putExtra("url","http://dl2.my98music.com/Data/Serial/The%20Flash/S02/");
                startActivity(intent);
                break;
            case R.id.b8:intent=new Intent(Series.this,WebPage.class);
                intent.putExtra("Name","The Flash SEASON 3");
                intent.putExtra("url","http://dl2.my98music.com/Data/Serial/The%20Flash/S03/");
                startActivity(intent);
                break;
            case R.id.b9:intent=new Intent(Series.this,WebPage.class);
                intent.putExtra("Name","12 Monkyes SEASON 1");
                intent.putExtra("url","http://dl2.my98music.com/Data/Serial/12%20Monkeys/Season%201/");
                startActivity(intent);
                break;
            case R.id.b10:intent=new Intent(Series.this,WebPage.class);
                intent.putExtra("Name","12 Monkyes SEASON 2");
                intent.putExtra("url","http://dl2.my98music.com/Data/Serial/12%20Monkeys/Season%202/");
                startActivity(intent);
                break;
            case R.id.b11:intent=new Intent(Series.this,WebPage.class);
                intent.putExtra("Name","Eye Candy Season 1");
                intent.putExtra("url","http://dl2.my98music.com/Data/Serial/Eye%20Candy/Season%201/");
                startActivity(intent);
                break;
            case R.id.b12:intent=new Intent(Series.this,WebPage.class);
                intent.putExtra("Name","How To Get Away With Murder Season 1");
                intent.putExtra("url","http://dl2.my98music.com/Data/Serial/How%20to%20Get%20Away%20with%20Murder/S01/");
                startActivity(intent);
                break;
            case R.id.b13:intent=new Intent(Series.this,WebPage.class);
                intent.putExtra("Name","How To Get Away With Murder Season 2");
                intent.putExtra("url","http://dl2.my98music.com/Data/Serial/How%20to%20Get%20Away%20with%20Murder/S02/");
                startActivity(intent);
                break;




        }


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle extras = getIntent().getExtras();
        String img= extras.getString("no");

        switch(img)
        {
            case "0":setContentView(R.layout.arrow_season);
                break;
            case "1":setContentView(R.layout.flash_season);
                break;
            case "2":setContentView(R.layout.tmonkeys);
                break;
            case "3":setContentView(R.layout.eyecandy);
                break;
            case "4":setContentView(R.layout.htgawm);
                break;


        }



    }

}