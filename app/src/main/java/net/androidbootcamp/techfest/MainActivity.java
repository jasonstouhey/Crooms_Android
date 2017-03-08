package net.androidbootcamp.techfest;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView sponsors = (ImageView) findViewById(R.id.imgSponsors);
        ImageView workshop = (ImageView) findViewById(R.id.imgWorkshops);
        ImageView maps = (ImageView) findViewById(R.id.imgMaps);
        ImageView about = (ImageView) findViewById(R.id.imgAbout);
        ImageView policy = (ImageView) findViewById(R.id.imgPolicy);

        sponsors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainSponsors.class));
            }
        });
        workshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainWorkshop.class));
            }
        });
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainMaps.class));
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainAbout.class));
            }
        });}

}
