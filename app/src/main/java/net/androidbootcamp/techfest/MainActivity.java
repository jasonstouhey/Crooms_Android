package net.androidbootcamp.techfest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView sponsors = (ImageView)findViewById(R.id.imgSponsors);
        ImageView workshops = (ImageView)findViewById(R.id.imgWorkshops);
        ImageView maps = (ImageView)findViewById(R.id.imgMaps);
        ImageView about = (ImageView)findViewById(R.id.imgAbout);
        ImageView policy = (ImageView)findViewById(R.id.imgPolicy);
        sponsors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainSponsors.class));
            }
        });
        workshops.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainWorkshop.class));
            }
        });


/*
        ImageView button3 = (ImageView)findViewById(R.id.imgButton3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Maps.class));
            }
        });

        ImageView button4 = (ImageView)findViewById(R.id.imgButton4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, About.class));
            }
        });
*/
    }


}
