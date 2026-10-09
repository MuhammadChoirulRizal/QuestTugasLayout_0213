package com.example.questtugaslayout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.Modifier

import com.example.questtugaslayout.ui.theme.QuestTugasLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuestTugasLayoutTheme() {
                ActivitasPertama(modifier = Modifier)
            }
        }
    }
}