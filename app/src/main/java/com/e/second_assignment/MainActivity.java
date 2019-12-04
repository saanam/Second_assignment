package com.e.second_assignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.e.second_assignment.Fragments.AreaofcircleFragment;
import com.e.second_assignment.Fragments.AutomorphicNumberFragment;
import com.e.second_assignment.Fragments.PalindromeNumberFragment;
import com.e.second_assignment.Fragments.ReverseStringFragment;
import com.e.second_assignment.Fragments.ReverseanoFragment;
import com.e.second_assignment.Fragments.SumFragment;

public class MainActivity extends AppCompatActivity {

    Button btnsum, btnarea, btnreversenumber, btnreversetring, btnautomorphic, btnpalindrome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsum = findViewById(R.id.btnsum);
        btnarea = findViewById(R.id.btnarea);
        btnreversenumber = findViewById(R.id.btnreversenumber);
        btnreversetring = findViewById(R.id.btnreversestring);
        btnautomorphic = findViewById(R.id.btnautomorphic);
        btnpalindrome = findViewById(R.id.btnpalindrome);

        btnsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =  getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                SumFragment firstFragment = new SumFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,firstFragment);
                fragmentTransaction.commit();

            }
        });

        btnarea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =  getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                AreaofcircleFragment firstFragment = new AreaofcircleFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,firstFragment);
                fragmentTransaction.commit();

            }
        });

        btnreversenumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =  getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ReverseanoFragment firstFragment = new ReverseanoFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,firstFragment);
                fragmentTransaction.commit();
            }
        });

        btnreversetring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =  getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ReverseStringFragment firstFragment = new ReverseStringFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,firstFragment);
                fragmentTransaction.commit();
            }
        });

        btnpalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =  getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                PalindromeNumberFragment firstFragment = new PalindromeNumberFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,firstFragment);
                fragmentTransaction.commit();
            }
        });

        btnautomorphic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager =  getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                AutomorphicNumberFragment firstFragment = new AutomorphicNumberFragment();
                fragmentTransaction.replace(R.id.fragmentcontainer,firstFragment);
                fragmentTransaction.commit();
            }
        });

    }
}
