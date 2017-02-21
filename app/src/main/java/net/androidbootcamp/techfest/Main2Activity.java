package net.androidbootcamp.techfest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageButton imgSponsor1 = (ImageButton)findViewById(R.id.imgSponsor1);
        ImageButton imgSponsor2 = (ImageButton)findViewById(R.id.imgSponsor2);
        ImageButton imgSponsor3 = (ImageButton)findViewById(R.id.imgSponsor3);
        ImageButton imgSponsor4 = (ImageButton)findViewById(R.id.imgSponsor4);
        ImageButton imgSponsor5 = (ImageButton)findViewById(R.id.imgSponsor5);
        ImageButton imgSponsor6 = (ImageButton)findViewById(R.id.imgSponsor6);
        imgSponsor1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, Sponsor1.class));
            }
        });
        imgSponsor2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, Sponsor2.class));
            }
        });
        imgSponsor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, Sponsor3.class));
            }
        });
        imgSponsor4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, Sponsor4.class));
            }
        });
        imgSponsor5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, Sponsor5.class));
            }
        });
        imgSponsor6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Main2Activity.this, Sponsor6.class));
            }
        });
    }
}
