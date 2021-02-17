package com.baharudin.photoshopapp.fragment.materi

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.baharudin.photoshopapp.R
import com.baharudin.photoshopapp.databinding.FragmentHairSelectionBinding

class HairSelectionFragment : Fragment(R.layout.fragment_hair_selection) {

    private var _binding : FragmentHairSelectionBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = FragmentHairSelectionBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

    }
}