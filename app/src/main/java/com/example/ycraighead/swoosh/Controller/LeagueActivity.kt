package com.example.ycraighead.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.ycraighead.swoosh.Model.Player
import com.example.ycraighead.swoosh.R
import com.example.ycraighead.swoosh.Utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player( "", "")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked (view: View){
        if (player.league != ""){
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER, player)

            startActivity(skillIntent)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_LONG).show()
        }
    }

    fun onMensClicked (view: View){
        player.league = "Mens"

        womensBtn.isChecked = false
        coedBtn.isChecked = false
    }
    fun onWomensClicked (view: View){
        player.league = "Womens"

        mensBtn.isChecked = false
        coedBtn.isChecked = false
    }
    fun onCoedClicked (view: View){
        player.league = "Coed"

        mensBtn.isChecked = false
        womensBtn.isChecked = false
    }
}
