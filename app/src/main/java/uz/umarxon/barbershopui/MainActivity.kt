package uz.umarxon.barbershopui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun btnClick(view: android.view.View) {
        startActivity(Intent(this,MainActivity2::class.java))
    }
}