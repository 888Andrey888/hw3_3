package com.example.hw3_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hw3_3.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    lateinit var binding: FragmentFirstBinding
    private val adapter1 = ViewAdapter()
    private val adapter2 = ViewAdapter()
    private val adapter3 = ViewAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fillData(adapter1, "Vasya")
        fillData(adapter2, "Petya")
        fillData(adapter3, "Vanya")
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