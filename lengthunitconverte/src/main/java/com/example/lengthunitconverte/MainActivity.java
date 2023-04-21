package com.example.lengthunitconverte;

import com.example.weightconverter.Activity_Status_Parent;
import com.example.weightconverter.utils.MSP;


public class MainActivity extends Activity_Status_Parent {
    private Integer unitSize = 0, selectedUnit;

    @Override
    protected String getData() {
        unitSize = MSP.getInstance().getInt("KEY_UNIT_SIZE_NUMBER", 0);
        selectedUnit = MSP.getInstance().getInt("KEY_SELECTED_UNIT", 0);
        return unitSize + " Inch is " + calculate(selectedUnit) + " " + getUnitSizeName(selectedUnit);
    }

    private Double calculate(int i) {
        if (i == 0) {
            return unitSize * 2.54;
        } else if (i == 1) {
            return unitSize * 0.03;
        } else if (i == 2) {
            return unitSize * 0.0000254;
        }
        return -1.0;
    }


    private String getUnitSizeName(int i) {
        if (i == 0) {
            return "Centimeter";
        } else if (i == 1) {
            return "Meter";
        } else if (i == 2) {
            return "Kilometer";
        }
        return "";
    }
}