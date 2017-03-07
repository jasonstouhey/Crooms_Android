package net.androidbootcamp.techfest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainWorkshop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_workshop);
        ImageView G9 = (ImageView)findViewById(R.id.imgView9);
        ImageView G10 = (ImageView)findViewById(R.id.imgView10);
        ImageView G11 = (ImageView)findViewById(R.id.imgView11);
        ImageView G12 = (ImageView)findViewById(R.id.imgView12);

    }
}
