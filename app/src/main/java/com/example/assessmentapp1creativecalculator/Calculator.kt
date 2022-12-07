package com.example.assessmentapp1creativecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import android.content.Intent
import kotlinx.android.synthetic.main.activity_calculator.*

class Calculator : AppCompatActivity() {

    val dropdownlist1 = arrayOf("Stawberry", "Chocolate", "Vanilla", "Blueberry", "Caramel")
    val dropdownlist2 = arrayOf("Cake", "Ice Cream", "Milkshake")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist1)
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist2)

        val b1 = findViewById(R.id.button) as Button

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)

        // spinner 1 (flavours)
        elements1.adapter = adapter
        elements1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                if (elements1.selectedItemPosition == 0)
                {
                    textView.setText(" " + elements1.selectedItem)
                }
                if (elements1.selectedItemPosition == 1)
                {
                    textView.setText(" " + elements1.selectedItem)
                }
                if (elements1.selectedItemPosition == 2)
                {
                    textView.setText(" " + elements1.selectedItem)
                }
                if (elements1.selectedItemPosition == 3)
                {
                    textView.setText(" " + elements1.selectedItem)
                }
                if (elements1.selectedItemPosition == 4)
                {
                    textView.setText(" " + elements1.selectedItem)
                }
            }
        }

        // spinner 2 (food)
        elements2.adapter = adapter2
        elements2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long)
            {
                if (elements2.selectedItemPosition == 0)
                {
                    textView2.setText(" " + elements2.selectedItem)
                }
                if (elements2.selectedItemPosition == 1)
                {
                    textView2.setText(" " + elements2.selectedItem)
                }
                if (elements2.selectedItemPosition == 2)
                {
                    textView2.setText(" " + elements2.selectedItem)
                }
            }
        }

        // button function (result)
        b1.setOnClickListener {

            // strawberry
            if(elements1.selectedItemPosition == 0 && elements2.selectedItemPosition == 0)
            {
                textView3.setText("YUM! You made a Strawberry Cake")
            }
            if(elements1.selectedItemPosition == 0 && elements2.selectedItemPosition == 1)
            {
                textView3.setText("YUM! You made a Strawberry Ice Cream")
            }
            if(elements1.selectedItemPosition == 0 && elements2.selectedItemPosition == 2)
            {
                textView3.setText("YUM! You made a Strawberry Milkshake")
            }

            // chocolate
            if(elements1.selectedItemPosition == 1 && elements2.selectedItemPosition == 0)
            {
                textView3.setText("TYUM! You made a Chocolate Cake")
            }
            if(elements1.selectedItemPosition == 1 && elements2.selectedItemPosition == 1)
            {
                textView3.setText("YUM! You made a Chocolate Ice Cream")
            }
            if(elements1.selectedItemPosition == 1 && elements2.selectedItemPosition == 2)
            {
                textView3.setText("YUM! You made a Chocolate Milkshake")
            }

            // vanilla
            if(elements1.selectedItemPosition == 2 && elements2.selectedItemPosition == 0)
            {
                textView3.setText("YUM! You made a Vanilla Cake")
            }
            if(elements1.selectedItemPosition == 2 && elements2.selectedItemPosition == 1)
            {
                textView3.setText("YUM! You made a Vanilla Ice Cream")
            }
            if(elements1.selectedItemPosition == 2 && elements2.selectedItemPosition == 2)
            {
                textView3.setText("YUM! You made a Vanilla Milkshake")
            }

            // blueberry
            if(elements1.selectedItemPosition == 3 && elements2.selectedItemPosition == 0)
            {
                textView3.setText("YUM! You made a Blueberry Cake")
            }
            if(elements1.selectedItemPosition == 3 && elements2.selectedItemPosition == 1)
            {
                textView3.setText("YUM! You made a Blueberry Ice Cream")
            }
            if(elements1.selectedItemPosition == 3 && elements2.selectedItemPosition == 2)
            {
                textView3.setText("YUM! You made a Blueberry Milkshake")
            }

            // caramel
            if(elements1.selectedItemPosition == 4 && elements2.selectedItemPosition == 0)
            {
                textView3.setText("YUM! You made a Caramel Cake")
            }
            if(elements1.selectedItemPosition == 4 && elements2.selectedItemPosition == 1)
            {
                textView3.setText("YUM! You made a Caramel Ice Cream")
            }
            if(elements1.selectedItemPosition == 4 && elements2.selectedItemPosition == 2)
            {
                textView3.setText("YUM! You made a Caramel Milkshake")
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.info -> {
                val intent = Intent(this, Info::class.java)
                startActivity(intent)
                return true
            }
            R.id.instructions -> {
                val intent = Intent(this, Instructions::class.java)
                startActivity(intent)
                return true
            }
            else ->
                return super.onOptionsItemSelected(item)
        }
    }
}