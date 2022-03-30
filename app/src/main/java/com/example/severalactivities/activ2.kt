package com.example.severalactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.example.severalactivities.databinding.ActivityActiv2Binding

class activ2 : AppCompatActivity() {
    private lateinit var binding: ActivityActiv2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityActiv2Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //получаем список аргументов, присланных из первого активити
        //и если эти аргументы не null, то обрабатываем

        val  carImageView: ImageView = findViewById(R.id.car)
        val carAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.car)
        carImageView.startAnimation(carAnimation)



        val arguments = intent.extras
        var name: String = "default"
        var email: String = "default"
        var phone: Int = 0


        if(arguments!=null) {
            //метод get позволяет получить значение по ключу
            name = arguments.get("name").toString()
            email = arguments.get("email").toString()
            phone = arguments.get("phone").toString().toInt()
        }
        binding.editTextTextPersonName2.text = binding.editTextTextPersonName2.text.toString()+", "+name + " " + email + " " + phone

        val btn_toact1 = binding.buttonToact1
        btn_toact1.setOnClickListener{
            val act1_start = Intent(this, MainActivity::class.java)
            startActivity(act1_start)
        }

        val btn_carFuel = binding.buttonCarFuel
        btn_carFuel.setOnClickListener{
            val fuelImageView: ImageView = findViewById(R.id.fuel)
            val fuelAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.fuel)
            fuelImageView.startAnimation(fuelAnimation)
        }

        val btn_carRotate = binding.buttonCarRotate
        btn_carRotate.setOnClickListener{
            val carImageView: ImageView = findViewById(R.id.car)
            val rotateAnimation: Animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
            carImageView.startAnimation(rotateAnimation)
        }
    }
}


