package com.example.hw3_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDialogFragment
import androidx.fragment.app.Fragment
import com.example.hw3_3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var fragNumber = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showFragment(FirstFragment())
        initListener()
    }

    private fun initListener() {
        binding.btnNextFragment.setOnClickListener {
            when (fragNumber) {
                0 -> {
                    fragNumber++
                    showFragment(FirstFragment())
                }

                1 -> {
                    fragNumber++
                    showFragment(SecondFragment())
                }

                2 -> {
                    fragNumber = 0
                    showFragment(ThirdFragment())
                }
            }
        }

        binding.btnFrag1.setOnClickListener {
            showFragment(FirstFragment())
            fragNumber = 1
        }

        binding.btnFrag2.setOnClickListener {
            showFragment(SecondFragment())
            fragNumber = 2
        }

        binding.btnFrag3.setOnClickListener {
            showFragment(ThirdFragment())
            fragNumber = 0
        }
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.ll_container, fragment).commit()
    }
}