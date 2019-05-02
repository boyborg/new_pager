package com.here.new_pager;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
    public class chat extends Fragment{
    static EditText inputpes;
    SendMessage ter;


    public chat() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this
        View viewFragment = inflater.inflate(R.layout.fragment_chat,container,false);
        inputpes=(EditText)viewFragment.findViewById(R.id.inputpes);
        Button input_Pes=(Button)viewFragment.findViewById((R.id.input_Pes));
        input_Pes.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
            ter.SendData(inputpes.getText().toString());
            }
        });

        return viewFragment;
    }

    interface SendMessage{
        void SendData(String message);
    }

    @Override
    public  void onAttach(Context context){
        super.onAttach(context);
        try {
            ter=(SendMessage) getActivity();
        }catch (ClassCastException e){
            throw new ClassCastException("Kesalahan penerimaan data,mohon diulang kembali");
        }
    }


}
