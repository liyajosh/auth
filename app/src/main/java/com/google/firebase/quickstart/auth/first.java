package com.google.firebase.quickstart.auth;

import android.app.ActionBar;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spannable;
import android.text.SpannableString;
import android.widget.TextView;

import static com.google.firebase.quickstart.auth.R.string.app_name;

public class first extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        TextView tv = (TextView) findViewById(R.id.textView);
        Typeface face = Typeface.createFromAsset(getAssets(),
                "fonts/nzoda.ttf");
        tv.setTypeface(face);

        //Typeface face = Typeface.createFromAsset(getAssets(),
                //"fonts/nzoda.ttf");
       // app_name.setTypeface(face);
        //int actionBarTitle = Resources.getSystem().getIdentifier("action_bar_title", "id", "android");
        //TextView actionBarTitleView = (TextView) getWindow().findViewById(actionBarTitle);
        //actionBarTitleView.setTypeface(face);
        /*SpannableString s = new SpannableString("Trailoo");
        s.setSpan(new TypefaceSpan(this, "nzoda.ttf"), 0, s.length(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

// Update the action bar title with the TypefaceSpan instance
        ActionBar actionBar = getActionBar();
        actionBar.setTitle(s);*/

        Handler mHandler = new Handler();
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(first.this, ChooserActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
                        | Intent.FLAG_ACTIVITY_NEW_TASK
                        | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i);
            }

        }, 2000L);


    }
}
