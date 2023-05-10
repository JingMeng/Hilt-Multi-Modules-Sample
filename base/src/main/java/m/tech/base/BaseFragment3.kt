package m.tech.base

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import java.lang.reflect.ParameterizedType


/**
 * I tried this at first
 * I thought it was because of I have a constructor, so I tried [BaseFragment2] but still not work.
 */
abstract class BaseFragment3<Binding : ViewDataBinding>(
    private val inflate: Inflate<Binding>,
    private val clazz: Class<Binding>
) : Fragment() {

    protected var binding: Binding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var modelClass: Class<*>? = null
        val type = javaClass.genericSuperclass
        if (null != type && type is ParameterizedType) {
            val parameterizedType = type
            if (parameterizedType.actualTypeArguments.size > 0) {
                //ViewModel 位于泛型第一个
                modelClass = parameterizedType.actualTypeArguments[0] as Class<*>
            }
        }

        Log.d("TAG", "onViewCreated: ${clazz.name}---123456-----$modelClass----")
        binding = inflate.invoke(inflater, container, false)
        return binding!!.root
    }

}
