package net.androidbootcamp.techfest.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author jamestimberlake
 * @created 3/6/17.
 */

public class Workshops {

    @SerializedName("sessions")
    public List<String> sessions;

}
