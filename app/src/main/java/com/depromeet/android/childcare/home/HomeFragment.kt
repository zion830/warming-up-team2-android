package com.depromeet.android.childcare.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.depromeet.android.childcare.R
import com.depromeet.android.childcare.base.BaseFragment
import com.depromeet.android.childcare.databinding.FragmentHomeBinding
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf


class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home), FeedNavigator {

    private val homeViewModel: HomeViewModel by viewModel { parametersOf(this) }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        binding.viewModel = homeViewModel
        return binding.root
    }

    override fun editFeed(feedId: Int) {
        // start activity with feedId
    }

    override fun deleteFeed(feedId: Int) {
        // show dialog with feedId
    }

}