package com.example.vechnet.coffeeaddictscorner;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vechnet on 2017/03/23.
 */


public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {


    Context context;
    View view;
    String[] values;
    int[] photoid;
    ViewHolder viewHolder;


    public RecyclerViewAdapter(Context context, String[] values) {
        this.context = context;
        this.values = values;
        this.photoid = photoid;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_activity, parent, false);
        viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.tv.setText(values[position]);


    }

    @Override
    public int getItemCount() {
        return values.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv;
        ImageView iv;

        public ViewHolder(View itemView) {
            super(itemView);

            tv = (TextView) itemView.findViewById(R.id.textView);
            iv = (ImageView) itemView.findViewById(R.id.imageButton);

        }


    }
}