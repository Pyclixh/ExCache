package com.alexbat98.excache.lib.utils;

import android.graphics.Bitmap;

/**
 * Created by Alexander Batashev on 27.04.2014.
 */
public class ExImageFile implements ExFile {

    @Override
    public int getType() {
        return 1;
    }

    @Override
    public void setData() {

    }

    @Override
    public Bitmap getData() {
        return null;
    }
}
