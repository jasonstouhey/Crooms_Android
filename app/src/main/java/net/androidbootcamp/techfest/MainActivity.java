package net.androidbootcamp.techfest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import net.androidbootcamp.techfest.data.WorkshopList;
import net.androidbootcamp.techfest.utils.WorkshopUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WorkshopUtils.Initialize(this);
        ImageView button1 = (ImageView)findViewById(R.id.imgButton1);
        ImageView button2 = (ImageView)findViewById(R.id.imgButton2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainSponsors.class));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainWorkshop.class));
            }
        });

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

    }


}
