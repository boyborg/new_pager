package com.here.new_pager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Status extends Fragment {
    TextView takeIt;


    public Status() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewFragment=inflater.inflate(R.layout.fragment_status,container,false);
        takeIt=(TextView)viewFragment.findViewById(R.id.terimatxt);

        return viewFragment;
    }

    protected  void displayRecieveData(String message){
        takeIt.setText("Date diterima"+message);

    }



}
