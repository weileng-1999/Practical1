package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage1: ImageView
    lateinit var diceImage2: ImageView
    lateinit var diceImage3: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage1 = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
        diceImage3 = findViewById(R.id.dice_image3)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countUp: Button = findViewById(R.id.countup_button)
        countUp.setOnClickListener { count_Up() }

        val reset: Button = findViewById(R.id.reset_button)
        reset.setOnClickListener { reset_Button() }
    }




    private fun rollDice() {
        diceImage1.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage2())
        diceImage3.setImageResource(getRandomDiceImage3())

    }

    private fun getRandomDiceImage2(): Int {
        val randomInt = Random().nextInt(6) + 1

        val resultText2: TextView = findViewById(R.id.result_text2)
        resultText2.text = randomInt.toString()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    private fun getRandomDiceImage3(): Int {
        val randomInt = Random().nextInt(6) + 1

        val resultText3: TextView = findViewById(R.id.result_text3)
        resultText3.text = randomInt.toString()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    private fun getRandomDiceImage(): Int {
        val randomInt = Random().nextInt(6) + 1

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }


    }

    private fun count_Up() {
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)

        if (resultText.text == "Hello World!"){
            resultText.text = "1"
           diceImage1.setImageResource(R.drawable.dice_1)
        } else{
            var resultInt = resultText.text.toString().toInt()

            if(resultInt < 6){
                resultInt++
                resultText.text = resultInt.toString()

                val countUpResult =  when (resultInt){

                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    else -> R.drawable.dice_6
                }

                diceImage1.setImageResource(countUpResult)

            }


        }

        if (resultText2.text == "Hello World!"){
            resultText2.text = "1"
            diceImage2.setImageResource(R.drawable.dice_1)
        } else{
            var resultInt2 = resultText2.text.toString().toInt()

            if(resultInt2 < 6){
                resultInt2++
                resultText2.text = resultInt2.toString()

                val countUpResult =  when (resultInt2){

                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    else -> R.drawable.dice_6
                }

                diceImage2.setImageResource(countUpResult)

            }


        }

        if (resultText3.text == "Hello World!"){
            resultText3.text = "1"
            diceImage3.setImageResource(R.drawable.dice_1)
        } else{
            var resultInt = resultText3.text.toString().toInt()

            if(resultInt < 6){
                resultInt++
                resultText3.text = resultInt.toString()

                val countUpResult =  when (resultInt){

                    1 -> R.drawable.dice_1
                    2 -> R.drawable.dice_2
                    3 -> R.drawable.dice_3
                    4 -> R.drawable.dice_4
                    5 -> R.drawable.dice_5
                    else -> R.drawable.dice_6
                }

                diceImage3.setImageResource(countUpResult)

            }


        }
    }

    private fun reset_Button() {
        diceImage1.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
        diceImage3.setImageResource(R.drawable.empty_dice)
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result_text2)
        val resultText3: TextView = findViewById(R.id.result_text3)
        resultText.text = "Hello World!"
        resultText2.text = "Hello World!"
        resultText3.text = "Hello World!"
    }
}




