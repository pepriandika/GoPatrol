package com.firstproject.gopatrol.ui.fragment.check

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.firstproject.gopatrol.R
import com.firstproject.gopatrol.databinding.FragmentCheckBinding
import com.firstproject.gopatrol.databinding.FragmentHomeBinding
import com.firstproject.gopatrol.ui.home.HomeViewModel

class CheckFragment : Fragment() {

    private var _binding: FragmentCheckBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(CheckViewModel::class.java)

        _binding = FragmentCheckBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textCheck
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}