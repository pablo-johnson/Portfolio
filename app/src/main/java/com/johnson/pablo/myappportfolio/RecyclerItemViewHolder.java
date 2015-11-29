package com.johnson.pablo.myappportfolio;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Pablo on 29/11/15.
 */
public class RecyclerItemViewHolder extends RecyclerView.ViewHolder  implements RecyclerItemInterface{
    public final TextView mItemTextView;

    public RecyclerItemViewHolder(final View parent, TextView itemTextView) {
        super(parent);
        mItemTextView = itemTextView;
    }

    public static RecyclerItemViewHolder newInstance(View parent) {
        TextView itemTextView = (TextView) parent.findViewById(R.id.appItem);
        return new RecyclerItemViewHolder(parent, itemTextView);
    }

    @Override
    public void setItemText(CharSequence text) {
        mItemTextView.setText(text);
    }

}
