package com.github.takahirom.feature

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.github.takahirom.dagger.hilt.multimodule.sample.feature.R
import com.github.takahirom.dagger.hilt.multimodule.sample.feature.databinding.FragmentWillErrorBinding
import dagger.hilt.android.AndroidEntryPoint
import m.tech.base.BaseFragment
import m.tech.base.BaseFragment2
import javax.inject.Inject

//ERROR CASE: this will cause compile error
@AndroidEntryPoint
class WillErrorFragment :
    BaseFragment<FragmentWillErrorBinding>(FragmentWillErrorBinding::inflate) {

}

//ERROR CASE: this will cause compile error too
//@AndroidEntryPoint
//class WillErrorFragment : BaseFragment2<FragmentWillErrorBinding>() {
//    override fun binding() = FragmentWillErrorBinding.inflate(layoutInflater)
//}


//NORMAL CASE - which will work.
//@AndroidEntryPoint
//class WillErrorFragment : Fragment(R.layout.fragment_will_error){
//    @AppHash
//    @Inject
//    lateinit var hash: String
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        println("Hilt multi modules $hash")
//    }
//
//}