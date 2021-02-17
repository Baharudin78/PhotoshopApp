package com.baharudin.photoshopapp.fragment.materi

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.baharudin.photoshopapp.R
import com.baharudin.photoshopapp.databinding.FragmentBotolBinding

class BotolFragment : Fragment(R.layout.fragment_botol) {

    private var _binding : FragmentBotolBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = FragmentBotolBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)
    }
}