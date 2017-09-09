package com.example.irannapatil.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by TutorialsPoint7 on 8/23/2016.
 */
public class MyReceiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("Intent recieved ", intent.toString());
        Toast.makeText(context, "Intent Detected.", Toast.LENGTH_LONG).show();
    }
}