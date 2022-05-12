package com.example.ielts_by_kinjal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class dashboard extends AppCompatActivity {

    public CardView listening, reading, writing, speaking, tips, lessons;
    Button button_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //Share Button
        button_share = (Button) findViewById(R.id.button_share);
        button_share.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Your Body Here";
                String shareSub = "Your Subject Here";
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareSub);
                myIntent.putExtra(Intent.EXTRA_SUBJECT, shareBody);
                startActivity(Intent.createChooser(myIntent, "Share Using"));
            }
        });

        //CardView Data Selected
        listening = (CardView) findViewById(R.id.listeningView);
        listening.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Listening Module Selected", Toast.LENGTH_LONG).show();
                Intent i = new Intent(dashboard.this, listening.class);
                startActivity(i);
            }
        });
        reading = (CardView) findViewById(R.id.readingView);
        reading.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Reading Module Selected", Toast.LENGTH_LONG).show();
                Intent i = new Intent(dashboard.this, reading.class);
                startActivity(i);
            }
        });
        writing = (CardView) findViewById(R.id.writingView);
        writing.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Writing Module Selected", Toast.LENGTH_LONG).show();
                Intent i = new Intent(dashboard.this, writing.class);
                startActivity(i);
            }
        });
        speaking = (CardView) findViewById(R.id.speakingView);
        speaking.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Speaking Module Selected", Toast.LENGTH_LONG).show();
                Intent i = new Intent(dashboard.this, speaking.class);
                startActivity(i);
            }
        });
        tips = (CardView) findViewById(R.id.tipsView);
        tips.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Tips Selected", Toast.LENGTH_LONG).show();
                Intent i = new Intent(dashboard.this, tips.class);
                startActivity(i);
            }
        });
        lessons = (CardView) findViewById(R.id.lessonsView);
        lessons.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Lessons Selected", Toast.LENGTH_LONG).show();
                Intent i = new Intent(dashboard.this, lessons.class);
                startActivity(i);
            }
        });
    }
}


























    //
//    //PopUp Menu
//    public void showPopup(View v){
//        PopupMenu popup = new PopupMenu(this,v);
//        popup.setOnMenuItemClickListener(this);
//        popup.inflate(R.menu.popup_menu);
//        popup.show();
//    }
//
