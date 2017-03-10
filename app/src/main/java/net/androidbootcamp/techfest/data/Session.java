package net.androidbootcamp.techfest.data;

import com.google.gson.annotations.SerializedName;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author jamestimberlake
 * @created 3/6/17.
 */

public class Session implements Comparable<Session>{

    private static SimpleDateFormat sessionDateInputFomatter = new SimpleDateFormat("hh:mm");

    private static SimpleDateFormat sessionDateOutputFomatter = new SimpleDateFormat("hh:mm a");

    @SerializedName("sessionStartTime")
    public String sessionStartTime;

    @SerializedName("sessionEndTime")
    public String sessionEndTime;

    @SerializedName("sessionNumber")
    public Integer sessionNumber;

    @SerializedName("keynote")
    public Workshop keynote;

    @SerializedName("presentations")
    public List<Presentation> presentations;

    public Date getSessionStartTime() {
        try {
            Date sessionDate = sessionDateInputFomatter.parse(sessionStartTime);
            return sessionDate;
        } catch (ParseException ex) {
            return new Date();
        }
    }


    public String getReadableSessionStartTime() {
        try {
            Date sessionDate = sessionDateInputFomatter.parse(sessionStartTime);
            return sessionDateOutputFomatter.format(sessionDate);
        } catch (ParseException ex) {
            return "";
        }
    }

    public Date getSessionEndTime() {
        try {
            Date sessionDate = sessionDateInputFomatter.parse(sessionEndTime);
            return sessionDate;
        } catch (ParseException ex) {
            return new Date();
        }
    }


    public String getReadableSessionEndTime() {
        try {
            Date sessionDate = sessionDateInputFomatter.parse(sessionEndTime);
            return sessionDateOutputFomatter.format(sessionDate);
        } catch (ParseException ex) {
            return "";
        }
    }



    @Override
    public int compareTo(Session f) {
        return this.getSessionStartTime().compareTo(f.getSessionStartTime());
    }

}
