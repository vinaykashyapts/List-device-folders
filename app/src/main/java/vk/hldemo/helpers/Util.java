package vk.hldemo.helpers;

import android.util.Log;

/**
 * Created by root on 14/9/15.
 */
public class Util {
    private static Util instance = null;

    private Util() {

    }

    public static Util getInstance() {

        if (instance == null) {
            instance = new Util();
        }

        return instance;
    }

    public void logE(String tag, String msg) {
        Log.e(tag, msg);
    }


}
