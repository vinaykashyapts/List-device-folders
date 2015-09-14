package vk.hldemo.helpers;

import android.content.Context;
import android.graphics.Typeface;

import java.util.Hashtable;

/**
 * Created by root on 14/9/15.
 */
public class Fonts {
    private static Hashtable<String, Typeface> fontCache = new Hashtable<String, Typeface>();

    public static String RobotoCondensedBold = "fonts/RobotoCondensedBold.ttf";
    public static String RobotoLight = "fonts/RobotoLight.ttf";
    public static String RobotoMedium = "fonts/RobotoMedium.ttf";
    public static String Lilly = "fonts/Lilly.ttf";

    public static Typeface get(String name, Context context) {
        Typeface tf = fontCache.get(name);
        if(tf == null) {
            try {
                tf = Typeface.createFromAsset(context.getAssets(), name);
            }
            catch (Exception e) {
                return null;
            }
            fontCache.put(name, tf);
        }
        return tf;
    }
}
