package cl.samf.individual18_mod5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.samf.individual18_mod5.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonGUARDAR.setOnClickListener {
            val texto = binding.textViewTexto.toString()
            val entero = binding.editTextNumEntero.toString().toInt()
            val decimal = binding.editTextNumberDecimal.toString().toDouble()
            val switch = binding.switchFragmen.isChecked
        }

    }
}