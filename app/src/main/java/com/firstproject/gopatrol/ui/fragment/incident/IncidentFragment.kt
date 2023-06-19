package com.firstproject.gopatrol.ui.incident

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.firstproject.gopatrol.databinding.FragmentIncidentBinding

class IncidentFragment : Fragment() {

    private var _binding: FragmentIncidentBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        val incidentViewModel =
            ViewModelProvider(this).get(IncidentViewModel::class.java)

        _binding = FragmentIncidentBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textIncident
        incidentViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}