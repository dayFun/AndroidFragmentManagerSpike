package com.example.dev1.androidfragmentmanagerspike;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentA extends Fragment {

    public final String TAG_FRAGMENT_A = "FRAGMENT_A_TAG";

    Button showB;
    Button hideB;
    Button detachB;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        showB = (Button) view.findViewById(R.id.fragment_a_showB_button);
        hideB = (Button) view.findViewById(R.id.fragment_a_hideB_button);
        detachB = (Button) view.findViewById(R.id.fragment_a_detachB_button);

        return view;
    }
}
