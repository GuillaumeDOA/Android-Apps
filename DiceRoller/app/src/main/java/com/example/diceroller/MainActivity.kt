package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage=findViewById(R.id.dice_image)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
/*        val countButton: Button = findViewById(R.id.countup_button)
        countButton.setOnClickListener { oneUp() }*/
        val resetButton: Button= findViewById(R.id.reset_button)
        resetButton.setOnClickListener{reset()}
    }
    private fun rollDice(){
        val randomget = Random().nextInt(6)
        val drawableImage = when (randomget) {
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        diceImage.setImageResource(drawableImage)
    }
    /*private fun oneUp(){
        val diceImage: ImageView = findViewById(R.id.dice_image)
         if (resultText.text == "Hello World!") {
           resultText.text = "1"
        } else {
            var resultInt = resultText.text.toString().toInt()
            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }*/
    private fun reset(){
        diceImage.setImageResource(R.drawable.empty_dice)
    }
}
