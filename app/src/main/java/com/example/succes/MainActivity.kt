package com.example.succes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.random.Random
import java.math.BigDecimal
import java.math.RoundingMode
import java.text.DecimalFormat

var summa = 0
var res = 0
var result = 0.0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var manisler =
            arrayListOf(-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        var array = mutableListOf<Any>()

        start.setOnClickListener {
            var birinshi = Random.nextInt(1, 10000)
            var ekinshi = Random.nextInt(1, 10000)





            birinshiSan.text = birinshi.toString()
            ekinshiSan.text = ekinshi.toString()

            var amel = Random.nextInt(1, 5)

            when (amel) {
                1 -> {
                    belgi.text = "+"
                    res = birinshi + ekinshi
                    array.add(res)
                    array.add(res + (manisler.shuffled()[0]))
                    array.add(res + (manisler[1]))
                    array.add(res + (manisler[2]))
                }

                2 -> {
                    belgi.text = "-"
                    res = birinshi - ekinshi
                    array.add(res)
                    array.add(res + (manisler.shuffled()[0]))
                    array.add(res + (manisler[1]))
                    array.add(res + (manisler[2]))
                }
                3 -> {
                    belgi.text = "*"
                    res = birinshi * ekinshi
                    array.add(res)
                    array.add(res + (manisler.shuffled()[0]))
                    array.add(res + (manisler[1]))
                    array.add(res + (manisler[2]))
                }
                4 -> {
                    belgi.text = "/"
                    var one: Double = birinshi.toDouble()
                    var two: Double = ekinshi.toDouble()
                    result = (one / two) * 100
                    result = Math.round(result).toDouble() / 100
                    array.add(result)
                    array.add(result + (manisler.shuffled()[0]))
                    array.add(result + (manisler[1]))
                    array.add(result + (manisler[2]))

                }
            }

            array.shuffle()
            button1.text = "${array[0]}"
            button2.text = "${array[1]}"
            button3.text = "${array[2]}"
            button4.text = "${array[3]}"

            array.clear()
        }

        button1.setOnClickListener {

            if ((button1.text == res.toString()) || (button1.text == result.toString())) {
                summa++
                Toast.makeText(this, "points: $summa", Toast.LENGTH_SHORT).show()

            }
            //else Qate juwap saylanip utildin dew kerek ham oyin toqtawi kerek

            else {
                val konvert = Intent(this, MainActivity3::class.java)
                konvert.putExtra("San", summa)
                startActivity(konvert)
                summa = 0
            }
        }


        button2.setOnClickListener {

            if ((button2.text.toString() == res.toString()) || (button2.text == result.toString())) {
                summa++
                Toast.makeText(this, "points: $summa", Toast.LENGTH_SHORT).show()
            }
            //else Qate juwap saylanip utildin dew kerek ham oyin toqtawi kerek

            else {
                val konvert = Intent(this, MainActivity3::class.java)
                konvert.putExtra("San", summa)
                startActivity(konvert)
                summa = 0
            }
        }


        button3.setOnClickListener {

            if ((button3.text.toString() == res.toString()) || (button3.text == result.toString())) {
                summa++
                Toast.makeText(this, "points: $summa", Toast.LENGTH_SHORT).show()


            }
            //else Qate juwap saylanip utildin dew kerek ham oyin toqtawi kerek

            else {
                val konvert = Intent(this, MainActivity3::class.java)
                konvert.putExtra("San", summa)
                startActivity(konvert)
                summa = 0
            }
        }


        button4.setOnClickListener {

            if ((button4.text.toString() == res.toString()) || (button4.text == result.toString())) {
                summa++
                Toast.makeText(this, "points: $summa", Toast.LENGTH_SHORT).show()


            }
            //else Qate juwap saylanip utildin dew kerek ham oyin toqtawi kerek
            else {
                val konvert = Intent(this, MainActivity3::class.java)
                konvert.putExtra("San", summa)
                startActivity(konvert)
                summa = 0
            }
        }


    }


}
