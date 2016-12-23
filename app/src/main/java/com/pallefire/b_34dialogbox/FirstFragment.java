package com.pallefire.b_34dialogbox;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends DialogFragment {


    public FirstFragment() {
        // Required empty public constructor
    }

    public Dialog onCreateDialog(Bundle savedInstanceState){
        Dialog d=null;
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle("Warning");
        builder.setMessage("This is your first Dialog");
        builder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "Hello Aqib", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(),"Kill kr diya,,Lol" , Toast.LENGTH_SHORT).show();
                getActivity().finish();
            }
        });
        d=builder.create();
        return d;


    }

}
