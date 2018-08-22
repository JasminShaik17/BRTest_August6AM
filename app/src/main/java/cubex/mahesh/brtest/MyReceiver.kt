package cubex.mahesh.brtest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.TextView

class MyReceiver(var  textView: TextView) : BroadcastReceiver( )
{
    override fun onReceive(p0: Context?, p1: Intent?) {

        textView.text = p1!!.action

    }
}

// by using sendBroadcast( ) method, a broadcast event will be fired