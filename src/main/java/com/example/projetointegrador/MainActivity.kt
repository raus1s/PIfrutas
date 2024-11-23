package com.example.projetointegrador

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projetointegrador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Configurar o View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Botão "Carrinho"
        binding.btn1.setOnClickListener {
            // Intenção para abrir CarrinhoActivity
            val intent = Intent(this, CarrinhoActivity::class.java)
            startActivity(intent)
        }

        // Botão "Login"
        binding.btn2.setOnClickListener {
            val i = Intent(this, LoginActivity::class.java)
            startActivity(i)
        }

        // Botões "Comprar" para os produtos
        binding.btnComprarPera.setOnClickListener {
            abrirSelecaoQuantidade("Pêra")
        }

        binding.btnComprarMaca.setOnClickListener {
            abrirSelecaoQuantidade("Maçã")
        }

        binding.btnComprarBanana.setOnClickListener {
            abrirSelecaoQuantidade("Banana")
        }

        binding.btnComprarUva.setOnClickListener {
            abrirSelecaoQuantidade("Uva")
        }

        binding.btnComprarLaranja.setOnClickListener {
            abrirSelecaoQuantidade("Laranja")
        }
    }

    // Função para abrir a tela de seleção de quantidade
    private fun abrirSelecaoQuantidade(produto: String) {
        val intent = Intent(this, SelecaoQuantidadeActivity::class.java).apply {
            putExtra("produto", produto) // Passa o nome do produto para a próxima activity
        }
        startActivity(intent)
    }
}