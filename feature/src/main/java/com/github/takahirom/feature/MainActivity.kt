package com.github.takahirom.feature

import android.os.Bundle
import android.text.TextUtils.replace
import androidx.appcompat.app.AppCompatActivity
import com.github.takahirom.dagger.hilt.multimodule.sample.feature.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        getSupportFragmentManager().beginTransaction()
            .replace(R.id.fragment_container_view, WillErrorFragment()).commit();


    }
}