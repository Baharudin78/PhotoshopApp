package com.baharudin.photoshopapp.fragment.materi

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.baharudin.photoshopapp.R
import com.baharudin.photoshopapp.databinding.FragmentBlurBackgroundBinding

class BlurBackgroundFragment : Fragment (R.layout.fragment_blur_background){

    private var _binding : FragmentBlurBackgroundBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = FragmentBlurBackgroundBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)
    }
}