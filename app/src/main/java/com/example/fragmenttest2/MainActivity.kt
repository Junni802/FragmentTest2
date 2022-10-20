package com.example.fragmenttest2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmenttest2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setFragment()
    }

    fun setFragment() {
        val senderFragment: SenderFragment = SenderFragment()
        val receiverFragment: ReceiverFragment = ReceiverFragment()
        val trans = supportFragmentManager.beginTransaction()
        trans.add(R.id.frameLayout1, senderFragment)
        trans.add(R.id.frameLayout2, receiverFragment)
        trans.commit()
    }
}