package com.charlezz.starbucks.logger;

import android.util.Log;

public class Logger {
    public void e(String tag, String message) {
        Log.e(tag, message);
    }

    public void w(String tag, String message) {
        Log.w(tag, message);
    }

    public void v(String tag, String message) {
        Log.v(tag, message);
    }

    public void d(String tag, String message) {
        Log.d(tag, message);
    }
}
