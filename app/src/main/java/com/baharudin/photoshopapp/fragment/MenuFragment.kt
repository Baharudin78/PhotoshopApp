package com.baharudin.photoshopapp.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.baharudin.photoshopapp.R
import com.baharudin.photoshopapp.databinding.FragmentMenuBinding

class MenuFragment : Fragment(R.layout.fragment_menu) {

    private var _binding : FragmentMenuBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        _binding = FragmentMenuBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        binding.gotoToolboxFm.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_toolsBoxFragment)
        }
        binding.gotoPengenalan.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_pengenalanFragment)
        }
        binding.gotoBlurBackground.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_blurBackgroundFragment)
        }
        binding.gotoDesainBotol.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_botolFragment)
        }
        binding.gotoDoubleExposure.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_doubleExposureFragment)
        }
        binding.gotoFaceClean.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_faceCleanFragment)
        }
        binding.gotoJerawat.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_acneFragment)
        }
        binding.gotoSelectedHair.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_hairSelectionFragment)
        }
        binding.gotoTampilan.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_tampilanFragment)
        }
        binding.gotoTextEffect.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_textEffectFragment)
        }

        binding.gotoManipulasi.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_manipulasiFragment)
        }
        binding.gotoWaterColor.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_waterColorFragment)
        }

    }
}