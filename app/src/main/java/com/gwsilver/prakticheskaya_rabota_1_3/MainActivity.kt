package com.gwsilver.prakticheskaya_rabota_1_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val Empty_List = mutableListOf<Int>()   // Пустая коллекция

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i in 1..10)                    // Этот цикл наполняет пустую коллекцию числами от 1 до 10
            Empty_List.add(i)
        My_Fun_VT()                         // Вызов функции
    }
    fun My_Fun_VT() {                       // Функция для вывода содержимого коллекции на экран
        var MyViwe = findViewById<TextView>(R.id.View_Text)

        MyViwe.text = Empty_List.toString() // Вывод на Экран
    }
}