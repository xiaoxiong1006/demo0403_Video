package com.tencent.liteav.demo

//import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tencent.liteav.demo.videorecord.TCVideoSettingActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_record.setOnClickListener{
            var intent = Intent()
            intent.setClass(this, TCVideoSettingActivity().javaClass)
            startActivity(intent)
        }

    }
}
