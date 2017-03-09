package net.androidbootcamp.techfest.data;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author jamestimberlake
 * @created 3/6/17.
 */

public class WorkshopList {

    @SerializedName("sessions")
    public List<Session> sessions;

}
