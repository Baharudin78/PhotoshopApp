package com.baharudin.photoshopapp.fragment.materi

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.baharudin.photoshopapp.R
import com.baharudin.photoshopapp.databinding.FragmentToolsBoxBinding

class ToolsBoxFragment  : Fragment(R.layout.fragment_tools_box){

    private var _binding : FragmentToolsBoxBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = FragmentToolsBoxBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        binding.pdfView.fromAsset("toolbox.pdf").load()

    }
}