package com.alexbat98.excache.lib;

import android.content.Context;
import android.util.Log;

import java.io.File;

/**
 * Created by Alexander Batashev on 27.04.2014.
 */
public class FileCache {
    private final String TAG = "ExCache_FileCache";
    private File cacheDir;

    // We will store all the stuff here.
    private final String CACHE_DIR = "ExCache";

    public FileCache(Context ctx) {
        if (android.os.Environment.getExternalStorageState().equals(
                android.os.Environment.MEDIA_MOUNTED))
        {
            //if SDCARD is mounted (SDCARD is present on device and mounted)
            cacheDir = new File(
                    ctx.getExternalCacheDir(),CACHE_DIR);
        }
        else {
            // if checking on simulator the create cache dir in your application context
            cacheDir=ctx.getCacheDir();
        }

        if (!cacheDir.exists()) {
            if(!cacheDir.mkdirs()){
                Log.e(TAG, "Unable to create cache folders.");
            }
        }
    }

    public void saveFile() {

    }

    public void getFile() {

    }
}
