package com.e.second_assignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.e.second_assignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SumFragment extends Fragment {


    public SumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sum, container, false);

        Button btncalculate;
        final EditText etfirst, etsecond;

        btncalculate = view.findViewById(R.id.btnclaculate);
        etfirst = view.findViewById(R.id.etfirst);
        etsecond = view.findViewById(R.id.etsecond);

        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(etfirst.getText().toString());
                int second = Integer.parseInt(etsecond.getText().toString());
                int result = first + second;

                Toast.makeText(getActivity(), "Sum is :" + result, Toast.LENGTH_SHORT).show();
            }
        });
        return view;


    }

}
