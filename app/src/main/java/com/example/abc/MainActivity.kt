package com.example.abc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

// : = extends
class MainActivity : AppCompatActivity() {

    //onCreate = main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Create the UI
        //R = resources
        setContentView(R.layout.activity_main)
        //TODO : Continue here
        //Java int x; //Kotlin var x : Int
        //val = value and var = variable
        //findViewById = link UI to code
        val buttonDontClickMe : Button = findViewById(R.id.buttonDontClickMe)
        buttonDontClickMe.setOnClickListener { showMessage() }
        val buttonReset : Button = findViewById(R.id.buttonReset)
        buttonReset.setOnClickListener { resetMessage() }
    }

    private fun resetMessage() {
        testViewMessage.setText(getString(R.string.))
    }

    private fun showMessage() {
        textViewMessage.setText(getString(R.string.warning_message))
    }
}
