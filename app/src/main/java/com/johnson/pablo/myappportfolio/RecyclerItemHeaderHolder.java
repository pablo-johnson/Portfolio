package com.johnson.pablo.myappportfolio;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Pablo on 29/11/15.
 */
public class RecyclerItemHeaderHolder extends RecyclerView.ViewHolder implements RecyclerItemInterface {
    private final TextView mItemTextView;

    public RecyclerItemHeaderHolder(final View parent, TextView itemTextView) {
        super(parent);
        mItemTextView = itemTextView;
    }

    public static RecyclerItemHeaderHolder newInstance(View parent) {
        TextView itemTextView = (TextView) parent.findViewById(R.id.nanodegreeTitle);
        return new RecyclerItemHeaderHolder(parent, itemTextView);
    }

    @Override
    public void setItemText(CharSequence text) {
        mItemTextView.setText(text);
    }

}
