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
import androidx.appcompat.app.AlertDialog
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var teamAScore: TextView
    private lateinit var teamBScore:TextView
    private lateinit var enterTeamAScore: EditText
    private lateinit var enterTeamBScore: EditText
    private lateinit var addScoreButton: Button

    private var aScore= ""
    private var bScore= ""


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


            aScore= enterTeamAScore.text.toString()
            bScore= enterTeamBScore.text.toString()

            if(aScore.isNullOrEmpty()){
                Toast.makeText(this, "Enter a valid number", Toast.LENGTH_LONG).show()
            }

            else if(bScore.isNullOrEmpty()){
                Toast.makeText(this, "Enter a valid number", Toast.LENGTH_LONG).show()
            }
            else{

            teamAScore.text= "Team A: $aScore"
            teamBScore.text= "Team B: $bScore"

                var msg = if(aScore.toInt() > bScore.toInt()){
                    "Team A is the winner"
                }
                else{
                    "Team B is the winner"
                }


                var alertDialog = AlertDialog.Builder(this)
                alertDialog.setMessage(msg)
                    .setTitle("Who is the winner")
                    .setPositiveButton("Ok", null)
                    .show()
            }





        }




    }
}