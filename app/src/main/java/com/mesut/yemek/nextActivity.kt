package com.mesut.yemek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.mesut.yemek.databinding.ActivityMainBinding
import com.mesut.yemek.databinding.ActivityNextBinding

private lateinit var binding: ActivityNextBinding
class nextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun seeDelicious(view : View) {
        val intent = Intent(this@nextActivity, DeliciousRecipes::class.java)
        startActivity(intent)
    }

    fun seeHomemade(view : View) {
        val intent = Intent(this@nextActivity, HomemadeRecipes::class.java)
        startActivity(intent)
    }

    fun seeFastandFurious(view : View) {
        val intent = Intent(this@nextActivity, FastandFuriousRecipes::class.java)
        startActivity(intent)
    }



}

