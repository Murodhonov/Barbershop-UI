package uz.umarxon.barbershopui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
import uz.umarxon.barbershopui.adapter.RvAdapter
import uz.umarxon.barbershopui.models.Barber

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val list = ArrayList<Barber>()

        for(i in 1..5){
            list.add(Barber("HAIRCUT","Lorem ipsum dolor sit amet,\nconsectetuer adipiscing elit,\nsed diam",R.drawable.scisor_image))
            list.add(Barber("SHAVING","Lorem ipsum dolor sit amet,\nconsectetuer adipiscing elit,\nsed diam",R.drawable.shaving_image))
            list.add(Barber("BREAD CARE","Lorem ipsum dolor sit amet,\nconsectetuer adipiscing elit,\nsed diam",R.drawable.bread_image))
        }

        rv.adapter = RvAdapter(list,object : RvAdapter.Click{
            override fun click(barber: Barber) {
                startActivity(Intent(this@MainActivity2,MainActivity3::class.java).putExtra("barber",barber))
            }
        })

        back.setOnClickListener {
            finish()
        }

        menu.setOnClickListener {
            Toast.makeText(this, "Menu clicked", Toast.LENGTH_SHORT).show()
        }

    }
}