package com.nominalista.expenses.settings.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.nominalista.expenses.R
import com.nominalista.expenses.common.presentation.BaseActivity

class SettingsActivity: BaseActivity() {

    companion object {
        fun start(context: Context) {
            val intent = Intent(context, SettingsActivity::class.java)
            context.startActivity(intent)
        }
    }

    override var animationKind = ANIMATION_SLIDE_FROM_RIGHT

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        setSupportActionBar(findViewById(R.id.toolbar))
    }
}