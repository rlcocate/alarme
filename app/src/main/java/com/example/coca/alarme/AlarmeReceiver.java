package com.example.coca.alarme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by logonrm on 12/06/2017.
 */

public class AlarmeReceiver extends BroadcastReceiver {

    private MediaPlayer mp = null;

    public AlarmeReceiver(){

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        mp = MediaPlayer.create(context, R.raw.desliga_o_computador_agora);
        mp.start();
        Toast.makeText(context, "Alarme ...", Toast.LENGTH_LONG).show();
    }

}
