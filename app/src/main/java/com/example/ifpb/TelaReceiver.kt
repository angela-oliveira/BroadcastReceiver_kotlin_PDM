package com.example.ifpb

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class TelaReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "tela foi desbloqueada", Toast.LENGTH_SHORT).show()

        val intent = Intent(context, MainActivity::class.java)
        context.startActivity(intent)
    }
}