package com.example.alertdialog

import android.app.Dialog
import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    lateinit var clMain: ConstraintLayout
    lateinit var buttonSh: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        clMain = findViewById(R.id.clMain)
        buttonSh = findViewById(R.id.button)

        buttonSh.setOnClickListener {
            showDialog()
//            val builder = AlertDialog.Builder(this)
//            val myLL = LinearLayout(this)
//            val etInp = EditText(this)
//            val tvSh = TextView(this)
//            builder.setMessage("Enter your favorite author: ")
//
//            myLL.orientation = LinearLayout.VERTICAL
//            myLL.addView(etInp)
//            myLL.addView(tvSh)
//            myLL.setPadding(30, 30, 30, 30)
//            //builder.setView(myLL)
//
//            builder.setPositiveButton("TV", DialogInterface.OnClickListener { dialog, id ->
//                    tvSh.text = "${etInp.text}"
//                    Toast.makeText(applicationContext,"hi",Toast.LENGTH_LONG)
//                })
//                builder.setNegativeButton("Go", DialogInterface.OnClickListener { dialog, id ->
//                    val usInp = "${etInp.text}"
//                    val intent = Intent(this, MainActivity2::class.java)
//                    intent.putExtra("User Input", usInp)
//                    startActivity(intent)
//                })
//            val fave = builder.create()
//
//            fave.setTitle("Favorite Author")
//            builder.setView(myLL)
//            fave.show()
        }
    }
    private fun showDialog() {
        val customDialog = Dialog(this)
        customDialog.setContentView(R.layout.dia)
        customDialog.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        val tvBtn = customDialog.findViewById(R.id.btnTV) as Button
        val goBtn = customDialog.findViewById(R.id.btnGo) as Button
        val tv = customDialog.findViewById(R.id.tv) as TextView
        val et = customDialog.findViewById(R.id.etAuthor) as EditText
        tvBtn.setOnClickListener {

            tv.text = "${et.text}"

        }

        goBtn.setOnClickListener {
                val usInp = "${et.text}"
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("User Input", usInp)
                startActivity(intent)
        }
        customDialog.show()
    }

//    private fun anAlert(){
//        val builder = AlertDialog.Builder(this)
//        val etInp = EditText(this)
//        val tvSh = TextView(this)
//        builder.setMessage("Enter your favorite author: ")
//            .setPositiveButton("TV", DialogInterface.OnClickListener {
//                    dialog, id -> tvSh.text = "${etInp.text}"
//            })
//            .setNegativeButton("Go", DialogInterface.OnClickListener {
//                    dialog, id ->
//                val usInp = "${etInp.text}"
//                val intent = Intent(this, MainActivity2::class.java)
//                intent.putExtra("User Input", usInp)
//                startActivity(intent)
//            })
//        val fave = builder.create()
//        fave.setTitle("Favorite Author")
//        fave.setView(etInp)
//        fave.show()
//    }
}