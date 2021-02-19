package com.baharudin.photoshopapp.fragment.materi

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.baharudin.photoshopapp.R
import com.baharudin.photoshopapp.databinding.FragmentManipulasiBinding

class ManipulasiFragment : Fragment(R.layout.fragment_manipulasi) {

    private var _binding : FragmentManipulasiBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = FragmentManipulasiBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        binding.pdfView.fromAsset("manipulasi.pdf").load()
    }
}