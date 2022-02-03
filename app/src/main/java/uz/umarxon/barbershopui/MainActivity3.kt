package uz.umarxon.barbershopui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*
import uz.umarxon.barbershopui.adapter.RvAdapter2
import uz.umarxon.barbershopui.models.Barber

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val user = intent.getSerializableExtra("barber") as Barber

        img.setImageResource(user.image!!)

        val list = ArrayList<Barber>()

        for (i in 1..5){
            list.add(Barber("CLASSIC","",R.drawable.avatar1))
            list.add(Barber("SHINY","",R.drawable.avatar2))
            list.add(Barber("OLD WAY","",R.drawable.avatar3))
            list.add(Barber("FOCUSED","",R.drawable.avatar4))
        }

        rv2.adapter = RvAdapter2(list,object : RvAdapter2.Click{
            override fun click(barber: Barber) {
                Toast.makeText(this@MainActivity3, "Clicked", Toast.LENGTH_SHORT).show()
            }

        })

        back1.setOnClickListener {
            finish()
        }

        menu1.setOnClickListener {
            Toast.makeText(this, "Menu clicked", Toast.LENGTH_SHORT).show()
        }


    }
}