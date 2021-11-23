package com.example.datafrominternet.overview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.datafrominternet.R
import com.example.datafrominternet.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
   val viewModel: OverviewViewModel by viewModels()

   override fun onCreateView(
      inflater: LayoutInflater,
      container: ViewGroup?,
      savedInstanceState: Bundle?
   ): View? {
      val binding = FragmentFirstBinding.inflate(inflater)
      binding.lifecycleOwner = this
      binding.viewModel = viewModel
      return binding.root
   }
}