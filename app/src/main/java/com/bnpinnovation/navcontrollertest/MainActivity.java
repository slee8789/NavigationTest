package com.bnpinnovation.navcontrollertest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private NavController mNavController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNavController = Navigation.findNavController(this, R.id.fragment_container);
    }

    public void goToFirst(View view) {
        Log.d("lsc","goToFirst");
//        mNavController.navigate(R.id.navigation_first);
//        mNavController.navigateUp();
//        mNavController.popBackStack();
        mNavController.popBackStack(R.id.navigation_second,true);
    }

    public void goToSecond(View view) {
        Log.d("lsc","goToSecond");
        mNavController.navigate(R.id.navigation_second);
    }

    public void goToThird(View view) {
        Log.d("lsc","goToThird");
        mNavController.navigate(R.id.navigation_third);
    }
}
