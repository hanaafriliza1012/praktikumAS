package com.example.trme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static android.provider.CallLog.Calls.DATE;
import static android.provider.MediaStore.MediaColumns.TITLE;
import static android.provider.MediaStore.Video.VideoColumns.DESCRIPTION;

public class NoteAddUpdate extends AppCompatActivity {
    boolean is_sun,is_mon,is_tues,is_wed,is_thurs,is_fri,is_sat,is_repeat;
    private EditText edtTitle, edtDescription;
    private boolean isEdit = false;
    private int position;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_add_update);
    }

}