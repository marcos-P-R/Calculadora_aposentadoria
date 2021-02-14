package com.example.calculoaposentadoria

import android.app.Activity
import android.os.Bundle
import android.widget.*
import com.google.android.material.textfield.TextInputLayout

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // definindo o arquivo de layout
        setContentView(R.layout.activity_main)
        val spnSexo = findViewById<Spinner>(R.id.spn_sexo)
        val txtIdade = findViewById<EditText>(R.id.txt_msg)
        val btnCalcular = findViewById<Button>(R.id.btn_calcular)
        val txtResultado = findViewById<TextView>(R.id.txt_result)

        spnSexo.adapter = ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, listOf("Masculino", "Feminino"))
        btnCalcular.setOnClickListener {
            val sexo = spnSexo.selectedItem as String
            val idade = txtIdade.text.toString().toInt()
            var resultado = 0
            resultado = if (sexo == "Masculino") {
                65 - idade
            } else {
                60 - idade
            }
            val txtmostrar = "Falta $resultado anos para se aposentar"
            txtResultado.text = txtmostrar
        }
    }
}