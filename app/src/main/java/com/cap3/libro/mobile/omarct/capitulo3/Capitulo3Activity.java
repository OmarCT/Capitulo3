package com.cap3.libro.mobile.omarct.capitulo3;

import android.content.res.XmlResourceParser;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.xmlpull.v1.XmlPullParser;

public class Capitulo3Activity extends AppCompatActivity {

    TextView textView;
    boolean pressed = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capitulo3);
        textView = (TextView) findViewById(R.id.text_view_rejo);
    }

    public void apretar(View view){

        if(pressed) {
            textView.setText(R.string.tv_hello);
            pressed = false;
        }
        else {
            textView.setText("Faquiu Regino-Man");
            pressed = true;
        }


    }


}
