package com.mesut.yemek

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.mesut.yemek.databinding.ActivityHomemadeRecipesBinding
import com.mesut.yemek.databinding.ActivityNextBinding

private lateinit var binding: ActivityHomemadeRecipesBinding

class HomemadeRecipes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomemadeRecipesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun seeKavurma(view : View) {
        val intent = Intent(this@HomemadeRecipes, Kavurma::class.java)
        startActivity(intent)
    }

    fun seeFasulye(view : View) {
        val intent = Intent(this@HomemadeRecipes, Fasulye::class.java)
        startActivity(intent)
    }


}