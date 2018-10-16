package com.example.administrator.zms;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2018/10/15 0015.
 */

public class ItemGroup extends FrameLayout{

    public ItemGroup(Context context){
        super(context);
    }

    public ItemGroup(Context context, AttributeSet attrs){
        super(context,attrs);
    }

    public ItemGroup(Context context, AttributeSet attrs, int defStyleAttr){
        super(context,attrs,defStyleAttr);
    }

    private void initAttrs(Context context,AttributeSet attrs){
        TypedArray typedArray = context.obtainStyledAttributes(attrs,R.styleable.ItemGroup);
        String strTitle = typedArray.getString(R.styleable.ItemGroup_title);
        Drawable drawableLeft = typedArray.getDrawable(R.styleable.ItemGroup_drawable_left);
        Drawable drawableright = typedArray.getDrawable(R.styleable.ItemGroup_drawable_right);
        float lineHeight = typedArray.getInt(R.styleable.ItemGroup_line_height,1);
        int lineColor = typedArray.getColor(R.styleable.ItemGroup_line_color,0xff999999);
        typedArray.recycle();

    }


}
