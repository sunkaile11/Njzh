package com.example.kaile.njzh.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kaile.njzh.R;

/**
 * Created by kaile on 2017/10/8.
 */

public class TitleFragment extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.title_layout,container,false);
        return view;
    }
}
