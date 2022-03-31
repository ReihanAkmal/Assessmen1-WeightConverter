package org.d3if4111.weightconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import org.d3if4111.weightconverter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            button.setOnClickListener{
                weightConverter()
            }
        }
    }

    private fun weightConverter() {
        val weight_killogram = binding.killogramInp.text.toString()
        if (TextUtils.isEmpty(weight_killogram)) {
            Toast.makeText(this, R.string.weight_killogram_invalid, Toast.LENGTH_LONG).show()
            return
        }

        val weight_lbs = weight_killogram.toFloat() * 2.20462
        binding.killogramTextView.text = "%.2f".format(weight_lbs)
    }
}
