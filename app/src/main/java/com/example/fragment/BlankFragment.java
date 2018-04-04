package com.example.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        Button button = view.findViewById(R.id.fb_change_fragment_btn);
        button.setOnClickListener(view1 -> {
            ((Callback) getActivity()).changeFragmentClicked(null);
        });
        return view;
    }

    public interface Callback {
        void changeFragmentClicked(View view);
    }

}
