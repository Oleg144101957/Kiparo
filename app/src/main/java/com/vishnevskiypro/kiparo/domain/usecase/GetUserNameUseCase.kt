package com.vishnevskiypro.kiparo.domain.usecase

import com.vishnevskiypro.kiparo.domain.models.UserName

class GetUserNameUseCase {
    fun execute(): UserName {
        return UserName(firstName = "Kiparo", "Hello")
    }
}