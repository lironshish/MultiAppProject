package com.example.weightconverter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.weightconverter.utils.MSP;
import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class Activity_Home extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    //UI Variables
    TextView title, unit_size, result;
    EditText input_txt;
    MaterialButton BTN_calculate;
    Spinner spinner;
    ImageView IMG_convert;


    int unitSize = 0, selectedUnit = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        findViews();
        spinner.setOnItemSelectedListener(this);
        initButtons();
    }

    private void initButtons() {
        BTN_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getUnitSizeNumber();
                startActivity(new Intent(Activity_Home.this, App_Parent.statsClass));
            }
        });
    }

    private int getUnitSizeNumber() {
        unitSize = Integer.parseInt(input_txt.getText().toString());
        MSP.getInstance().putInt("KEY_UNIT_SIZE_NUMBER", unitSize);
        return unitSize;
    }


    private void findViews() {
        title = findViewById(R.id.title);
        unit_size = findViewById(R.id.unit_size);
        input_txt = findViewById(R.id.input_txt);
        BTN_calculate = findViewById(R.id.BTN_calculate);
        spinner = findViewById(R.id.spinner);
        IMG_convert = findViewById(R.id.IMG_convert);
        result = findViewById(R.id.result);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        selectedUnit = i;
        MSP.getInstance().putInt("KEY_SELECTED_UNIT", selectedUnit);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}