package net.androidbootcamp.techfest.utils;

import android.content.Context;
import android.support.annotation.NonNull;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import net.androidbootcamp.techfest.R;
import net.androidbootcamp.techfest.data.Presentation;
import net.androidbootcamp.techfest.data.Session;
import net.androidbootcamp.techfest.data.Workshop;
import net.androidbootcamp.techfest.data.WorkshopList;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jamestimberlake
 * @created 3/7/17.
 */

public class WorkshopUtils {

    private static WorkshopList workshopList;
    private static Map<Integer, Integer> grades = new HashMap<>();

    public static void Initialize(Context context) {
        workshopList = getWorkshopListFromSource(context);
    }

    @NonNull
    public static List<Integer> getAllGrades() {

        List<Integer> gradeLevels = new ArrayList<>();

        if(workshopList != null) {
            for(Session session : workshopList.sessions) {
                if(session.keynote != null){
                    for(Integer grade : session.keynote.gradeLevels) {
                        if (grades.get(grade) == null) {
                            grades.put(grade, grade);
                        }
                    }
                }

                if(session.presentations != null && !session.presentations.isEmpty()){
                    for(Presentation presentation : session.presentations) {
                        for(Integer grade : presentation.gradeLevels) {
                            if (grades.get(grade) == null) {
                                grades.put(grade, grade);
                            }
                        }
                    }
                }
            }
        }

        for(Integer grade : grades.values()) {
            gradeLevels.add(grade);
        }

        return gradeLevels;
    }


    @NonNull
    public static List<Workshop> getAllWorkshopsForGrade(Integer selectedGrade) {
        List<Workshop> workshops = new ArrayList<>();
        if(workshopList != null) {

            Collections.sort(workshopList.sessions);

            for(Session session : workshopList.sessions) {
                if (session.keynote != null) {
                    for (Integer grade : session.keynote.gradeLevels) {
                        if ( selectedGrade.equals(grade)) {
                            session.keynote.isKeynote = true;
                            session.keynote.time = getSessionTimeString(session);
                            workshops.add(session.keynote);
                            break;
                        }
                    }
                }

                if (session.presentations != null && !session.presentations.isEmpty()) {
                    for (Presentation presentation : session.presentations) {
                        for (Integer grade : presentation.gradeLevels) {
                            if ( selectedGrade.equals(grade)) {
                                for(Workshop workshop : presentation.workshops) {
                                    workshop.time = getSessionTimeString(session);
                                }
                                workshops.addAll(presentation.workshops);
                                continue;
                            }
                        }
                    }
                }
            }
        }

        return workshops;
    }

    private static String getSessionTimeString(Session session) {
        return session.getReadableSessionStartTime() + " - " + session.getReadableSessionEndTime();
    }


    private static WorkshopList getWorkshopListFromSource(Context context) {
        InputStream inputStream = context.getResources().openRawResource(R.raw.workshops);

        try {
            byte[] b = new byte[inputStream.available()];
            inputStream.read(b);
            String response = new String(b);

           return new GsonBuilder().create().fromJson(response, WorkshopList.class);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (Exception e) {
             e.printStackTrace();
        }
        return null;
    }
}
