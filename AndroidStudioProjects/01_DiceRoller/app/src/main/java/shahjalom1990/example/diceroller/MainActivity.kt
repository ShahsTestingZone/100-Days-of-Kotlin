package shahjalom1990.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

//        val countButton: Button = findViewById(R.id.countup_button)
//        countButton.setOnClickListener { countUp() }

    }

    /**
     * Click listener for the Roll button.
     */
    private fun rollDice() {

        val drawableResource = when ((1..6).random()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)

    }


    /**
     * Click listener for the countUp button.
     */
//    private fun countUp() {
//        val resultText: TextView = findViewById(R.id.result_text)
//
//        // If text is the default "Hello World!" set that text to 1.
//        if (resultText.text == "Hello World!") {
//            resultText.text = "1"
//        } else {
//            // Otherwise, increment the number up to 6.
//            // The text value in resultText.text is an instance of the CharSequence class;
//            // it needs to be converted to a String object before it can be converted to an int.
//            var resultInt = resultText.text.toString().toInt()
//
//            if (resultInt < 6) {
//                resultInt++
//                resultText.text = resultInt.toString()
//            }
//        }
//    }
}

// Redundant code
//private fun rollDice() {
////        Toast.makeText(this, "button clicked",
////            Toast.LENGTH_SHORT).show()
//    val resultText: TextView = findViewById(R.id.result_text)
//    resultText.text = "Dice Rolled!"
//
//    object : CountDownTimer(2000, 1000) {
//        override fun onTick(millisUntilFinished: Long) {
//            // millisUntilFinished    The amount of time until finished.
//            // mTextField.setText("seconds remaining: " + millisUntilFinished / 1000)
//        }
//
//        override fun onFinish() {
//            // When timer is finished
//            // Execute your code here
//            val randomInt = (1..6).random()
//            resultText.text = randomInt.toString()
//        }
//
//    }.start()
//}