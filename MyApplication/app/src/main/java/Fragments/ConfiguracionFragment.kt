package Fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.preference.CheckBoxPreference
import android.support.v7.preference.Preference
import android.support.v7.preference.PreferenceFragmentCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox

import com.example.myapplication.R
import com.google.zxing.client.android.Intents

class ConfiguracionFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val vista = inflater.inflate(R.layout.fragment_configuracion, container, false)
        val checkBox = vista.findViewById<CheckBox>(R.id.norden_checkBox)
        if(SharedData.SharedInstance.codigoOpcional){
            checkBox.isChecked = true
        }else{
            checkBox.isChecked = false
        }

        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                SharedData.SharedInstance.codigoOpcional = true
            }else{
                SharedData.SharedInstance.codigoOpcional = false
            }
        }
        return vista
    }
}
