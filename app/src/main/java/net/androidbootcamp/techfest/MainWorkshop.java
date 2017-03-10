package net.androidbootcamp.techfest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainWorkshop extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_workshop);



        findViewById(R.id.grade9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(MainWorkshops.newMainWorkshopsInstance(MainWorkshop.this, 9));
            }
        });

        findViewById(R.id.grade10).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(MainWorkshops.newMainWorkshopsInstance(MainWorkshop.this, 10));
            }
        });

        findViewById(R.id.grade11).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(MainWorkshops.newMainWorkshopsInstance(MainWorkshop.this, 11));
            }
        });

        findViewById(R.id.grade12).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(MainWorkshops.newMainWorkshopsInstance(MainWorkshop.this, 12));
            }
        });
    }
}
