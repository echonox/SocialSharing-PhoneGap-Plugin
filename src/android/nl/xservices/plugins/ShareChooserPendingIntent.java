package nl.xservices.plugins;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import java.util.Objects;

public class ShareChooserPendingIntent extends BroadcastReceiver {
    public static String chosenComponent = null;
    @TargetApi(Build.VERSION_CODES.LOLLIPOP_MR1)
    @Override
    public void onReceive(Context context, Intent intent) {
        ShareChooserPendingIntent.chosenComponent = Objects.requireNonNull(intent.getExtras()).get(Intent.EXTRA_CHOSEN_COMPONENT).toString();
    }
}
