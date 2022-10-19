package com.example.fragmentos

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


/**
 * A simple [Fragment] subclass.
 * Use the [VerdeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class VerdeFragment : Fragment() {

    private var listener: Comunicador?=null


    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is Comunicador){
            listener = context
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var viewRoot = inflater.inflate(R.layout.fragment_verde, container, false)
        viewRoot.findViewById<Button>(R.id.btnFrVerde).setOnClickListener { listener?.onClickRestar() }

        // Inflate the layout for this fragment
       return viewRoot
    }

}