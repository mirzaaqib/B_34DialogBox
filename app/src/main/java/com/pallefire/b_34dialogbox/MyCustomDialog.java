package com.pallefire.b_34dialogbox;


import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyCustomDialog extends DialogFragment {


    public MyCustomDialog() {
        // Required empty public constructor
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d=null;
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle("GMail");
        //set body (fragment_my_custom_dialog)
         View v= getActivity().getLayoutInflater().inflate(R.layout.fragment_my_custom_dialog,null);
        final EditText et1= (EditText) v.findViewById(R.id.et1);
        EditText et2= (EditText) v.findViewById(R.id.et2);
        CheckBox cb= (CheckBox) v.findViewById(R.id.ch1);
        builder.setView(v);
        builder.setPositiveButton("login", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), "username : "+et1.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("logout", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                getActivity().finish();
            }
        });
        d=builder.create();
        return d;
    }
}
