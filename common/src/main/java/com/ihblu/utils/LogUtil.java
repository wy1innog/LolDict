package com.ihblu.utils;

import android.util.Log;

import com.ihblu.common.app.Constants;

public class LogUtil {

    private static final String TAG = "LogUtil";
    /**
     * 是否打印日志 false : 不打印日志信息，true : 打印日志信息
     */
    public final static boolean IS_DEBUG = true;
    public final static boolean IS_AUDIO_DEBUG = false;
    /**
     * 日志的默认TAG
     */
    public final static String DEFAULT_LOG_TAG = "LolDict-" + Constants.VERSION;

    /**
     * 打印日志
     */
    public static void i(String tag, String msg) {
        if (IS_DEBUG) {
            if (msg == null || "".equals(msg)) {
                msg = TAG;
            }
            Log.i(DEFAULT_LOG_TAG + tag, msg);
        }
    }

    public static void i(String msg) {
        if (IS_DEBUG) {
            if (msg == null || "".equals(msg)) {
                msg = TAG;
            }
            Log.i(DEFAULT_LOG_TAG, msg);
        }
    }

    /**
     * 打印日志
     */
    public static void e(String tag, String msg) {
        if (IS_DEBUG) {
            if (msg == null || "".equals(msg)) {
                msg = TAG;
            }
            Log.e(DEFAULT_LOG_TAG + tag, msg);
        }
    }

    public static void e(String msg) {
        if (IS_DEBUG) {
            if (msg == null || "".equals(msg)) {
                msg = TAG;
            }
            Log.e(DEFAULT_LOG_TAG, msg);
        }
    }

    /**
     * 打印日志
     */
    public static void d(String tag, String msg) {
        if (IS_DEBUG) {
            if (msg == null || "".equals(msg)) {
                msg = TAG;
            }
            Log.d(DEFAULT_LOG_TAG + tag, msg);
        }
    }

    /**
     * 打印日志
     */
    public static void d(String msg) {
        if (IS_DEBUG) {
            if (msg == null || "".equals(msg)) {
                msg = TAG;
            }
            Log.d(DEFAULT_LOG_TAG, msg);
        }
    }

    public static void a(String tag, String msg) {
        if (IS_AUDIO_DEBUG) {
            if (msg == null || "".equals(msg)) {
                msg = TAG;
            }
            Log.d(DEFAULT_LOG_TAG + tag, msg);
        }
    }

    public static void a(String msg) {
        if (IS_AUDIO_DEBUG) {
            if (msg == null || "".equals(msg)) {
                msg = TAG;
            }
            Log.d(DEFAULT_LOG_TAG, msg);
        }
    }

    /**
     * 打印日志
     */
    public static void w(String tag, String msg) {
        if (IS_DEBUG) {
            if (msg == null || "".equals(msg)) {
                msg = TAG;
            }
            Log.w(DEFAULT_LOG_TAG + tag, msg);
        }
    }

    /**
     * 打印日志
     */
    public static void w(String msg) {
        if (IS_DEBUG) {
            if (msg == null || "".equals(msg)) {
                msg = TAG;
            }
            Log.w(DEFAULT_LOG_TAG, msg);
        }
    }

    /**
     * 打印日志
     */
    public static void v(String tag, String msg) {
        if (IS_DEBUG) {
            if (msg == null || "".equals(msg)) {
                msg = TAG;
            }
            Log.w(DEFAULT_LOG_TAG + tag, msg);
        }
    }

    /**
     * 打印日志
     */
    public static void v(String msg) {
        if (IS_DEBUG) {
            if (msg == null || "".equals(msg)) {
                msg = TAG;
            }
            Log.w(DEFAULT_LOG_TAG, msg);
        }
    }

    /**
     * 打印日志(打包后也需要打印的日志)
     */
    public static void eSys(String tag, String msg) {
        if (IS_DEBUG) {
            if (msg == null || "".equals(msg)) {
                msg = "LogUtilSys";
            }
            Log.e(DEFAULT_LOG_TAG + tag, msg);
        }
    }
}