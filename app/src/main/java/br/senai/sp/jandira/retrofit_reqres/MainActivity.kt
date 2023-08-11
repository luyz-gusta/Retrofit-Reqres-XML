package br.senai.sp.jandira.retrofit_reqres

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var apiService: ApiService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        apiService = RetrofitHelper.getInstance().create(ApiService::class.java)

        //Botãp de GET
        findViewById<Button>(R.id.btnGET).setOnClickListener{
            getUserByID()
        }

        //Botãp de POST
        findViewById<Button>(R.id.btnPOST).setOnClickListener{
            Log.e("BTN-POSTTING-DATA", "teste de botão")
        }

        //Botãp de PUT
        findViewById<Button>(R.id.btnPUT).setOnClickListener{
            Log.e("BTN-PUTTING-DATA", "teste de botão")
        }

        //Botãp de DELETE
        findViewById<Button>(R.id.btnDELETE).setOnClickListener{
            Log.e("BTN-DELETING-DATA", "teste de botão")
        }
    }

    private fun getUserByID() {
        lifecycleScope.launch {
            val result = apiService.getUserByID("2")

            if (result.isSuccessful){
                Log.e("RESULT", "${result.body()?.data}")
            }else
                Log.e("RESULT", "${result.message()}")

        }
    }
}