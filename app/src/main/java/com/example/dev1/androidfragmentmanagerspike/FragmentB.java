package com.example.dev1.androidfragmentmanagerspike;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentB extends Fragment {

    public final String TAG_FRAGMENT_B = "FRAGMENT_B_TAG";

    Button showA;
    Button hideA;
    Button detachA;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        showA = (Button) view.findViewById(R.id.fragment_b_showA_button);
        showA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getFragmentManager().beginTransaction().show(TAG_FRAGMENT_B)
            }
        });

        hideA = (Button) view.findViewById(R.id.fragment_b_hideA_button);

        detachA = (Button) view.findViewById(R.id.fragment_b_detachA_button);

        return view;
    }
}
