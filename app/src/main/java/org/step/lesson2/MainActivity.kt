package org.step.lesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

const val LOG = "icarus"
const val PASS = "fallen"

class MainActivity : AppCompatActivity() {

    lateinit var login:EditText
    lateinit var passwrod:EditText
    lateinit var btnShow:Button
    lateinit var btnCheck:Button
    lateinit var showTxt:TextView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        login = findViewById(R.id.login)
        passwrod = findViewById(R.id.password)
        btnShow = findViewById(R.id.btn_show)
        btnCheck = findViewById(R.id.btn_check)
        showTxt = findViewById(R.id.show_txt)

        btnShow.setOnClickListener{
            if(showTxt.isShown()){
                showTxt.visibility= View.GONE
                login.visibility =View.GONE
                passwrod.visibility=View.GONE
                btnCheck.visibility=View.GONE
            }else{

                showTxt.visibility=View.VISIBLE
                login.visibility =View.VISIBLE
                passwrod.visibility=View.VISIBLE
                btnCheck.visibility=View.VISIBLE
            }
        }

        btnCheck.setOnClickListener{
            if(login.text.toString() == LOG && passwrod.text.toString() == PASS){

                showTxt.text="It is so sad! :("
            }else{
                showTxt.text=""
            }
        }
    }


}