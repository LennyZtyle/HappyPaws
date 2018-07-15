package com.happypaws.happypaws

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.happypaws.login.LoginController
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var obj = LoginController()

        button.setOnClickListener{
            //textView.toString()
            val textfield: EditText = findViewById(R.id.editText) as EditText
            var tempText : String = textfield.text.toString()
            textView.setText(obj.test(textfield.text.toString()))

        }
    }
}
