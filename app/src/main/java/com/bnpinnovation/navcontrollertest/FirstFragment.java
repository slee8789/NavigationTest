package com.bnpinnovation.navcontrollertest;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;


import androidx.annotation.Nullable;

import androidx.fragment.app.Fragment;



public class FirstFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        Logger.d("VideoFragment onCreateView");
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("lsc","FirstFragment onCreate");
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d("lsc","FirstFragment onViewCreated");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("lsc","FirstFragment onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("lsc","FirstFragment onDestroy");
    }
}
