package com.dssp.differentdialogs;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ProgressBar;

/**
 * Created by dhanrajnaik522 on 7/30/2016.
 */
public class CustomProgressBar1Activity extends AppCompatActivity {

    private ProgressDialog progressDialog = null;
    private Context context = CustomProgressBar1Activity.this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_progress_bar1);

        progressDialog = new ProgressDialog(context);
        progressDialog.show();
        progressDialog.setContentView(R.layout.item_progress_dialog);
        progressDialog.setCancelable(false);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                progressDialog.dismiss();
            }
        },9000);
    }

    @Override
    public void onBackPressed() {
      //  super.onBackPressed();


    }
}
