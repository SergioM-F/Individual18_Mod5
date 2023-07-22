package cl.samf.individual18_mod5

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import cl.samf.individual18_mod5.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mSharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mSharedPreferences = getSharedPreferences("valoresApp", Context.MODE_PRIVATE)

        binding.buttonGUARDAR.setOnClickListener {
            val texto = binding.editTextTexto.text.toString()
            val entero = binding.editTextNumEntero.text.toString().toInt()
            val decimal = binding.editTextNumberDecimal.text.toString().toFloat()
            val boleano = binding.switchFragmen.isChecked

            guardarDatos(texto,entero,decimal,boleano)
        }

        binding.buttonMostrar.setOnClickListener {
            mostrarDatos()
        }

        binding.buttonBorrar.setOnClickListener {
            borrarDatos()
        }

    }

    private fun guardarDatos(texto: String, entero: Int, decimal: Float, boleano: Boolean){
        mSharedPreferences.edit().putString("miTexto", texto).apply()
        mSharedPreferences.edit().putInt("miEntero", entero).apply()
        mSharedPreferences.edit().putFloat("miDecimal", decimal).apply()
        mSharedPreferences.edit().putBoolean("miBoleano", boleano).apply()
    }
    private fun mostrarDatos() {
        val texto = mSharedPreferences.getString("miTexto","")
        val entero = mSharedPreferences.getInt("miEntero",0)
        val decimal = mSharedPreferences.getFloat("miDecimal", 0.0f)
        val boleano = mSharedPreferences.getBoolean("miBoleano", false)

        binding.textViewTexto.text = texto
        binding.textViewrEntero.text = entero.toString()
        binding.textViewDecimal.text = decimal.toString()
        binding.textViewSwitch.text = boleano.toString()
        binding.switchFragmen.isChecked = boleano


    }
    private fun borrarDatos() {
        binding.textViewTexto.text = ""
        binding.textViewrEntero.text = ""
        binding.textViewDecimal.text = ""
        binding.textViewSwitch.text = ""

        binding.editTextTexto.text.clear()
        binding.editTextNumEntero.text
        binding.editTextNumberDecimal.text
        binding.switchFragmen.isChecked = false
        mSharedPreferences.edit().clear()

    }

}