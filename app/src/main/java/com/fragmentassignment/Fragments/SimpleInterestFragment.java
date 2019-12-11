package com.fragmentassignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleInterestFragment extends Fragment implements View.OnClickListener {

private Button btnSimpleInterest;
private EditText etPrincipal, etTime, etRate;
private TextView tvResult;


public SimpleInterestFragment() {
        // Required empty public constructor
        }


@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_interest, container, false);

        etPrincipal = view.findViewById(R.id.etPrincipal);
        etTime = view.findViewById(R.id.etTime);
        etRate = view.findViewById(R.id.etRate);
        btnSimpleInterest = view.findViewById(R.id.btnSimpleInterest);
        tvResult = view.findViewById(R.id.tvResultSimpleInterest);

        btnSimpleInterest.setOnClickListener(this);
        return view;
        }

@Override
public void onClick(View v) {
        float principal = Float.parseFloat(etPrincipal.getText().toString());
        float time = Float.parseFloat(etTime.getText().toString());
        float rate = Float.parseFloat(etRate.getText().toString());
        float si = (principal * time * rate) / 100;

//        Toast.makeText(getActivity(), "Simple intrest is :" + simpleintrest, Toast.LENGTH_SHORT).show();

        tvResult.setText("Simple intrest is:" + si);

        }
        }
