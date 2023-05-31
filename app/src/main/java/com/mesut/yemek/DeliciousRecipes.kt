package com.mesut.yemek

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.mesut.yemek.databinding.ActivityDeliciousRecipesBinding
import com.mesut.yemek.databinding.ActivityNextBinding

private lateinit var binding: ActivityDeliciousRecipesBinding

class DeliciousRecipes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeliciousRecipesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun seePasta(view : View) {
        val intent = Intent(this@DeliciousRecipes, Makarna::class.java)
        startActivity(intent)
    }

    fun seeMenemen(view: View) {
        val intent = Intent(this@DeliciousRecipes, Menemen::class.java)
        startActivity(intent)}



}