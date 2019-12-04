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
public class AreaofcircleFragment extends Fragment {


    public AreaofcircleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_areaofcircle, container, false);

        Button btncalculate;
        final EditText etfirst;

        btncalculate = view.findViewById(R.id.btnclaculate);
        etfirst = view.findViewById(R.id.etfirst);


        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(etfirst.getText().toString());

                int result = (22/7)*first*first;

                Toast.makeText(getActivity(), "Area of circle is : " + result, Toast.LENGTH_SHORT).show();
            }
        });
        return view;

    }

}
