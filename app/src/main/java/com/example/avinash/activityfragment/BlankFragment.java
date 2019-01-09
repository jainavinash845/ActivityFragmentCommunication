package com.example.avinash.activityfragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BlankFragment extends Fragment {

 /*interface FragmentCallBAck{
     void onClickButton(BlankFragment blankFragment);
 }*/

    public BlankFragment() {
        // Required empty public constructor
    }

    /* public static BlankFragment newInstance(String message) {

        Bundle args = new Bundle();
        args.putString("name",message);

        BlankFragment fragment = new BlankFragment();
        fragment.setArguments(args);
        return fragment;
    }*/



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view=inflater.inflate(R.layout.fragment_blank, container, false);



       /* Bundle bundle = this.getArguments();
        String message=bundle.getString("name");

       // rm.setText(message);

        /*Bundle bundle=getArguments();
        String message=bundle.getString("key");
        textView.setText(message);
        getArguments().getString("key");
            textView.getText().toString();*/
        return view;
    }


}
