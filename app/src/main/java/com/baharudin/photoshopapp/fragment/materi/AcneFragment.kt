package com.baharudin.photoshopapp.fragment.materi

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.baharudin.photoshopapp.R
import com.baharudin.photoshopapp.databinding.FragmentAcneBinding

class AcneFragment : Fragment(R.layout.fragment_acne) {

    private var _binding : FragmentAcneBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = FragmentAcneBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        binding.pdfView.fromAsset("jerwat.pdf").load()
    }
}