package com.happypaws.happypaws.login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.happypaws.happypaws.R
import com.happypaws.happypaws.login.`interface`.LoginViewInterface
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), LoginViewInterface {
    private val presenter = LoginPresenter(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        button.setOnClickListener {
            val email = editText.text.toString()
            val password = editText2.text.toString()
            presenter.handleLoginProcess(email, password)
        }
    }

    override fun showErrorMessageWithBadOrNoData(){
        Toast.makeText(this,"Datos Incotrectos",Toast.LENGTH_LONG).show()
    }

    override fun userIsLogged(profile : String){
        Toast.makeText(this,"User Logged in!! with profile--> "+profile,Toast.LENGTH_LONG).show()
    }

}
