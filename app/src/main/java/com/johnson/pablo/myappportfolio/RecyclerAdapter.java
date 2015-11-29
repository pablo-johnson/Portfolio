package com.johnson.pablo.myappportfolio;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.List;

/**
 * @author Pablo Johnson
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final Context mContext;
    private List<String> mItemList;

    public RecyclerAdapter(Context context, List<String> itemList) {
        mItemList = itemList;
        mContext = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case 0:
                return RecyclerItemHeaderHolder
                        .newInstance(LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_main_header, parent, false));
            case 1:
                return RecyclerItemViewHolder
                        .newInstance(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_apps, parent, false));
        }
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        if (position > 0) {
            RecyclerItemInterface holder = (RecyclerItemInterface) viewHolder;
            final String itemText = mItemList.get(position);
            holder.setItemText(itemText);

            ((RecyclerItemViewHolder) viewHolder).mItemTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), itemText, Toast.LENGTH_SHORT).show();
                }
            });
            if (position == getItemCount() - 1) {
                ((RecyclerItemViewHolder) viewHolder).mItemTextView
                        .setBackgroundColor(mContext.getResources().getColor(R.color.colorUltra));
                ((RecyclerItemViewHolder) viewHolder).mItemTextView.setTextColor(Color.WHITE);
            }
        }
    }

    @Override
    public int getItemCount() {
        return mItemList == null ? 0 : mItemList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return 0;
        }
        return 1;
    }

}
