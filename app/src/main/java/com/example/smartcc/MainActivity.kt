package com.example.smartcc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.smartcc.fragment.Beverages
import com.example.smartcc.fragment.Extras
import com.example.smartcc.fragment.dishesFragment

class MainActivity : AppCompatActivity() {
    private lateinit var toolbar: Toolbar;
    private lateinit var view:View
    private lateinit var view2:View
    private lateinit var view3:View
    lateinit var fragmentManager:FragmentManager
    private lateinit var fragmentTransaction:FragmentTransaction
    private lateinit var frameLayout:FrameLayout
    private lateinit var dishes:TextView
    private lateinit var beverages:TextView
    private lateinit var extras:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        toolbar?.title = "Smart CC"
        frameLayout = findViewById(R.id.framelayout);


        fragmentManager = supportFragmentManager
         fragmentTransaction = fragmentManager.beginTransaction()

        dishes = findViewById(R.id.tv_dishes)
        beverages= findViewById(R.id.tv_beverages)
        extras = findViewById(R.id.extras)
        view = findViewById(R.id.view)
        view2 = findViewById(R.id.view2)
        view3  = findViewById(R.id.view3)

// Replace MyFragment with the actual name of your fragment class
        val fragment = dishesFragment()
        val fragment2 = Beverages()
        val fragment3 = Extras()

        fragmentTransaction.replace(R.id.framelayout, fragment)
        fragmentTransaction.commit()



        dishes.setOnClickListener {
            fragmentTransaction = fragmentManager.beginTransaction()

            fragmentTransaction.replace(R.id.framelayout, fragment)
            fragmentTransaction.commit()
            view.visibility = View.VISIBLE
            view2.visibility = View.INVISIBLE
            view3.visibility = View.INVISIBLE
        }
        beverages.setOnClickListener {
            fragmentTransaction = fragmentManager.beginTransaction()

            fragmentTransaction.replace(R.id.framelayout, fragment2)
            fragmentTransaction.commit()
            view2.visibility = View.VISIBLE
            view.visibility = View.INVISIBLE
            view3.visibility = View.INVISIBLE
        }
        extras.setOnClickListener {
            fragmentTransaction = fragmentManager.beginTransaction()

            fragmentTransaction.replace(R.id.framelayout, fragment3)
            fragmentTransaction.commit()
            view3.visibility = View.VISIBLE
            view2.visibility = View.INVISIBLE
            view.visibility = View.INVISIBLE

        }



    }
}