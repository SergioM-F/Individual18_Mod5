package cl.samf.individual18_mod5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.samf.individual18_mod5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}