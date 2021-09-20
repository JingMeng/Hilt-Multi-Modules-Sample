package m.tech.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

typealias Inflate<T> = (LayoutInflater, ViewGroup?, Boolean) -> T

/**
 * I tried this at first
 * I thought it was because of I have a constructor, so I tried [BaseFragment2] but still not work.
 */
abstract class BaseFragment<Binding : ViewDataBinding>(
    private val inflate: Inflate<Binding>
) : Fragment() {

    protected var binding: Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = inflate.invoke(inflater, container, false)
        return binding!!.root
    }

}
