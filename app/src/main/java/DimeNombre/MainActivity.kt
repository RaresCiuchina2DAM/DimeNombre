package DimeNombre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.prueba1_dimenombre.R

class MainActivity : AppCompatActivity() {

    //Declaración de variables
    private lateinit var txtNombre : EditText
    private lateinit var btnAceptar : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Obtenemos una referencia a los controles de la interfaz
        txtNombre = findViewById(R.id.Texto)
        btnAceptar = findViewById(R.id.BotonAceptar)


        //Implementamos el evento click del botón
        btnAceptar.setOnClickListener(){
            if (validar()){
                val intent = Intent(this@MainActivity, SaludoActivity::class.java)
                intent.putExtra("nombre", txtNombre.text.toString())
                startActivity(intent)

            }
        }
    }
    //Validamos que el nombre no esté vacío
    fun validar (): Boolean {
        return if (txtNombre.text.toString().isEmpty()){
            txtNombre.error = "Debe ingresar un nombre"
            false
        }else true
    }


}




