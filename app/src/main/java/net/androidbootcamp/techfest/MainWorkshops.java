package net.androidbootcamp.techfest;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;

import net.androidbootcamp.techfest.data.Workshop;
import net.androidbootcamp.techfest.utils.WorkshopUtils;

import java.util.List;

public class MainWorkshops extends AppCompatActivity {

    private static final String BUNDLE_GRADE_LEVEL = "gradelevel";
    private Integer gradeLevel;
    private ListViewCompat workshopList;

    public static Intent newMainWorkshopsInstance(Context context, Integer gradeLevel){
        Intent intent = new Intent(context, MainWorkshops.class);
        intent.putExtra(BUNDLE_GRADE_LEVEL, gradeLevel);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_workshops);
        workshopList = (ListViewCompat) findViewById(R.id.workshopListView);

        gradeLevel = getIntent().getIntExtra(BUNDLE_GRADE_LEVEL,-1);

        setTitle("Grade "+gradeLevel);

        if(gradeLevel != -1) {
            List<Workshop> workshops = WorkshopUtils.getAllWorkshopsForGrade(gradeLevel);
            workshopList.setAdapter(new WorkshopsAdapter(this, R.layout.view_workshop_item, workshops, gradeLevel));
        }


    }


    private class WorkshopsAdapter extends ArrayAdapter<Workshop> {
        private Context context;
        private List<Workshop> workshopItems;
        private int currentGradeLevel;

        public WorkshopsAdapter(Context context, int resource, List<Workshop> workshops, int gradeLevel) {
            this(context, resource, workshops);
            this.currentGradeLevel = gradeLevel;
        }

        public WorkshopsAdapter(Context context, int resource, List<Workshop> workshops) {
            super(context, resource, workshops);
            this.context = context;
            this.workshopItems = workshops;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView == null) {
                LayoutInflater inflater = (LayoutInflater) context
                        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                convertView = inflater.inflate(R.layout.view_workshop_item, parent, false);
            }

            TextView title = (TextView) convertView.findViewById(R.id.workshop_title_text);
            TextView presentedBy = (TextView) convertView.findViewById(R.id.workshop_presented_by_text);
            TextView roomNumber = (TextView) convertView.findViewById(R.id.workshop_room_text);
            TextView gradeLevel = (TextView) convertView.findViewById(R.id.workshop_grades_text);

            Workshop workshopItem = workshopItems.get(position);

            title.setText(workshopItem.title);
            if(workshopItem.presenter != null && !workshopItem.presenter.isEmpty()) {
                String presenter = "By ";
                for(int i = 0; i < workshopItem.presenter.size(); i++) {

                    String presenterName = workshopItem.presenter.get(i);
                    presenter += presenterName;

                    if(i + 1 < workshopItem.presenter.size()) {
                        presenter += ", ";
                    }
                }
                presentedBy.setText(presenter);

            }

            String room = "Room - "+workshopItem.room;
            roomNumber.setText(room);

            String gradeText = "Grades: "+currentGradeLevel;
            gradeLevel.setText(gradeText);

            return convertView;
        }
    }
}
