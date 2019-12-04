package com.e.second_assignment.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.e.second_assignment.R;

import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReverseStringFragment extends Fragment {


    public ReverseStringFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reverse_string, container, false);

        Button btnreverse;
        final EditText etstring;
        final TextView tvresult;

        etstring = view.findViewById(R.id.etreverse);
        tvresult = view.findViewById(R.id.tvresult);
        btnreverse = view.findViewById(R.id.btnreverse);

        btnreverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = etstring.getText().toString();

                if (!first.isEmpty()) {
                    StringBuffer c = new StringBuffer(etstring.getText().toString());
                    tvresult.setText(c.reverse());

                } else {
                    etstring.setError("Enter Charater");
                }
            }
        });
        return view;
    }

}
