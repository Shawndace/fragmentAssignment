package com.fragmentassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AutomorphicFragment extends Fragment implements View.OnClickListener {

    private Button btnAutoMorphic;
    private EditText etNumber;
    private TextView tvResult;



    public AutomorphicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_automorphic, container, false);

        etNumber = view.findViewById(R.id.etNumberAutoMorphic);
        btnAutoMorphic = view.findViewById(R.id.btnAutoMorphic);
        tvResult = view.findViewById(R.id.tvResultAutomorphic);

        btnAutoMorphic.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int a,s,c=1;
        int number = Integer.parseInt(etNumber.getText().toString());

        a=number;

        s=number*number;

        while (number!=0)

        {

            c=c*10;

            number=number/10;

        }

        if(s%c==a)
            tvResult.setText("The Number is Automorphic");

        else
            tvResult.setText("The Number is Not Automorphic");


    }
}
