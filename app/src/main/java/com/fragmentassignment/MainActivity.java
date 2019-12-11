package com.fragmentassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fragmentassignment.Fragments.ArmstrongFragment;
import com.fragmentassignment.Fragments.AutomorphicFragment;
import com.fragmentassignment.Fragments.CircleFragment;
import com.fragmentassignment.Fragments.PalindromeFragment;
import com.fragmentassignment.Fragments.SimpleInterestFragment;
import com.fragmentassignment.Fragments.SwapFragment;
import com.fragmentassignment.Fragments.armstrongFragment;
import com.fragmentassignment.Fragments.automorphicFragment;
import com.fragmentassignment.Fragments.circleFragment;
import com.fragmentassignment.Fragments.palindromeFragment;
import com.fragmentassignment.Fragments.simpleInterestFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnAreaofCircle,btnPalindrome,btnSimpleIntrest,btnArmstrong,
            btnAutomorphic, btnSwapping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAreaofCircle = findViewById(R.id.btnAreaofCircle);
        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnSimpleIntrest = findViewById(R.id.btnSimpleInterest);
        btnArmstrong = findViewById(R.id.btnArmstrong);
        btnAutomorphic = findViewById(R.id.btnAutoMorphic);
        btnSwapping = findViewById(R.id.btnSwapping);

        btnAreaofCircle.setOnClickListener(this);
        btnPalindrome.setOnClickListener(this);
        btnSimpleIntrest.setOnClickListener(this);
        btnArmstrong.setOnClickListener(this);
        btnAutomorphic.setOnClickListener(this);
        btnSwapping.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()) {
            case R.id.btnAreaofCircle:

                CircleFragment areaofCircle = new CircleFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,areaofCircle);
                fragmentTransaction.commit();
                break;
            case R.id.btnPalindrome:

                PalindromeFragment palindrome = new PalindromeFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,palindrome);
                fragmentTransaction.commit();
                break;
            case R.id.btnSimpleInterest:

                SimpleInterestFragment simpleInterest = new SimpleInterestFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,simpleInterest);
                fragmentTransaction.commit();
                break;
            case R.id.btnArmstrong:

                ArmstrongFragment armstrong = new ArmstrongFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,armstrong);
                fragmentTransaction.commit();
                break;
            case R.id.btnAutoMorphic:

                AutomorphicFragment automorphic = new AutomorphicFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,automorphic);
                fragmentTransaction.commit();
                break;
            case R.id.btnSwapping:

                SwapFragment swapping = new SwapFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,swapping);
                fragmentTransaction.commit();
                break;

    }
}
