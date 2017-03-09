package net.androidbootcamp.techfest.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author jamestimberlake
 * @created 3/7/17.
 */

public class Workshop {

    @SerializedName("gradeLevels")
    public List<Integer> gradeLevels;

    @SerializedName("room")
    public String room;

    @SerializedName("presenter")
    public List<String> presenter;

    @SerializedName("business")
    public String business;

    @SerializedName("presenterPhoto")
    public String presenterPhoto;

    @SerializedName("title")
    public String title;

}
