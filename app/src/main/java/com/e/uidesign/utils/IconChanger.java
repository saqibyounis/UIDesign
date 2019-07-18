package com.e.uidesign.utils;

import android.content.Context;
import android.widget.ImageView;

public class IconChanger {


    public static void change(Context context,ImageView imageView, int id){
        imageView.setImageDrawable(context.getDrawable(id));


    }
}
