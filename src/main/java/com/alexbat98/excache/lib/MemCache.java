package com.alexbat98.excache.lib;

import com.alexbat98.excache.lib.utils.ExFile;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Alexander on 27.04.2014.
 */
public class MemCache {
    private final String TAG = "ExCache_MemCache";

    private Map<String, ExFile> cache = Collections.synchronizedMap(new LinkedHashMap<String, ExFile>(10, 1.5f, true));

    //current allocated size
    private long size=0;

    // Max memory cache
    // We will use 25% of available heap
    private long limit = Runtime.getRuntime().maxMemory() / 4;

    public void getFile() {

    }

    public void saveFile() {

    }
}
