package com.baharudin.photoshopapp.fragment.materi

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.baharudin.photoshopapp.R
import com.baharudin.photoshopapp.databinding.FragmentTextEffectBinding

class TextEffectFragment : Fragment(R.layout.fragment_text_effect){

    private var _binding : FragmentTextEffectBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = FragmentTextEffectBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

    }
}