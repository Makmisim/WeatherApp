package com.max.weatherapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.max.weatherapp.R
import com.max.weatherapp.adapters.WeatherAdapter
import com.max.weatherapp.adapters.WeatherModel
import com.max.weatherapp.databinding.FragmentHoursBinding

class HoursFragment : Fragment() {

    private lateinit var binding: FragmentHoursBinding
    private lateinit var adapter: WeatherAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHoursBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRcView()
    }

    private fun initRcView() = with(binding) {
        rcView.layoutManager = LinearLayoutManager(activity)
        adapter = WeatherAdapter()
        rcView.adapter = adapter
        val list = listOf(
            WeatherModel(
                "Усть Джегута", "13:00", "Солнечно", "", "+20°", "", "", ""
            ),
            WeatherModel(
                "Усть Джегута", "14:00", "Солнечно", "", "+21°", "", "", ""
            ),
            WeatherModel(
                "Усть Джегута", "15:00", "Солнечно", "", "+22°", "", "", ""
            ),
            WeatherModel(
                "Усть Джегута", "16:00", "Солнечно", "", "+23°", "", "", ""
            )
        )
        adapter.submitList(list)
    }

    companion object {
        fun newInstance() = HoursFragment()
    }
}