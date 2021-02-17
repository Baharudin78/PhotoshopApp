package com.baharudin.photoshopapp.fragment.materi

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.baharudin.photoshopapp.R
import com.baharudin.photoshopapp.databinding.FragmentTampilanBinding

class TampilanFragment : Fragment(R.layout.fragment_tampilan) {

    private var _binding : FragmentTampilanBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = FragmentTampilanBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

    }
}