package com.example.ycraighead.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.ycraighead.swoosh.Model.Player
import com.example.ycraighead.swoosh.R
import com.example.ycraighead.swoosh.Utils.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {


    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)

    }

    fun onFinishClick (view: View){
        if (player.skill != ""){
            val finishActivity = Intent (this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)

            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_LONG).show()
        }
    }

    fun onBallerClick (view: View){
        beginnerBtn.isChecked = false
        player.skill = "Baller"
    }

    fun onBeginnerClick (view: View){
        ballerBtn.isChecked = false

        player.skill = "Begginer"
    }
}
