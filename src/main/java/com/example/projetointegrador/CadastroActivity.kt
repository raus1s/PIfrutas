package com.example.projetointegrador

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projetointegrador.databinding.ActivityCadastroBinding

class CadastroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCadastroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textLogin.setOnClickListener{
            finish()
        }
    }
}