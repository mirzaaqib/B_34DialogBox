package com.pallefire.b_34dialogbox;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyDatePicker extends DialogFragment {


    public MyDatePicker() {
        // Required empty public constructor
    }


  public Dialog onCreateDialog(Bundle SavedInstanceState){
      Dialog d=null;
      Calendar calendar=Calendar.getInstance();
      int year =calendar.get(Calendar.YEAR);
      int month =calendar.get(Calendar.MONTH);
      int date =calendar.get(Calendar.DATE);
      DatePickerDialog datePickerDialog=new DatePickerDialog(getActivity(), new DatePickerDialog.OnDateSetListener() {
          @Override
          public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
              //this method is called when user clicks done button
              Toast.makeText(getActivity(), "SELECTED :"+year+"-"+month+"-"+dayOfMonth, Toast.LENGTH_SHORT).show();
              MainActivity mainActivity= (MainActivity) getActivity();
              mainActivity.catchData(year+"/"+(month+1)+"/"+dayOfMonth);
          }
      }, year, month, date);
      d=datePickerDialog;
      return d;
  }

}
