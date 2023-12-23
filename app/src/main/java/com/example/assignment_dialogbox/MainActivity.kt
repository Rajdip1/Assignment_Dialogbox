package com.example.assignment_dialogbox

import android.app.AlertDialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.assignment_dialogbox.databinding.ActivityMainBinding
import com.example.assignment_dialogbox.ui.theme.Assignment_DialogboxTheme

class MainActivity : ComponentActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnQn1.setOnClickListener {
            val builder1 = AlertDialog.Builder(this)
            val options = arrayOf("Voyager 1", "Cassini", "Parker Solar Prob", "Voyager 2")
            builder1.setTitle("Which spacecraft is far away from earth?")
            builder1.setSingleChoiceItems(options, 0, DialogInterface.OnClickListener { dialog, which ->
                //what should be perform when user click on the option
                Toast.makeText(this,"Answer is ${options[which]}",Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder1.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder1.show()
        }

        binding.btnQn2.setOnClickListener {
            val options = arrayOf("Phobos", "Deimos", "Europa", "Titan")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("From the following, which are moons of Mars ?")
            builder2.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialog, which, isChecked ->
                Toast.makeText(this,"You selected ${options[which]}",Toast.LENGTH_SHORT).show()
            })
            builder2.setPositiveButton("Submit",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder2.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder2.show()
        }

        binding.btnQn3.setOnClickListener {

            val options = arrayOf("Orion","Libra","Canis Major","Andromeda")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("Which are the constellations ?")
            builder3.setMultiChoiceItems(options, null, DialogInterface.OnMultiChoiceClickListener { dialogInterface, i, b ->
                Toast.makeText(this,"You selected ${options[i]}",Toast.LENGTH_SHORT).show()
            })
            builder3.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder3.setNegativeButton("Decline", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder3.show()
        }

        binding.btnExit.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Do u want to exit ?")
            builder.setMessage("are u sure ?")
            builder.setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                finish()
            })
            builder.setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->

            })
            builder.show()
        }
    }
}

