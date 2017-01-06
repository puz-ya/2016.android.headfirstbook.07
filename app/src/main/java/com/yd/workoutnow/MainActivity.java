package com.yd.workoutnow;

import android.app.Activity;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WorkOutDetailFragment workOutDetailFragment = (WorkOutDetailFragment)getFragmentManager().findFragmentById(R.id.detail_fragment);
        workOutDetailFragment.setWorkout(1);
    }
}
