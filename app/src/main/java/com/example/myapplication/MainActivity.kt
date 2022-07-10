package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text = findViewById<TextView>(R.id.result)
        var textValue = ""

        //getting buttons
        var b0 = findViewById<Button>(R.id.b0) as Button
        var b1 = findViewById<Button>(R.id.b1) as Button
        var b2 = findViewById<Button>(R.id.b2) as Button
        var b3 = findViewById<Button>(R.id.b3) as Button
        var b4 = findViewById<Button>(R.id.b4) as Button
        var b5 = findViewById<Button>(R.id.b5) as Button
        var b6 = findViewById<Button>(R.id.b6) as Button
        var b7 = findViewById<Button>(R.id.b7) as Button
        var b8 = findViewById<Button>(R.id.b8) as Button
        var b9 = findViewById<Button>(R.id.b9) as Button

        var ac = findViewById<Button>(R.id.AC) as Button
        var plusminus = findViewById<Button>(R.id.plusminus) as Button
        var precent = findViewById<Button>(R.id.precent) as Button
        var div = findViewById<Button>(R.id.div) as Button
        var mul = findViewById<Button>(R.id.mul) as Button
        var plus = findViewById<Button>(R.id.plus) as Button
        var minus = findViewById<Button>(R.id.minus) as Button
        var eq = findViewById<Button>(R.id.eq) as Button


        ac.setOnClickListener(){
            textValue = ""
            text.text = textValue
        }
        precent.setOnClickListener(){
            textValue += "%"
            text.text = textValue
            eq.setOnClickListener(){
                val num1:Int = textValue.substringBefore("%").toInt()
                val num2:Int = textValue.substringAfter("%").toInt()
                var res = num1%num2
                textValue = res.toString()
                text.text = textValue
            }
        }
        div.setOnClickListener(){
            textValue += "/"
            text.text = textValue
            eq.setOnClickListener(){
                val num1:Int = textValue.substringBefore("/").toInt()
                val num2:Int = textValue.substringAfter("/").toInt()
                var res = num1/num2
                textValue = res.toString()
                text.text = textValue
            }
        }
        mul.setOnClickListener(){
            textValue += "*"
            text.text = textValue
            eq.setOnClickListener(){
                val num1:Int = textValue.substringBefore("*").toInt()
                val num2:Int = textValue.substringAfter("*").toInt()
                var res = num1*num2
                textValue = res.toString()
                text.text = textValue
            }
        }
        plus.setOnClickListener(){
            textValue += "+"
            text.text = textValue
            eq.setOnClickListener(){
                val num1:Int = textValue.substringBefore("+").toInt()
                val num2:Int = textValue.substringAfter("+").toInt()
                var res = num1+num2
                textValue = res.toString()
                text.text = textValue
            }
        }
        minus.setOnClickListener(){
            textValue += "-"
            text.text = textValue
            eq.setOnClickListener(){
                val num1:Int = textValue.substringBefore("-").toInt()
                val num2:Int = textValue.substringAfter("-").toInt()
                var res = num1-num2
                textValue = res.toString()
                text.text = textValue
            }
        }


        b0.setOnClickListener(){
            textValue += "0"
            text.text = textValue
        }

        b1.setOnClickListener(){
            textValue += "1"
            text.text = textValue
        }
        b2.setOnClickListener(){
            textValue += "2"
            text.text = textValue
        }
        b3.setOnClickListener(){
            textValue += "3"
            text.text = textValue
        }
        b4.setOnClickListener(){
            textValue += "4"
            text.text = textValue
        }
        b5.setOnClickListener(){
            textValue += "5"
            text.text = textValue
        }
        b6.setOnClickListener(){
            textValue += "6"
            text.text = textValue
        }
        b7.setOnClickListener(){
            textValue += "7"
            text.text = textValue
        }
        b8.setOnClickListener(){
            textValue += "8"
            text.text = textValue
        }
        b9.setOnClickListener(){
            textValue += "9"
            text.text = textValue
        }



    }
}
