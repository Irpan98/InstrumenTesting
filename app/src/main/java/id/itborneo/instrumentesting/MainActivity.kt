package id.itborneo.instrumentesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_hasil.setOnClickListener {
            val number1 = et_number1.text.toString().toInt()
            val number2 = et_number2.text.toString().toInt()

            Log.d("MainAcitivy","btn hasil : $number1 , $number2")
            val hasil = number1 * number2
            tv_hasil.text = hasil.toString()
        }
    }
}