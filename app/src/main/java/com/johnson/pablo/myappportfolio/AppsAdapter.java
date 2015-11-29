package com.johnson.pablo.myappportfolio;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by Pablo on 29/11/15.
 */
public class AppsAdapter extends ArrayAdapter {

    public AppsAdapter(Context context, int resource, Object[] objects) {
        super(context, resource, objects);
        String[] apps = (String[]) objects;
    }
}
