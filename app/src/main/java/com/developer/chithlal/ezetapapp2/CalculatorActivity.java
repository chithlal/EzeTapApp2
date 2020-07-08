package com.developer.chithlal.ezetapapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class CalculatorActivity extends AppCompatActivity {
    public static final String PARAM_ONE = "param_one";
    public static final String PARAM_TWO = "param_two";
    public static final String PARAM_OPERATION = "OPERATION";
    public static final String OP_ADD = "Add";
    public static final String OP_SUB = "sub";
    public static final int RES_CODE = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Intent intent = getIntent();
        if (intent!=null){
            int input1 = intent.getIntExtra(PARAM_ONE,0);
            int input2 = intent.getIntExtra(PARAM_TWO,0);
            String action = intent.getStringExtra(PARAM_OPERATION);

            int result = 0;

            assert action != null;
            if (action.equals(OP_ADD)){
                result = input1+input2;
            }
            else if (action.equals(OP_SUB)){
                result = input1 - input2;
            }

            Intent resultIntent = new Intent();
            resultIntent.putExtra("RESULT",result);
            setResult(RESULT_OK,resultIntent);
            finish();

        }
    }
}