package com.example.netclan

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class RefineActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_refine)



        val btnBack: ImageButton = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            finish() // Close the current activity
        }

        val dropdownMenu: Spinner = findViewById(R.id.dropdownMenu)
        ArrayAdapter.createFromResource(
            this,
            R.array.availability_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            dropdownMenu.adapter = adapter
        }
        val progressBar: SeekBar = findViewById(R.id.progressBar)
        val submitButton: Button = findViewById(R.id.submitButton)

        progressBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                Toast.makeText(applicationContext, "Progress: $progress", Toast.LENGTH_SHORT).show()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                TODO("Not yet implemented")
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                TODO("Not yet implemented")
            }
        })

        submitButton.setOnClickListener {
            finish()
        }
    }
}
