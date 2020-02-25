package com.example.testapp1

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        var diceCounter=0
        var currentDie=0
        var timeStart=System.currentTimeMillis()


        d4Button.setOnClickListener {

            //check to see current die
            if(currentDie!=4){
                diceCounter=0
                currentDie=4
                text1.text=""
                text2.text=""
                timeStart=System.currentTimeMillis()
            }


            //procedure for current die roll
            if(diceCounter==0){
                text1.text = "You rolled a d4 with a result of..."
                text2.text=((1..4).random().toString())
                diceCounter++
                timeStart=System.currentTimeMillis()
            }

            else if(diceCounter<6){
                if(System.currentTimeMillis()-timeStart<1000){
                    var nextDie=(1..4).random().toString()
                    text2.append(", $nextDie")
                    diceCounter++
                    timeStart=System.currentTimeMillis()
                }
                else{
                    text1.text = "You rolled a d4 with a result of..."
                    text2.text=((1..4).random().toString())
                    diceCounter=1
                    timeStart=System.currentTimeMillis()
                }



            }

            else{
                text1.text = "You rolled a d4 with a result of..."
                text2.text=((1..4).random().toString())
                diceCounter=1
                timeStart=System.currentTimeMillis()
            }

            /* val simpleDateFormat = SimpleDateFormat("hh:mm:ss:s")
            val format: String = simpleDateFormat.format(Date())
            Log.d("MainActivity", "Current Timestamp: $format")
            */


            //var timeStamp=System.currentTimeMillis()
            //Log.d("MainActivity","Current Milliseconds: $timeStamp")




        }


        d6button.setOnClickListener {

            //check to see current die
            if(currentDie!=6){
                diceCounter=0
                currentDie=6
                text1.text=""
                text2.text=""
                timeStart=System.currentTimeMillis()
            }

            //procedure for current die roll
            if(diceCounter==0){
                text1.text = "You rolled a d6 with a result of..."
                text2.text=((1..6).random().toString())
                diceCounter++
                timeStart=System.currentTimeMillis()
            }

            else if(diceCounter<6){
                if(System.currentTimeMillis()-timeStart<1000){
                    var nextDie=(1..6).random().toString()
                    text2.append(", $nextDie")
                    diceCounter++
                    timeStart=System.currentTimeMillis()
                }
                else{
                    text1.text = "You rolled a d6 with a result of..."
                    text2.text=((1..6).random().toString())
                    diceCounter=1
                    timeStart=System.currentTimeMillis()
                }
            }

            else{
                text1.text = "You rolled a d6 with a result of..."
                text2.text=((1..6).random().toString())
                diceCounter=1
                timeStart=System.currentTimeMillis()
            }

        }


        d8Button.setOnClickListener {
            //check to see current die
            if(currentDie!=8){
                diceCounter=0
                currentDie=8
                text1.text=""
                text2.text=""
                timeStart=System.currentTimeMillis()
            }

            //procedure for current die roll
            if(diceCounter==0){
                text1.text = "You rolled a d8 with a result of..."
                text2.text=((1..8).random().toString())
                diceCounter++
                timeStart=System.currentTimeMillis()
            }

            else if(diceCounter<6){
                if(System.currentTimeMillis()-timeStart<1000){
                    var nextDie=(1..8).random().toString()
                    text2.append(", $nextDie")
                    diceCounter++
                    timeStart=System.currentTimeMillis()
                }
                else{
                    text1.text = "You rolled a d8 with a result of..."
                    text2.text=((1..8).random().toString())
                    diceCounter=1
                    timeStart=System.currentTimeMillis()
                }
            }

            else{
                text1.text = "You rolled a d8 with a result of..."
                text2.text=((1..8).random().toString())
                diceCounter=1
                timeStart=System.currentTimeMillis()
            }
        }


        d10Button.setOnClickListener {
            //check to see current die
            if(currentDie!=10){
                diceCounter=0
                currentDie=10
                text1.text=""
                text2.text=""
                timeStart=System.currentTimeMillis()
            }

            //procedure for current die roll
            if(diceCounter==0){
                text1.text = "You rolled a d10 with a result of..."
                text2.text=((1..10).random().toString())
                diceCounter++
                timeStart=System.currentTimeMillis()
            }

            else if(diceCounter<6){
                if(System.currentTimeMillis()-timeStart<1000){
                    var nextDie=(1..10).random().toString()
                    text2.append(", $nextDie")
                    diceCounter++
                    timeStart=System.currentTimeMillis()
                }
                else{
                    text1.text = "You rolled a d10 with a result of..."
                    text2.text=((1..10).random().toString())
                    diceCounter=1
                    timeStart=System.currentTimeMillis()
                }
            }

            else{
                text1.text = "You rolled a d10 with a result of..."
                text2.text=((1..10).random().toString())
                diceCounter=1
                timeStart=System.currentTimeMillis()
            }

        }


        dPercentButton.setOnClickListener {
            //check to see current die
            if(currentDie!=100){
                diceCounter=0
                currentDie=100
                text1.text=""
                text2.text=""
                timeStart=System.currentTimeMillis()
            }

            //procedure for current die roll
            if(diceCounter==0){
                text1.text = "You rolled a d% with a result of..."
                text2.text=((1..100).random().toString())
                diceCounter++
                timeStart=System.currentTimeMillis()
            }

            else if(diceCounter<6){
                if(System.currentTimeMillis()-timeStart<1000){
                    var nextDie=(1..100).random().toString()
                    text2.append(", $nextDie")
                    diceCounter++
                    timeStart=System.currentTimeMillis()
                }
                else{
                    text1.text = "You rolled a d% with a result of..."
                    text2.text=((1..100).random().toString())
                    diceCounter=1
                    timeStart=System.currentTimeMillis()
                }
            }

            else{
                text1.text = "You rolled a d% with a result of..."
                text2.text=((1..100).random().toString())
                diceCounter=1
                timeStart=System.currentTimeMillis()
            }

        }


        d12Button.setOnClickListener {
            //check to see current die
            if(currentDie!=12){
                diceCounter=0
                currentDie=12
                text1.text=""
                text2.text=""
                timeStart=System.currentTimeMillis()
            }

            //procedure for current die roll
            if(diceCounter==0){
                text1.text = "You rolled a d12 with a result of..."
                text2.text=((1..12).random().toString())
                diceCounter++
                timeStart=System.currentTimeMillis()
            }

            else if(diceCounter<6){
                if(System.currentTimeMillis()-timeStart<1000){
                    var nextDie=(1..12).random().toString()
                    text2.append(", $nextDie")
                    diceCounter++
                    timeStart=System.currentTimeMillis()
                }
                else{
                    text1.text = "You rolled a d12 with a result of..."
                    text2.text=((1..12).random().toString())
                    diceCounter=1
                    timeStart=System.currentTimeMillis()
                }
            }

            else{
                text1.text = "You rolled a d12 with a result of..."
                text2.text=((1..12).random().toString())
                diceCounter=1
                timeStart=System.currentTimeMillis()
            }

        }


        d20Button.setOnClickListener {
            //check to see current die
            if(currentDie!=20){
                diceCounter=0
                currentDie=20
                text1.text=""
                text2.text=""
                timeStart=System.currentTimeMillis()
            }

            //procedure for current die roll
            if(diceCounter==0){
                text1.text = "You rolled a d20 with a result of..."
                text2.text=((1..20).random().toString())
                diceCounter++
                timeStart=System.currentTimeMillis()
            }

            else if(diceCounter<6){
                if(System.currentTimeMillis()-timeStart<1000){
                    var nextDie=(1..20).random().toString()
                    text2.append(", $nextDie")
                    diceCounter++
                    timeStart=System.currentTimeMillis()
                }
                else{
                    text1.text = "You rolled a d20 with a result of..."
                    text2.text=((1..20).random().toString())
                    diceCounter=1
                    timeStart=System.currentTimeMillis()
                }
            }

            else{
                text1.text = "You rolled a d20 with a result of..."
                text2.text=((1..20).random().toString())
                diceCounter=1
                timeStart=System.currentTimeMillis()
            }

        }

    }


}
