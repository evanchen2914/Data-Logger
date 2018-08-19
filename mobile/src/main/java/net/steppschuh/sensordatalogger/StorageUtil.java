package net.steppschuh.sensordatalogger;

import android.os.Environment;

import java.io.File;

public class StorageUtil {

    // Check whether the external storage is mounted or not.
    public static boolean isMounted() {

        String dirState = Environment.getExternalStorageState();
        if(Environment.MEDIA_MOUNTED.equals(dirState))
        {
            return true;
        }else
        {
            return false;
        }
    }

    // Get public external storage base directory.
    public static String getDirectory(String dirType)
    {
        String ret = "";
        if(isMounted()) {
            File file = Environment.getExternalStoragePublicDirectory(dirType);
            ret = file.getAbsolutePath();
        }
        return ret;
    }
}

