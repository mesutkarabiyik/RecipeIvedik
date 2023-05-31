package com.mesut.yemek

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.mesut.yemek.databinding.ActivityFastandFuriousRecipesBinding
import com.mesut.yemek.databinding.ActivityNextBinding

private lateinit var binding: ActivityFastandFuriousRecipesBinding

class FastandFuriousRecipes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFastandFuriousRecipesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun seePizza(view : View) {
        val intent = Intent(this@FastandFuriousRecipes, Pizza::class.java)
        startActivity(intent)
    }

    fun seeBurger(view : View) {
        val intent = Intent(this@FastandFuriousRecipes, Burger::class.java)
        startActivity(intent)
    }



}