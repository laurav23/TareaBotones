package com.example.myapp


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.button.MaterialButtonToggleGroup

class ButtonActivity: AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        val outlineButton = findViewById<MaterialButton>(R.id.outlinedButton)
        val outlineButtonIcon = findViewById<MaterialButton>(R.id.outlinedButtonWithIcon)
        val textButton = findViewById<MaterialButton>(R.id.textButton)
        val text2Button = findViewById<MaterialButton>(R.id.text2Button)

        val toggleButton = findViewById<MaterialButtonToggleGroup>(R.id.toggleButton)

        outlineButton.setOnClickListener(this)
        outlineButtonIcon.setOnClickListener(this)
        textButton.setOnClickListener(this)
        text2Button.setOnClickListener(this)

        toggleButton.addOnButtonCheckedListener { group, checkedId, isChecked ->
            if (isChecked) {
                when (checkedId) {
                    R.id.button1 -> {
                        Toast.makeText(this, "boton1 click", Toast.LENGTH_SHORT).show()
                    }

                    R.id.button2 -> {
                        Toast.makeText(this, "boton3 click", Toast.LENGTH_SHORT).show()
                    }

                    R.id.button3 -> {
                        Toast.makeText(this, "boton3 click", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }

    override fun onClick(v: View?){
        when(v!!.id){
            R.id.outlinedButton->{
                Toast.makeText(this, "boton solo", Toast.LENGTH_SHORT).show()
            }
            R.id.outlinedButtonWithIcon->{
                Toast.makeText(this, "boton icono", Toast.LENGTH_SHORT).show()
            }
            R.id.textButton->{
                Toast.makeText(this, "boton texto", Toast.LENGTH_SHORT).show()
            }
            R.id.text2Button->{
                Toast.makeText(this, "boton texto", Toast.LENGTH_SHORT).show()
            }

        }



    }
}