package com.pallefire.b_34dialogbox;


import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyprogessDialog extends DialogFragment {
    ProgressDialog progressDialog;


    public MyprogessDialog() {
        // Required empty public constructor
    }
    public Dialog onCreateDialog(Bundle savedInstanceState){
        Dialog d=null;
        //progrss dialog without button
        progressDialog=new ProgressDialog(getActivity());
        progressDialog.setIcon(R.mipmap.ic_launcher);
        progressDialog.setTitle("uploading");
        progressDialog.setMessage("2 of 10 images are uploaded");
        //progressDialog.setProgress(20);
        progressDialog.setProgressStyle(progressDialog.STYLE_HORIZONTAL);
        d= progressDialog;

        return d;
    }

//


    @Override
    public void onResume() {
        super.onResume();
        progressDialog.setProgress(20);
    }
}
