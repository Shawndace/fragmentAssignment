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
public class PalindromeFragment extends Fragment implements View.OnClickListener {
    private Button btnPalindrome;
    private EditText etNumber;
    private TextView tvResult;



    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome, container, false);

        etNumber = view.findViewById(R.id.etNumberPalindrome);
        btnPalindrome = view.findViewById(R.id.btnPalindrome);
        tvResult = view.findViewById(R.id.tvResultPalindrome);

        btnPalindrome.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int r, sum = 0, temp;
        int number = Integer.parseInt(etNumber.getText().toString());

        temp = number;
        while (number > 0) {
            r = number % 10;  //getting remainder
            sum = (sum * 10) + r;
            number = number / 10;
        }
        if (temp == sum)

            tvResult.setText("The Number is Palindrome");

        else
            tvResult.setText("The Number is Not Palindrome");
    }
}
