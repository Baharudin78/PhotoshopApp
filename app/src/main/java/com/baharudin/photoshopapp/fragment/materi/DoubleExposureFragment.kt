package com.baharudin.photoshopapp.fragment.materi

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.baharudin.photoshopapp.R
import com.baharudin.photoshopapp.databinding.FragmentDoubleExposureBinding

class DoubleExposureFragment : Fragment(R.layout.fragment_double_exposure){

    private var _binding : FragmentDoubleExposureBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = FragmentDoubleExposureBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        binding.pdfView.fromAsset("doubelexposure.pdf").load()
    }
}