package net.androidbootcamp.techfest;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainSponsors extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sponsors);

        ListView listSponsors = (ListView)findViewById(R.id.listSponsors);
        String[] list = {"Astronics Test Systems","Certiport, a Pearson VUE Business",
                "Convergys Corporation","DeVry University","Electronic Arts",
                "Embry-Riddle Aeronautical University","Full Sail University",
                "Greyson Technologies","Keiser University","Microsoft",
                "RLH Consulting & Management, Inc.","Florida S.P.E.C.S., Inc.",
                "Seminole State College","Siemens Energy, Inc.","Troy University",
                "The DAVE School"};
        ArrayAdapter<String> adaptor = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1);
        listSponsors.setAdapter(adaptor);
    }
}
