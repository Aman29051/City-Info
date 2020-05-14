package com.example.cityinfo;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class NewMessActivity extends AppCompatActivity {

    private Toast mToastToShow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_mess);
        ActionBar actionBar = getSupportActionBar();
        TextView mDetailTv = findViewById(R.id.textView);
        TextView mDetailTv2 = findViewById(R.id.textView2);
        TextView mDetailTv3 = findViewById(R.id.textView10);
        TextView mDetailTv4 = findViewById(R.id.textView3);
        TextView mDetailTv5 = findViewById(R.id.textView5);
        TextView mDetailTv6 = findViewById(R.id.textView4);
        TextView mDetailTv7 = findViewById(R.id.textView6);
        final TextView mDetailTv8 = findViewById(R.id.textView8);
        TextView mDetailTv9 = findViewById(R.id.textView9);
        TextView mDetailTv10 = findViewById(R.id.textView7);
        //TextView mDetailTv11 = findViewById(R.id.textView11);
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
        String mContent10 = intent.getStringExtra("contentTv10");
        String mContent8 = intent.getStringExtra("contentTv8");
        String mContent9 = intent.getStringExtra("contentTv9");
        String mContent3 = intent.getStringExtra("contentTv3");



        mDetailTv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = mDetailTv8.getText().toString();
                ClipboardManager clipboardManager = (ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText("Data",value);
                clipboardManager.setPrimaryClip(clipData);
                Toast.makeText(getApplicationContext(),"Copied to ClipBoard!!",Toast.LENGTH_LONG).show();

            }
        });
        mDetailTv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(NewMessActivity.this, LocationActivity.class);
//                Toast.makeText(getApplicationContext(),"First click on blue then red.",Toast.LENGTH_LONG).show();
                startActivity(int1);


                    int durationInMS = 10000;
                    mToastToShow =  Toast.makeText(getApplicationContext(),"Click on the blue mark.",Toast.LENGTH_LONG);

                    CountDownTimer toastCountDown;
                    toastCountDown = new CountDownTimer(durationInMS, 1000) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            mToastToShow.show();
                        }
                        @Override
                        public void onFinish() {
                            mToastToShow.cancel();
                        }
                    };
                    mToastToShow.show();
                    toastCountDown.start();

            }
        });

        actionBar.setTitle(mActionBarTitle);
        mDetailTv.setText(mContent);
        mDetailTv2.setText(mContent2);
        mDetailTv4.setText(mContent4);
        mDetailTv5.setText(mContent5);
        mDetailTv6.setText(mContent6);
        mDetailTv7.setText(mContent7);
        mDetailTv10.setText(mContent10);
        mDetailTv8.setText(mContent8);
        mDetailTv9.setText(mContent9);
        mDetailTv3.setText(mContent3);
        img.setImageResource(i);
    }
}
