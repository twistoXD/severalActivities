package com.example.severalactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.severalactivities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val bt_toact2 = binding.buttonToact2
        bt_toact2.setOnClickListener {
//           Intent - намерение, механизм описания операции
            //создать намерение вызвать вторую активити
            val act2_start = Intent(this, activ2::class.java)
            val name = binding.editName.text.toString()
            val email = binding.editEmail.text.toString()
            val phone = binding.editPhone.text.toString()
            //метод putExtra класса Intent позволяет отдавать данные в связке ключ+значение
            act2_start.putExtra("name", name)
            act2_start.putExtra("email", email)
            act2_start.putExtra("phone", phone)
            //запуск второго активити
startActivity(act2_start)
        }
    }
}
