package com.sghh.myapplication.ui.home;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;

import androidx.lifecycle.ViewModel;

import com.sghh.myapplication.R;
import com.sghh.myapplication.utils.log.TimeLog;

public class HomeViewModel extends ViewModel {
    private final String TAG = "HomeViewModel";

    public HomeViewModel() {
    }

    @SuppressLint("NonConstantResourceId")
    public void setTime(View view) {
        final String method = "setTime";
        TimeLog.start(TAG, method);

        switch (view.getId()) {
            case R.id.time5:
                Log.d(TAG, "5が押されたよ");
                break;
            case R.id.time10:
                Log.d(TAG, "10が押されたよ");
                break;
            case R.id.time15:
                Log.d(TAG, "15が押されたよ");
                break;
            case R.id.time20:
                Log.d(TAG, "20が押されたよ");
                break;
            case R.id.time25:
                Log.d(TAG, "25が押されたよ");
                break;
            case R.id.time30:
                Log.d(TAG, "30が押されたよ");
                break;
            case R.id.time35:
                Log.d(TAG, "35が押されたよ");
                break;
            case R.id.time40:
                Log.d(TAG, "40が押されたよ");
                break;
            case R.id.time45:
                Log.d(TAG, "45が押されたよ");
                break;
            case R.id.time50:
                Log.d(TAG, "50が押されたよ");
                break;
            case R.id.time55:
                Log.d(TAG, "55が押されたよ");
                break;
            case R.id.time60:
                Log.d(TAG, "60が押されたよ");
                break;
        }

        TimeLog.end(TAG, method);
    }
}