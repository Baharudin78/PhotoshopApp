package com.baharudin.photoshopapp.fragment.materi

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.baharudin.photoshopapp.R
import com.baharudin.photoshopapp.databinding.FragmentFaceCleanBinding

class FaceCleanFragment : Fragment(R.layout.fragment_face_clean) {

    private var _binding : FragmentFaceCleanBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = FragmentFaceCleanBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        binding.pdfView.fromAsset("face.pdf").load()

    }
}