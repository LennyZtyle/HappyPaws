package com.happypaws.happypaws.login

import com.happypaws.happypaws.login.POJO.User
import com.happypaws.happypaws.login.`interface`.LoginPresenterInterface
import com.happypaws.happypaws.login.`interface`.LoginViewInterface

class LoginPresenter (var loginView : LoginViewInterface): LoginPresenterInterface {

    val interactor = LoginInteractor()
    init {
    }

    override fun handleLoginProcess(email : String, password : String){
        if(!email.isNullOrBlank() && !password.isNullOrBlank()){
            callModelToVerifyLogin(email, password)
        }else{
            loginView.showErrorMessageWithBadOrNoData()
        }

    }

    override fun callModelToVerifyLogin(email : String, password : String){
        val fullUser = email+"---"+password
        val myConsulterUser = interactor.getUserLogginIn(fullUser)
        if(myConsulterUser!=null){
            if(myConsulterUser.profile=="PASEADOR") {
                loginView.userIsLogged(myConsulterUser.profile)
            }else{
                loginView.userIsLogged("no PROFILE")
            }
        } else {
            loginView.showErrorMessageWithBadOrNoData()
        }

    }



}