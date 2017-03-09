package net.androidbootcamp.techfest.utils;

import android.content.Context;
import android.support.annotation.NonNull;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import net.androidbootcamp.techfest.R;
import net.androidbootcamp.techfest.data.WorkshopList;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author jamestimberlake
 * @created 3/7/17.
 */

public class WorkshopUtils {

    private static WorkshopList workshopList;

    public static void Initialize(Context context) {
        workshopList = getWorkshopListFromSource(context);
    }

    @NonNull
    public static List<String> getAllGrades() {
        return new ArrayList<>();
    }

    @NonNull
    public static List<String> getAllRoomsForGrade(String grade) {
        return new ArrayList<>();
    }

    @NonNull
    public static List<Object> getAllWorkshopsForRoom(String grade, String room) {
        return new ArrayList<>();
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
