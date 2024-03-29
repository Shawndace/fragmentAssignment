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
public class SwapFragment extends Fragment implements View.OnClickListener{

    private Button btnSwapping;
    private EditText etFirst, etSecond;
    private TextView tvResult;


    public SwapFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swap, container, false);

        etFirst = view.findViewById(R.id.etFirstSwap);
        etSecond = view.findViewById(R.id.etSecondSwap);
        tvResult = view.findViewById(R.id.tvResultSwap);
        btnSwapping = view.findViewById(R.id.btnSwapping);

        btnSwapping.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int first = Integer.parseInt(etFirst.getText().toString());
        int second = Integer.parseInt(etSecond.getText().toString());

        first = first + second;
        second = first - second;
        first = first - second;

        tvResult.setText("Swapping first with second" + " first = " + first + ", second = " + second);

    }
}

