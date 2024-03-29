package com.example.kalcu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() , View.OnClickListener {
    lateinit var btnAdd: Button
    lateinit var btnsub: Button
    lateinit var btnmultiply:Button
    lateinit var btndivide:Button
    lateinit var etA: EditText
    lateinit var etB: EditText
    lateinit var resultTV: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnAdd = findViewById(R.id.btn_add)
        btnsub = findViewById(R.id.btn_sub)
        btnmultiply = findViewById(R.id.btn_multiply)
        btndivide = findViewById(R.id.btn_divide)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTV = findViewById(R.id.result_tv)

        btnAdd.setOnClickListener(this)
        btnsub.setOnClickListener(this)
        btnmultiply.setOnClickListener(this)
        btndivide.setOnClickListener(this)



    }

    override fun onClick(v: View?) {
        var a = etA.text.toString().toDouble()
        var b = etB.text.toString().toDouble()
        var result = 0.0
        when(v?.id) {
            R.id.btn_add ->{
                result = a+b
            }
            R.id.btn_sub ->{
                result = a-b
            }
            R.id.btn_multiply ->{
                result = a*b
            }
            R.id.btn_divide ->{
                result = a/b
            }
        }
        resultTV.text = "Result is $result"
    }
}