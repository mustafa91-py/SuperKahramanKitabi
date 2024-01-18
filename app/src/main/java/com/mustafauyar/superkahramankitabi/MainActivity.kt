package com.mustafauyar.superkahramankitabi
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import com.mustafauyar.superkahramankitabi.databinding.ActivityMainBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var superKahramanListesi = ArrayList<String>()
        superKahramanListesi.add("ironman")
        superKahramanListesi.add("batman")
        superKahramanListesi.add("joker")
        superKahramanListesi.add("samurai jack")
        superKahramanListesi.add("dört kol")
        val kahramanHashMap = HashMap<String,Int>()
        val ironman = R.drawable.ironman
        val batman = R.drawable.batman
        val joker = R.drawable.joker
        val samuraiJack = R.drawable.samurai_jack
        val fourArms = R.drawable.four_arm
        for (k in superKahramanListesi){
            Log.d("kahramanFor","bu kahraman k = $k")
        }
        kahramanHashMap["ironman"] = ironman
        kahramanHashMap["batman"] = batman
        kahramanHashMap["joker"] = joker
        kahramanHashMap["samurai jack"] = samuraiJack
        kahramanHashMap["dört kol"] = fourArms


        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager = layoutManager
        val adapter = RecyclerAdapter(kahramanHashMap)
        binding.recyclerView.adapter = adapter
    }
}