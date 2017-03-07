package net.androidbootcamp.techfest.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author jamestimberlake
 * @created 3/7/17.
 */

public class Presentation {

    @SerializedName("gradeLevels")
    public List<Integer> gradeLevels;

    @SerializedName("workshops")
    public List<Workshop> workshops;
}
