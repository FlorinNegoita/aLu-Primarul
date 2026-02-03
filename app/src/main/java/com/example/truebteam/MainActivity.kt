package com.example.turecalendar

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.turecalendar.ui.CalendarScreen
import com.example.turecalendar.ui.TureCalendarTheme
import kotlin.system.exitProcess


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TureCalendarTheme {
                CalendarScreen()
            }
        }
    }

        override fun onStop() {
            super.onStop()
            finishAffinity() // închide complet aplicația
            exitProcess(0)
        }

}
