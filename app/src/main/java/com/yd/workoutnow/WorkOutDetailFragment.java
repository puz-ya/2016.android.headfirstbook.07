package com.yd.workoutnow;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class WorkOutDetailFragment extends Fragment {

    private long mDetailID;

    public WorkOutDetailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_work_out_detail, container, false);
    }

    public void setWorkout(long id){
        mDetailID = id;
    }
}
