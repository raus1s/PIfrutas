package com.example.projetointegrador

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class SelecaoQuantidadeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selecao_quantidade)

        val tvProdutoSelecionado = findViewById<TextView>(R.id.tvProdutoSelecionado)
        val rgQuantidade = findViewById<RadioGroup>(R.id.rgQuantidade)
        val btnAdicionarCarrinho = findViewById<Button>(R.id.btnAdicionarCarrinho)
        val btnCancelar = findViewById<Button>(R.id.btnCancelar)

        // Recuperar o nome do produto passado pela Intent
        val produtoSelecionado = intent.getStringExtra("produto")
        tvProdutoSelecionado.text = produtoSelecionado

        btnAdicionarCarrinho.setOnClickListener { v: View? ->
            val selectedId = rgQuantidade.checkedRadioButtonId
            // Verificar a opção selecionada
            val quantidade: String = if (selectedId == R.id.rb500g) {
                "500g"
            } else if (selectedId == R.id.rb1kg) {
                "1kg"
            } else if (selectedId == R.id.rb15kg) {
                "1,5kg"
            } else {
                Toast.makeText(this, "Selecione uma quantidade", Toast.LENGTH_SHORT)
                    .show()
                return@setOnClickListener
            }

            // Adicionar ao carrinho (simulação)
            Toast.makeText(
                this,
                "$produtoSelecionado ($quantidade) adicionado ao carrinho!", Toast.LENGTH_SHORT
            ).show()

            // Finalizar a Activity e retornar ao menu principal
            finish()
        }

        btnCancelar.setOnClickListener { v: View? ->
            // Apenas fecha a tela
            finish()
        }
    }
}