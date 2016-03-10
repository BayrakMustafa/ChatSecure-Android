package info.guardianproject.otr;

import android.util.Log;

import info.guardianproject.otr.app.im.app.ImApp;
import info.guardianproject.util.Debug;
import info.guardianproject.util.LogCleaner;

public class OtrDebugLogger
{

    public static void log(String msg)
    {
        if (Debug.DEBUG_ENABLED && Log.isLoggable(ImApp.LOG_TAG, Log.DEBUG))
        {
            Log.d(ImApp.LOG_TAG, LogCleaner.clean(msg));
        }
    }

    public static void log(String msg, Exception e)
    {
        Log.e(ImApp.LOG_TAG, LogCleaner.clean(msg), e);
    }
}
