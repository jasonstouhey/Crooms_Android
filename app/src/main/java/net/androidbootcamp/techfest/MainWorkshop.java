package net.androidbootcamp.techfest;

        import android.app.Activity;
        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageView;

public class MainWorkshop extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_workshop);
        ImageView G9 = (ImageView)findViewById(R.id.imgView9);
        G9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainWorkshop.this, Workshops9.class));
            }
        });
    }


}
