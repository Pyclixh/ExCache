package com.alexbat98.excache.lib;

import android.content.Context;

import com.alexbat98.excache.lib.utils.ExFile;
import com.alexbat98.excache.lib.utils.ExImageFile;

import java.net.URL;

/**
 * Created by Alexander on 27.04.2014.
 */
public class ExCache {
    private MemCache memCache;
    private FileCache fileCache;

    public ExCache(Context ctx) {
        memCache = new MemCache();
        fileCache = new FileCache(ctx);
    }

    public void put(ExFile file) {

    }

    public ExFile get(URL url) {
        this.get(url.toString());
        return null;
    }

    public ExFile get(String url) {
        return null;
    }
}
