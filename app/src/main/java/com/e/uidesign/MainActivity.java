package com.e.uidesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.e.uidesign.utils.IconChanger;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {
      ImageView starryeffect,starcolor,coloricon,starshooting,fadeicon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        starcolor=findViewById(R.id.starcolor);//done
        starryeffect=findViewById(R.id.starryeffect);//done
        coloricon=findViewById(R.id.coloricon);//done
        starshooting=findViewById(R.id.starshooting);//done
        fadeicon=findViewById(R.id.fadeicon);//done


        coloricon.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if(event.getAction()==MotionEvent.ACTION_UP){


                    IconChanger.change(getApplicationContext(),coloricon,R.drawable.coloricon_90x90_white);

                }else if(event.getAction()==MotionEvent.ACTION_DOWN){

                    IconChanger.change(getApplicationContext(),coloricon,R.drawable.coloricon_90x90);


                }
                return true;
            }
        });

        starryeffect.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_UP){

                    System.out.println("Action UP");

                    IconChanger.change(getApplicationContext(),starryeffect,R.drawable.starryeffect_90x90);

                }else if(event.getAction()==MotionEvent.ACTION_DOWN){

                    System.out.println("ACtion Down");
                    IconChanger.change(getApplicationContext(),starryeffect,R.drawable.starryeffectover_90x90);


                }
                return true;
            }
        });

        starshooting.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_UP){

                    System.out.println("Action UP");

                    IconChanger.change(getApplicationContext(),starshooting,R.drawable.starryshootingstar_90x90);

                }else if(event.getAction()==MotionEvent.ACTION_DOWN){

                    System.out.println("ACtion Down");
                    IconChanger.change(getApplicationContext(),starshooting,R.drawable.starryshootingstarover_90x90);


                }
                return true;
            }
        });


        fadeicon.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_UP){

                    System.out.println("Action UP");

                    IconChanger.change(getApplicationContext(),fadeicon,R.drawable.fadeicon_90x90_white);

                }else if(event.getAction()==MotionEvent.ACTION_DOWN){

                    System.out.println("ACtion Down");
                    IconChanger.change(getApplicationContext(),fadeicon,R.drawable.fadeicon_90x90);


                }
                return true;
            }
        });

        starcolor.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_UP){

                    System.out.println("Action UP");

                    IconChanger.change(getApplicationContext(),starcolor,R.drawable.starrycolor_90x90);

                }else if(event.getAction()==MotionEvent.ACTION_DOWN){

                    System.out.println("ACtion Down");
                    IconChanger.change(getApplicationContext(),starcolor,R.drawable.starrycolorover_90x90);


                }
                return true;
            }
        });




    }



}
