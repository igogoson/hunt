package com.github.midros.istheapp.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

/**
 * Created by luis rafael on 13/03/18
 */
class PhotoReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "New Photo Clicked " + intent.action, Toast.LENGTH_LONG).show();

    }
//    UML Diagrams
}