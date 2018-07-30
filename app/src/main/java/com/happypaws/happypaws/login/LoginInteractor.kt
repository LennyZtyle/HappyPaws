package com.happypaws.happypaws.login

import com.happypaws.happypaws.login.POJO.User
import com.happypaws.happypaws.login.`interface`.LoginInteractorInterface
import java.util.*

class LoginInteractor: LoginInteractorInterface {

    override fun getUserLogginIn(user : String): User? {
        val userName = user.split("---")[0]
        val password = user.split("---")[1]
        if(userName.equals("daniellaloca") && password.equals("1234")){
            val us = User("danel", "beltran", 22, "PASEADOR")
            return us
        }else return null
    }
}