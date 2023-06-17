package com.example.hw3_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hw3_3.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding
    private val adapter1 = ViewAdapter()
    private val adapter2 = ViewAdapter()
    private val adapter3 = ViewAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fillData(adapter1, "Masha")
        fillData(adapter2, "Olya")
        fillData(adapter3, "Luba")
        initAdapter()
    }

    private fun initAdapter() {
        binding.apply {
            rvView1.layoutManager = LinearLayoutManager(requireContext())
            rvView1.adapter = adapter1
            rvView2.layoutManager = LinearLayoutManager(requireContext())
            rvView2.adapter = adapter2
            rvView3.layoutManager = LinearLayoutManager(requireContext())
            rvView3.adapter = adapter3
        }
    }

    private fun fillData(adap: ViewAdapter, data: String) {
        adap.addItem(data)
        adap.addItem(data)
        adap.addItem(data)
        adap.addItem(data)
        adap.addItem(data)
        adap.addItem(data)
        adap.addItem(data)
        adap.addItem(data)
        adap.addItem(data)
        adap.addItem(data)
        adap.addItem(data)
        adap.addItem(data)
        adap.addItem(data)
    }
}