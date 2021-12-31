package com.client.soulstudio.ui.view.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.client.soulstudio.data.model.Item
import com.client.soulstudio.databinding.FragmentMainBinding
import com.client.soulstudio.ui.adapter.MainAdapter
import com.client.soulstudio.ui.viewmodel.MainViewModel
import com.client.soulstudio.utils.Status.*
import com.client.soulstudio.utils.gone
import com.client.soulstudio.utils.showSnackBar
import com.client.soulstudio.utils.visible
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private val mainViewModel by viewModels<MainViewModel>()

    @Inject
    lateinit var mAdapter: MainAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupUI()
        observer()
    }

    private fun setupUI() {

        mAdapter = MainAdapter()
        binding.recyclerView.adapter = mAdapter
    }

    private fun observer() {
        mainViewModel.getBooks().observe(requireActivity(), {

            when (it.status) {
                SUCCESS -> {
                    binding.progressBar.gone()
                    binding.recyclerView.scheduleLayoutAnimation()

                    it.data?.let { result -> setList(result) }
                    binding.recyclerView.visible()
                }
                LOADING -> {
                    binding.progressBar.visible()
                    binding.recyclerView.gone()
                }
                ERROR -> {
                    binding.progressBar.gone()
                    showSnackBar(
                        requireActivity(), it.message.toString()
                    )
                }
            }
        })
    }

    private fun setList(myBooks: List<Item>) {
        mAdapter.setData(myBooks)
    }

}