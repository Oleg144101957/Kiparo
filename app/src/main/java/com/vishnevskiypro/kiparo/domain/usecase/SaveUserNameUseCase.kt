package com.vishnevskiypro.kiparo.domain.usecase

import com.vishnevskiypro.kiparo.domain.models.SaveUserNameParam

class SaveUserNameUseCase {
    fun execute(param: SaveUserNameParam): Boolean {
        if (param.name.isEmpty()){
            return false
        } else {
            return true
        }
    }
}