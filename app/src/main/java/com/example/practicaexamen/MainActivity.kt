package com.example.practicaexamen

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.practicaexamen.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @SuppressLint("DefaultLocale", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var cambio = 0.0

        binding.buttonDolares.setOnClickListener {
            val monto = binding.editTextMonto.text.toString().toDouble()
            cambio = monto * 6.97
            binding.textView4.text = "El cambio de monedas de ${monto} Bs. a Dolares es:" + String.format("%.3f", cambio)
        }

        binding.buttonEuros.setOnClickListener {
            val monto = binding.editTextMonto.text.toString().toDouble()
            cambio = monto * 7.32
            binding.textView4.text = "El cambio de monedas de ${monto} Bs. a Euros es:" + String.format("%.3f", cambio)
        }

        binding.buttonSoles.setOnClickListener {
            val monto = binding.editTextMonto.text.toString().toDouble()
            cambio = monto * 2.26
            binding.textView4.text = "El cambio de monedas de ${monto} Bs. a Soles es:" + String.format("%.3f", cambio)
        }

    }
}