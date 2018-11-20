package com.example.administrator.zms.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.administrator.zms.R;

/**
 * Created by Administrator on 2018/11/20 0008.
 */

public class GridAdapter extends RecyclerView.Adapter<GridAdapter.LinearViewHolder> {

    private Context mContext;
    private OnItemClickListener mListener;


    public GridAdapter(Context context, OnItemClickListener listener){
        this.mContext = context;
        this.mListener = listener;

    }

    @Override
    public GridAdapter.LinearViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        return new LinearViewHolder(LayoutInflater.from(mContext).inflate(R.layout.layout_grid_item,parent));
    }

    @Override
    public void onBindViewHolder(GridAdapter.LinearViewHolder holder, final int position){
        holder.textView.setText("Hello");
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mListener.onClick(position);
            }
        });
    }

    @Override
    public int getItemCount(){

        return 80;
    }

    class LinearViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;
        public LinearViewHolder(View itemView){
            super(itemView);
            textView = itemView.findViewById(R.id.tv_title);
        }
    }

    public interface  OnItemClickListener{
        void onClick(int pos);
    }


}
