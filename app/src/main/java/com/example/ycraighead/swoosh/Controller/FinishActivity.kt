package com.example.ycraighead.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.ycraighead.swoosh.R
import com.example.ycraighead.swoosh.Utils.EXTRA_LEAGUE
import com.example.ycraighead.swoosh.Utils.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    var skill = ""
    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        skill = intent.getStringExtra(EXTRA_SKILL)
        league = intent.getStringExtra(EXTRA_LEAGUE)

        searchLeaguesText.text = "Looking for $league $skill league near you..."
    }
}
