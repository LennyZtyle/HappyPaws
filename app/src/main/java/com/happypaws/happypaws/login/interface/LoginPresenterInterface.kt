package com.happypaws.happypaws.login.`interface`

interface LoginPresenterInterface {
    fun handleLoginProcess(email : String, password : String)
    fun callModelToVerifyLogin(email : String, password : String)
}