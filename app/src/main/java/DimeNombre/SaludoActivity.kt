package DimeNombre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.prueba1_dimenombre.R

class SaludoActivity : AppCompatActivity() {

    private lateinit var txtSaludo : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludo)

        //Obtenemos una referencia a los controles de la interfaz
        txtSaludo = findViewById(R.id.MostrarSaludo)

        //Recuperamos la información pasada en el intent
        val nombre = intent.getStringExtra("nombre")

        //Mostramos el saludo
        txtSaludo.text = "Hola $nombre"


    }
}