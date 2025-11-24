package com.example.homework18_11_25

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ActivityStudents : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val listStudents = mutableListOf(StudentModel("Nguyễn Văn A", "20210001"),
            StudentModel("Trần Thị B", "20210002"),
            StudentModel("Lê Văn C", "20210003"),
            StudentModel("Phạm Thị D", "20210004"),
            StudentModel("Hoàng Văn E", "20210005"),
            StudentModel("Vũ Thị F", "20210006"),
            StudentModel("Đặng Văn G", "20210007"),
            StudentModel("Bùi Thị H", "20210008"),
            StudentModel("Hồ Văn I", "20210009"),
            StudentModel("Hoàng Tố A", "20210010"))

        val adapter = StudentAdapter(listStudents)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = adapter

    }
}