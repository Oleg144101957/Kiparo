package com.vishnevskiypro.kiparo.presantation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.vishnevskiypro.kiparo.R
import com.vishnevskiypro.kiparo.domain.models.SaveUserNameParam
import com.vishnevskiypro.kiparo.domain.models.UserName
import com.vishnevskiypro.kiparo.domain.usecase.GetUserNameUseCase
import com.vishnevskiypro.kiparo.domain.usecase.SaveUserNameUseCase

class MainActivity : AppCompatActivity() {

    private val getUserNameUseCase = GetUserNameUseCase()
    private val saveUserNameUseCase = SaveUserNameUseCase()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataTextView = findViewById<TextView>(R.id.dataTextView)
        val sendButton = findViewById<Button>(R.id.recieveButton)
        val dataEditText = findViewById<EditText>(R.id.dataEditText)
        val receiveButton = findViewById<Button>(R.id.sendButton)

        sendButton.setOnClickListener {
            //Save Data
            val text = dataEditText.text.toString()
            val params = SaveUserNameParam(name = text)
            val result: Boolean = saveUserNameUseCase.execute(param = params)
            dataTextView.text = "Save result = $result"
        }
        receiveButton.setOnClickListener {
            //Get Data
            val userName: UserName = getUserNameUseCase.execute()
            dataTextView.text = "${userName.firstName} ${userName.lastName}"
        }





    }
}