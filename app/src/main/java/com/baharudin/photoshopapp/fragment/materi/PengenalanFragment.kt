package com.baharudin.photoshopapp.fragment.materi

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.baharudin.photoshopapp.R
import com.baharudin.photoshopapp.databinding.FragmentPengenalanBinding

class PengenalanFragment : Fragment(R.layout.fragment_pengenalan) {

    private var _binding : FragmentPengenalanBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = FragmentPengenalanBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

    }
}