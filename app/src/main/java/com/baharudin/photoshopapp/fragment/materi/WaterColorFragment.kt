package com.baharudin.photoshopapp.fragment.materi

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.baharudin.photoshopapp.R
import com.baharudin.photoshopapp.databinding.FragmentWaterColorBinding

class WaterColorFragment : Fragment(R.layout.fragment_water_color) {

    private var _binding : FragmentWaterColorBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = FragmentWaterColorBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)
    }
}