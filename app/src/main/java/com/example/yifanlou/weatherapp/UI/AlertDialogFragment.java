package com.example.yifanlou.weatherapp.UI;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;

import com.example.yifanlou.weatherapp.R;

public class AlertDialogFragment extends DialogFragment {

    @Override
    public Dialog  onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setTitle(R.string.error_title)
                .setMessage(com.example.yifanlou.weatherapp.R.string.error_massage)
        .setPositiveButton(com.example.yifanlou.weatherapp.R.string.error_button_ok_text, null);

        return builder.create();
    }
}
