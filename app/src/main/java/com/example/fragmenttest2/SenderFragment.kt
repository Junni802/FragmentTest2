package com.example.fragmenttest2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.example.fragmenttest2.databinding.FragmentReceiverBinding
import com.example.fragmenttest2.databinding.FragmentSenderBinding


class SenderFragment : Fragment() {
	lateinit var binding: FragmentSenderBinding
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		binding = FragmentSenderBinding.inflate(inflater, container, false)
		return binding.root
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		
		binding.bntYes.setOnClickListener { 
			val bundle = bundleOf("valueKey" to "yes")
			// 번들을 키와 값을 이용하여 간편하게 생성함
		}
		binding.btnNo.setOnClickListener {
			val bundle = bundleOf("valueKey" to "No")
		}
	}
}