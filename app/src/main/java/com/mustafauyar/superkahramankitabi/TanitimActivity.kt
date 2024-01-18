package com.mustafauyar.superkahramankitabi
import com.mustafauyar.superkahramankitabi.databinding.ActivityTanitimBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TanitimActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTanitimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)
        val binding = ActivityTanitimBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent = intent
        val secilenKahraman = intent.getStringExtra("kahraman")
        binding.textView.text = secilenKahraman.toString()

        val secilenKahramanGorsel = SingletonClass.superKahraman.image
        binding.imageView.setImageBitmap(secilenKahramanGorsel)
    }
}