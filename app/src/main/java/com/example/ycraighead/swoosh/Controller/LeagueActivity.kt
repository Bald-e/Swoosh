package com.example.ycraighead.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.ycraighead.swoosh.Utils.EXTRA_LEAGUE
import com.example.ycraighead.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague =""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked (view: View){
        if (selectedLeague != ""){
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_LEAGUE, selectedLeague)

            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_LONG).show()
        }
    }

    fun onMensClicked (view: View){
        selectedLeague = "Mens"

        womensBtn.isChecked = false
        coedBtn.isChecked = false
    }
    fun onWomensClicked (view: View){
        selectedLeague = "Womens"

        mensBtn.isChecked = false
        coedBtn.isChecked = false
    }
    fun onCoedClicked (view: View){
        selectedLeague = "Coed"

        mensBtn.isChecked = false
        womensBtn.isChecked = false
    }
}
