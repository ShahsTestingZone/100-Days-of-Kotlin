package shahjalom1990.aboutme1.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import shahjalom1990.aboutme1.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("Shah Alom")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // You can't access the data variable in the XML directly. You need to access it through the binding object.
        binding.myName = myName

        binding.doneButton.setOnClickListener {
            addNickname()
        }
        binding.nicknameText.setOnClickListener {
            updateNickname()
        }
    }

    private fun addNickname() {

        binding.apply {
            //set the nickname text view by equating to the content of the editText
            //The nicknameText requires a String, and nicknameEdit.text is an Editable,so
            // When using data binding, it is necessary to explicitly convert the Editable to a String.
//            nicknameText.text = nicknameEdit.text.toString()
//            replace above with
            myName?.nickname = nicknameEdit.text.toString()
            // After the nickname is set, you want your code to refresh the UI with the new data.
            // To do this, you must invalidate all binding expressions so that they are recreated with the correct data.
            invalidateAll()
            //hide the nickname edit text view
            nicknameEdit.visibility = View.GONE
            //hide the done button
            doneButton.visibility = View.GONE
            // make the nickname text view visible - basically we are switching out the editView
            nicknameText.visibility = View.VISIBLE
            // Hide the keyboard.
        }
        val inputMethodManager =
            getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(binding.doneButton.windowToken, 0)

    }

    private fun updateNickname() {

        binding.apply {
            nicknameEdit.visibility = View.VISIBLE
            doneButton.visibility = View.VISIBLE
            nicknameText.visibility = View.GONE

            // Set the focus to the edit text.
            nicknameEdit.requestFocus()
        }

        // Show the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(binding.nicknameEdit, 0)

    }

}