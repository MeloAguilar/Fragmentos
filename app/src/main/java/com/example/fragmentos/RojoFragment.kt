package com.example.fragmentos

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class RojoFragment : Fragment() {

    private var listener:Comunicador? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is Comunicador){
            listener = context
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btnFrRojo).setOnClickListener{listener?.onClickSumar()}
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {    var viewRoot = inflater.inflate(R.layout.fragment_rojo, container, false)
        var boton : View = viewRoot.findViewById(R.id.btnFrRojo)

        // Inflate the layout for this fragment
        return viewRoot
    }
}