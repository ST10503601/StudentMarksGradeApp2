package com.example.pizzaapp

import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var rbSmall: RadioButton
    lateinit var rbMedium: RadioButton
    lateinit var rbLarge: RadioButton
    lateinit var rbThin: RadioButton
    lateinit var rbRegular: RadioButton
    lateinit var rbThick: RadioButton
    lateinit var cbPepperoni: RadioButton
    lateinit var cbMushroom: RadioButton
    lateinit var cbCheese: RadioButton
    lateinit var cbOlives: RadioButton
    lateinit var btnClear: Button
    lateinit var btnPrice: Button
    lateinit var txtResults: TextView

    override fun onCreate(savedInstanceState: Bundle?
    ) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        rbSmall = findViewById(R.id.rbSmall)
        rbMedium = findViewById(R.id.rbMedium)
        rbLarge = findViewById(R.id.rbLarge)

        rbThin = findViewById(R.id.rbThin)
        rbRegular = findViewById(R.id.rbRegular)
        rbThick = findViewById(R.id.rbThick)

        cbPepperoni = findViewById(R.id.cbPepperoni)
        cbMushroom = findViewById(R.id.cbMushroom)
        cbCheese = findViewById(R.id.cbCheese)
        cbOlives = findViewById(R.id.cbOlives)
        btnClear = findViewById(R.id.btnClear)
        btnPrice = findViewById(R.id.btnPrice)
        txtResults = findViewById(R.id.txtResults)

        //Pices
        val priceSmall = 55.00
        val priceMedium = 70.50
        val priceLarge = 150.00

        val baseThin = 0.00
        val baseRegular = 3.00
        val baseThick = 20.00

        val toppingPrice = 7.25

        //Default selections
        rbMedium.isChecked = true
        rbRegular.isChecked = true

    //

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}