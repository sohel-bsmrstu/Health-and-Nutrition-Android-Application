package com.example.sohelrana.nutrition;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculators extends Activity {

    Button bt;
    EditText edt, edt2, edt3;
    CheckBox check, check1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculators);

        bt = (Button) findViewById(R.id.btn);
        check = (CheckBox) findViewById(R.id.checkBox);
        check1 = (CheckBox) findViewById(R.id.checkBox2);
        edt = (EditText) findViewById(R.id.editText);
        edt2 = (EditText) findViewById(R.id.editText2);
        edt3 = (EditText) findViewById(R.id.editText3);

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (((CheckBox) view).isChecked()) {
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            int age = Integer.parseInt(edt.getText().toString());
                            float height = Float.parseFloat(edt2.getText().toString());
                            float weight = Float.parseFloat(edt3.getText().toString());

                            float cal, cons = (float) 0.8, cons1 = (float) 1.5;
                            float num = weight * cons;
                            float num2 = weight * cons1;

                            cal = (float) (66.47 + (13.75 * weight) + (5.0 * height) - (6.75 * age));
                            float fats = (float)((weight * 1.082) + 94.42);

                            AlertDialog alertDialog = new AlertDialog.Builder(Calculators.this).create();
                            alertDialog.setTitle("Daily Nutrition Need");
                            alertDialog.setIcon(R.drawable.nutrition_icon);
                            alertDialog.setMessage("Protein = " + num + " - " + num2 + " gram\n" + "Calorie = " + cal + " calorie" + "\n" + "Fats = "+fats );
                            alertDialog.setButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            });
                            alertDialog.show();

                        }
                    });
                }
            }
        });
        check1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (((CheckBox) view).isChecked()) {
                    bt.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            int age = Integer.parseInt(edt.getText().toString());
                            float height = Float.parseFloat(edt2.getText().toString());
                            float weight = Float.parseFloat(edt3.getText().toString());
                            float cal, cons = (float) 0.8, cons1 = (float) 1.5;
                            float num = weight * cons;
                            float num2 = weight * cons1;

                            cal = (float) (665.09 + (9.56 * weight) + (1.84 * height) - (4.67 * age));
                            float fats = (float)((weight * 0.732) + 8.987);

                            AlertDialog alertDialog = new AlertDialog.Builder(Calculators.this).create();
                            alertDialog.setTitle("Daily Nutrition Need");
                            alertDialog.setIcon(R.drawable.nutrition_icon);
                            alertDialog.setMessage("Protein = " + num + " - " + num2 + " gram\n" + "Calorie = " + cal + " calorie" + "\n" + "Fats = "+fats );
                            alertDialog.setButton("Ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {

                                }
                            });
                            alertDialog.show();
                        }
                    });
                }
            }
        });
    }
}
