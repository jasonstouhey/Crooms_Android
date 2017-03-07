package net.androidbootcamp.techfest.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author jamestimberlake
 * @created 3/6/17.
 */

public class Session {

    @SerializedName("sessionStartTime")
    public String sessionStartTime;

    @SerializedName("sessionEndTime")
    public String sessionEndTime;

    @SerializedName("sessionNumber")
    public Integer sessionNumber;

    @SerializedName("keynote")
    public Workshop keynote;

    @SerializedName("presentations")
    public List<Object> presentations;
}
