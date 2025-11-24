package com.example.homework18_11_25

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityMailApp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setContentView(R.layout.activity_mail_app)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.mainMail)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val listMails = mutableListOf(
            MailModel("Dummy","Sample text","12:34 PM", R.drawable.thumb1),
            MailModel("Dummy","Sample text","12:34 PM", R.drawable.thumb5),
            MailModel("Dummy","Sample text","12:34 PM", R.drawable.thumb4),
            MailModel("Dummy","Sample text","12:34 PM", R.drawable.thumb3),
            MailModel("Dummy","Sample text","12:34 PM", R.drawable.thumb2),
            MailModel("Dummy","Sample text","12:34 PM", R.drawable.thumb1),
            MailModel("Dummy","Sample text","12:34 PM", R.drawable.thumb6),
            MailModel("Dummy","Sample text","12:34 PM", R.drawable.thumb5),
            MailModel("Dummy","Sample text","12:34 PM", R.drawable.thumb4),
            MailModel("Dummy","Sample text","12:34 PM", R.drawable.thumb3),
            MailModel("Dummy","Sample text","12:34 PM", R.drawable.thumb2),
            MailModel("Dummy","Sample text","12:34 PM", R.drawable.thumb1)
        )

        val adapter = MailAdapter(listMails)
        val listView = findViewById<ListView>(R.id.listViewMail)
        listView.adapter = adapter

        findViewById<TextView>(R.id.textView).text = "Touch a sender image to select that conversation."
    }
}