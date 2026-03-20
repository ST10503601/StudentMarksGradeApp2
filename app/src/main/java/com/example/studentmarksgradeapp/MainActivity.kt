package com.example.studentmarksgradeapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.jar.Attributes

class MainActivity : AppCompatActivity() {
    lateinit var txtStudentNo : EditText
    lateinit var txtName : EditText
    lateinit var txtAge : EditText
    lateinit var txtSubject : EditText
    lateinit var txtMark : EditText
    lateinit var btnComputeGrade : Button
    lateinit var txtResults: TextView

    lateinit var btnClear: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnComputeGrade.setOnClickListener {
            val StudentNo = txtStudentNo.text.toString()
            val Name = txtName.text.toString()
            val Age = txtAge.text.toString()
            val Suject = txtSubject.text.toString()
            val Mark= txtMark.text.toString()
            val Results = txtResults.text.toString()

            btnClear.setOnClickListener{
                txtStudentNo.text.clear()
                txtName.text.clear()
                txtAge.text.clear()
                txtSubject.text.clear()
                txtMark.text.clear()
                txtResults.text=""
            }

         // Check all fields present
        if (StudentNo.isEmpty()|| Name.isEmpty()|| AgeText.isEmpty()||Subject.isEmpty||MarkText.isEmpty()) {
        }
            txtResults.text = "Please fill all fields"
        }else{
            // Validate Age
            val age = ageText.toIntOrNull()
        }   if(age==null||age<=0){
            txtResults.text="Enter a valid Age"
        }else{
        //Validate mark
        val mark =MarkText.toDoubleOrNull()
            if(mark==null||mark<0.0||mark>100.0){
                txtResults.text="Enter a valid mark between 0 and 100"
            }else{
                //Compute grade using if/else-if inline
                val grade: String
                if(mark>=90.0){
                    grade="A"
                }else if(mark>80.0){
                    grade="B"
                }else if (mark >=70){
                    grade="C"
                }else if (mark >=60.0){
                    grade="D"
                }else if (mark >=50.0){
                }
                }
            }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.txtStudentNo)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}