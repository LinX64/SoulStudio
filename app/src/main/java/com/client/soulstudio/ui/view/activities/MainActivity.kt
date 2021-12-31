package com.client.soulstudio.ui.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.client.soulstudio.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}