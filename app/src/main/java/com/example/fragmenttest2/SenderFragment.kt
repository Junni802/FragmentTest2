package com.example.fragmenttest2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
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
		var gender = "";
		binding.radioGroup.setOnCheckedChangeListener { group, chkId -> if(chkId == R.id.woman) gender = "여자" else gender = "남자" }
		binding.btnSend.setOnClickListener {
			val bundle = bundleOf("valueKey" to "${binding.name.text} ${gender}")

			setFragmentResult("request", bundle)
		}
	}
}