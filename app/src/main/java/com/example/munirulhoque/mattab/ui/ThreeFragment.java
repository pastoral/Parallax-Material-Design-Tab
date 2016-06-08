package com.example.munirulhoque.mattab.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.munirulhoque.mattab.R;


/**
 * Created by munirul.hoque on 5/16/2016.
 */
public class ThreeFragment extends Fragment {
    public ThreeFragment (){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_three,container,false);
        return view;
    }
}
