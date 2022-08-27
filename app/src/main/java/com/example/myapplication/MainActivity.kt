package com.example.myapplication

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var teamAScore: TextView
    private lateinit var teamBScore:TextView
    private lateinit var enterTeamAScore: EditText
    private lateinit var enterTeamBScore: EditText
    private lateinit var addScoreButton: Button

    private var aScore= 0
    private var bScore= 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addScoreButton= findViewById(R.id.addScoreButton)
        enterTeamAScore= findViewById(R.id.enterTeamAScore)
        enterTeamBScore= findViewById(R.id.enterTeamBScore)
        teamAScore= findViewById(R.id.teamAScore)
        teamBScore= findViewById(R.id.teamBScore)

        //setting a listener to make the button clickable

        addScoreButton.setOnClickListener {
            Toast.makeText(this,  "Add Score Button was clicked", Toast.LENGTH_LONG).show()

            aScore= enterTeamAScore.text.toString().toInt()
            bScore= enterTeamBScore.text.toString().toInt()

            teamAScore.text= "Team A: $aScore"
            teamBScore.text= "Team B: $bScore"


        }




    }
}