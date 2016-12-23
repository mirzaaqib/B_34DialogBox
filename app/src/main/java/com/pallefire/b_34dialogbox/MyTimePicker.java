package com.pallefire.b_34dialogbox;


import android.app.Dialog;
import android.app.TimePickerDialog;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyTimePicker extends DialogFragment {


    public MyTimePicker() {
        // Required empty public constructor
    }


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog d= null;
        Calendar calendar=Calendar.getInstance();
        int hour =calendar.get(Calendar.HOUR);
        int min =calendar.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog =new TimePickerDialog(getActivity(), new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int i, int i1) {
                Toast.makeText(getActivity(), "The time is"+i+":"+i1, Toast.LENGTH_SHORT).show();
                MainActivity mainActivity= (MainActivity) getActivity();
                mainActivity.catchData1(i+":"+i1);

            }
        }, hour, min, false);
        d=timePickerDialog;
        return d;
    }
}
