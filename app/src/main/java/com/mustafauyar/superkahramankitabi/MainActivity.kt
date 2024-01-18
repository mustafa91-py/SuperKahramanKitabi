package com.mustafauyar.superkahramankitabi
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import com.mustafauyar.superkahramankitabi.databinding.ActivityMainBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

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
        val ironmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.ironman)
        val batmanBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.batman)
        val jokerBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.joker)
        val samuraiJackBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.samurai_jack)
        val fourArmBitmap = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.four_arm)
        val superKahramanBitmaps = ArrayList<Bitmap>()
        superKahramanBitmaps.add(ironmanBitmap)
        superKahramanBitmaps.add(batmanBitmap)
        superKahramanBitmaps.add(jokerBitmap)
        superKahramanBitmaps.add(samuraiJackBitmap)
        superKahramanBitmaps.add(fourArmBitmap)
        val adapter = RecyclerAdapter(superKahramanListesi,superKahramanBitmaps)
    }
}