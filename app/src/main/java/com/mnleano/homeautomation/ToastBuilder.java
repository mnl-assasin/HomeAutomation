package com.mnleano.homeautomation;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by mleano on 2/29/2016.
 */
public class ToastBuilder {

    public static void createShortToast(Context ctx, String message) {
        Toast.makeText(ctx, message, Toast.LENGTH_SHORT).show();
    }

    public static void createLongToast(Context ctx, String message) {
        Toast.makeText(ctx, message, Toast.LENGTH_LONG).show();
    }
}
