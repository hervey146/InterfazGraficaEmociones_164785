package mx.edu.potros.practica5_164785

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnRegistroEmociones: Button = findViewById(R.id.button_registroemociones) as Button

        btnRegistroEmociones.setOnClickListener {
            var intent: Intent = Intent(this, ProductosActivity::class.java)
            intent.putExtra("menuType", "Registro Emociones")
            startActivity(intent)
        }
        }
    }