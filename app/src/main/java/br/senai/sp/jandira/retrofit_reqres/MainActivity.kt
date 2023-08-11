package br.senai.sp.jandira.retrofit_reqres

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Botãp de GET
        findViewById<Button>(R.id.btnGET).setOnClickListener{
            Log.e("BTN-GETTING-DATA", "teste de botão")
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
}