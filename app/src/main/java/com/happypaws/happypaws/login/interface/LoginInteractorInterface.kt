package com.happypaws.happypaws.login.`interface`

import com.happypaws.happypaws.login.POJO.User

interface LoginInteractorInterface {
    fun getUserLogginIn(fullUser : String) : User?
}