package com.example.user.showtime1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

/**
 * Created by User on 04-04-2017.
 */

public class WebPage extends AppCompatActivity {
    void onClick(View view)
    {

        Intent intent=new Intent(WebPage.this,MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wbpage);
        TextView t1=(TextView) findViewById(R.id.tv);


        Bundle extras = getIntent().getExtras();
        String newString= extras.getString("Name");
        String web=extras.getString("url");
        t1.setText(newString);
        WebView myWebView = (WebView) findViewById(R.id.webpg);
        myWebView.loadUrl(web);
        //TextView t1=getIntent().getStringExtra("Name").toString();


    }
}
