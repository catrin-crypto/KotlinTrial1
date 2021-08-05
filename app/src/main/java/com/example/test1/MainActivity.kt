package com.example.test1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val hello: TextView = findViewById(R.id.hello)
        val button: Button = findViewById(R.id.button)
        var weekend = Weekend("sunday",1)
        weekend.printWeekend()
        var copiedObj = MyCopyableObj.copy()
        MyCopyableObj.name = "newName"
        MyCopyableObj.age = 0
        print("MyObject :")
        MyCopyableObj.print()
        print("Copied object :")
        copiedObj.print()

        var myArr = intArrayOf(2, 55, 1, 0, 777, 43, 23)
        for (i in myArr.indices){
            println(i)
        }
        for (i in 1.. 4){
            println(i)
        }


        val person = Person()
        val personCopy = person.copy()
        println("Copied class: " )
        println(personCopy)

        button.setOnClickListener{
            hello.setText("Button pressed!")
        }



    }
}