package com.confirm.speedometertask.util;

import android.content.Context;
import android.location.Location;

import com.confirm.speedometertask.R;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Date;

public class Utils {

    public static String getSpeedText(Location location) {
        return location == null ? "Unknown" :
                new DecimalFormat("#.#")
                        .format((location.getSpeed() * 3600) / 1000 + " Kmh");
    }

    public static String getLocationTitle(Context context) {
        return context.getString(R.string.location_updated,
                DateFormat.getDateTimeInstance().format(new Date()));
    }
}
