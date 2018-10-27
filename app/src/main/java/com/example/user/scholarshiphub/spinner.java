package com.example.user.scholarshiphub;


import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


import java.util.ArrayList;


public class spinner extends AppCompatActivity  {

    ImageButton typeButton,countryButton,fieldButton,degreeButton ;
    TextView scholarType,field,degree,country;
    String[] listItems1,listItems2,listItems3,listItems4;
    boolean[] checkedItems1,checkedItems2,checkedItems3,checkedItems4;
    ArrayList<Integer> mUserItems1 = new ArrayList<>();
    ArrayList<Integer> mUserItems2 = new ArrayList<>();
    ArrayList<Integer> mUserItems3 = new ArrayList<>();
    ArrayList<Integer> mUserItems4 = new ArrayList<>();
    Button button2 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spinner);

        typeButton = (ImageButton) findViewById(R.id.typeButton);
        scholarType = (TextView) findViewById(R.id.scholarType);
        countryButton = (ImageButton) findViewById(R.id.countryButton);
        country = (TextView) findViewById(R.id.country);
        fieldButton = (ImageButton) findViewById(R.id.fieldButton);
        field = (TextView) findViewById(R.id.field);
        degreeButton = (ImageButton) findViewById(R.id.degreeButton);
        degree = (TextView) findViewById(R.id.degree);
        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(spinner.this, home.class);
                startActivity(intent);

            }
        });

        listItems1 = getResources().getStringArray(R.array.spinner_options);
        checkedItems1 = new boolean[listItems1.length];


        typeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(spinner.this);
                mBuilder.setTitle("Types of Scholarships");
                mBuilder.setMultiChoiceItems(listItems1, checkedItems1, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int position, boolean isChecked) {

                        if(isChecked){
                            mUserItems1.add(position);
                        }else{
                            mUserItems1.remove((Integer.valueOf(position)));
                        }
                    }
                });

                mBuilder.setCancelable(false);
                mBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        String item = "";
                        for (int i = 0; i < mUserItems1.size(); i++) {
                            item = item + listItems1[mUserItems1.get(i)];
                            if (i != mUserItems1.size() - 1) {
                                item = item + ", ";
                            }
                        }
                        scholarType .setText(item);
                    }
                });

                mBuilder.setNeutralButton("Clear All", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        for (int i = 0; i < checkedItems1.length; i++) {
                            checkedItems1[i] = false;
                            mUserItems1.clear();
                            scholarType.setText("");
                        }
                    }
                });

                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        //////////////////////////////////////////////

        listItems2 = getResources().getStringArray(R.array.country_options);
        checkedItems2 = new boolean[listItems2.length];

        countryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(spinner.this);
                mBuilder.setTitle("Country Looking Into");
                mBuilder.setMultiChoiceItems(listItems2, checkedItems2, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int position, boolean isChecked) {

                        if(isChecked){
                            mUserItems2.add(position);
                        }
                        else{
                            mUserItems2.remove((Integer.valueOf(position)));
                        }
                    }
                });

                mBuilder.setCancelable(false);
                mBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        String item = "";
                        for (int i = 0; i < mUserItems2.size(); i++) {
                            item = item + listItems2[mUserItems2.get(i)];
                            if (i != mUserItems2.size() - 1) {
                                item = item + ", ";
                            }
                        }
                        country.setText(item);
                    }
                });

                mBuilder.setNeutralButton("Clear All", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        for (int i = 0; i < checkedItems2.length; i++) {
                            checkedItems2[i] = false;
                            mUserItems2.clear();
                            country.setText("");
                        }
                    }
                });

                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        /////////////////////////////////////////////

        listItems3 = getResources().getStringArray(R.array.degree_options);
        checkedItems3 = new boolean[listItems3.length];

        degreeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(spinner.this);
                mBuilder.setTitle("Degree");
                mBuilder.setMultiChoiceItems(listItems3, checkedItems3, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int position, boolean isChecked) {

                        if(isChecked){
                            mUserItems3.add(position);
                        }else{
                            mUserItems3.remove((Integer.valueOf(position)));
                        }
                    }
                });

                mBuilder.setCancelable(false);
                mBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        String item = "";
                        for (int i = 0; i < mUserItems3.size(); i++) {
                            item = item + listItems3[mUserItems3.get(i)];
                            if (i != mUserItems3.size() - 1) {
                                item = item + ", ";
                            }
                        }
                        degree.setText(item);
                    }
                });

                mBuilder.setNeutralButton("Clear All", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        for (int i = 0; i < checkedItems3.length; i++) {
                            checkedItems3[i] = false;
                            mUserItems3.clear();
                            degree.setText("");
                        }
                    }
                });

                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        /////////////////////////////////////////////

        listItems4 = getResources().getStringArray(R.array.field_options);
        checkedItems4 = new boolean[listItems4.length];

        fieldButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(spinner.this);
                mBuilder.setTitle("Area of Interest");
                mBuilder.setMultiChoiceItems(listItems4, checkedItems4, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int position, boolean isChecked) {

                        if(isChecked){
                            mUserItems4.add(position);
                        }else{
                            mUserItems4.remove((Integer.valueOf(position)));
                        }
                    }
                });

                mBuilder.setCancelable(false);
                mBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        String item = "";
                        for (int i = 0; i < mUserItems4.size(); i++) {
                            item = item + listItems4 [mUserItems4.get(i)];
                            if (i != mUserItems4.size() - 1) {
                                item = item + ", ";
                            }
                        }
                        field.setText(item);
                    }
                });


                mBuilder.setNeutralButton("Clear All", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        for (int i = 0; i < checkedItems4.length; i++) {
                            checkedItems4[i] = false;
                            mUserItems4.clear();
                            field.setText("");
                        }
                    }
                });

                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });



    }
}