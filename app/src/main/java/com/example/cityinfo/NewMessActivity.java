package com.example.cityinfo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class NewMessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_mess);
        ActionBar actionBar = getSupportActionBar();
        TextView mDetailTv = findViewById(R.id.textView);
        TextView mDetailTv2 = findViewById(R.id.textView2);
        TextView mDetailTv3 = findViewById(R.id.textView3);
        TextView mDetailTv4 = findViewById(R.id.textView4);
        TextView mDetailTv5 = findViewById(R.id.textView5);
        TextView mDetailTv6 = findViewById(R.id.textView6);
        TextView mDetailTv7 = findViewById(R.id.textView7);
        ImageView img = findViewById(R.id.image);
        Bundle bundle = getIntent().getExtras();
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        int i = bundle.getInt("resid");
        String mContent = intent.getStringExtra("contentTv");
        String mContent2 = intent.getStringExtra("contentTv2");
        String mContent4 = intent.getStringExtra("contentTv4");
        String mContent5 = intent.getStringExtra("contentTv5");
        String mContent6 = intent.getStringExtra("contentTv6");
        String mContent7 = intent.getStringExtra("contentTv7");
        String mContent3 = intent.getStringExtra("contentTv3");

        actionBar.setTitle(mActionBarTitle);
        mDetailTv.setText(mContent);
        mDetailTv2.setText(mContent2);
        mDetailTv4.setText(mContent4);
        mDetailTv5.setText(mContent5);
        mDetailTv6.setText(mContent6);
        mDetailTv7.setText(mContent7);
        mDetailTv3.setText(mContent3);
        img.setImageResource(i);
    }
}
