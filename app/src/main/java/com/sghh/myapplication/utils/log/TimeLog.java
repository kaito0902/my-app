package com.sghh.myapplication.utils.log;

import android.util.Log;

public class TimeLog {
    public static void start(String tag, String method) {
        Log.d(tag, method + " <");
    }

    public static void end(String tag, String method) {
        Log.d(tag, method + " >");
    }
}
