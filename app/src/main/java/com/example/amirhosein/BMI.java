package com.example.amirhosein;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class BMI {

    public TextView height;
    public EditText in_height;
    public TextView weight;
    public EditText in_weight;
    public TextView age;
    public EditText in_age;
    public Button calculation;

    public Float height_bm;
    public Float weight_bm;
    public Integer opt_bmi;
    public String say_person_bmi;
    public Float convert_bmi;

    public TextView ins_bmi;
    public TextView ins_bmi_value;
    public TextView description;
    public TextView description_bmi;
    public TextView opt_bmi_view;
    public TextView say_opt_bmi;
    public TextView w_w;
    public TextView extra_weight;

    public String p_b;
    public String p_b_b;
    public String o_b;
    public String w_r;

    public Float Weightrange;
    public Float opt_weight;


    public void init(LinearLayout layout, Context context) {

        height.setText("Enter your height:");
        in_height.setHint("height");

        weight.setText("Enter your weight:");
        in_weight.setHint("weight");

        age.setText("Enter your age:");
        in_age.setHint("age");

        calculation.setText("calculation");
        calculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  person_bmi();
                  personal_base_bmi();
                  optimal_bmi();
                  rang_weight();


            }
        });

        ins_bmi.setText("your BMI:");
        ins_bmi_value.setText(p_b);
        description.setText("Your BMI Description:");
        description_bmi.setText(p_b_b);
        opt_bmi_view.setText("Best BMI for you:");
        say_opt_bmi.setText(o_b);
        w_w.setText("extra weight:");
        extra_weight.(w_r);




        layout.addView(height);
        layout.addView(in_height);
        layout.addView(weight);
        layout.addView(in_weight);
        layout.addView(age);
        layout.addView(in_age);
        layout.addView(calculation);
        layout.addView(ins_bmi);
        layout.addView(ins_bmi_value);
        layout.addView(description);
        layout.addView(description_bmi);
        layout.addView(opt_bmi_view);
        layout.addView(say_opt_bmi);




    }

    public void convert(){
        String height_str=in_height.getText().toString();
        height_bm=Float.parseFloat(height_str);
        height_bm=height_bm/100;
        String weight_str=in_weight.getText().toString();
        weight_bm=Float.parseFloat(weight_str);
    }

    public void person_bmi(){
        convert();
        convert_bmi=weight_bm/(height_bm*height_bm);
    }

    public String personal_base_bmi(){
        if (convert_bmi<=19){
            say_person_bmi=("You are slim");
        }
        else if (convert_bmi>19 & convert_bmi<=25){
            say_person_bmi=("You are normal");
        }
        else if (convert_bmi>25 & convert_bmi<=30){
            say_person_bmi=("You are overweight");
        }
        else if (convert_bmi>30){
            say_person_bmi=("You are very fat.You should kill your self.There is no hope for you to become normal");
        }

        return say_person_bmi;
    }

    public void rang_weight(){
        opt_weight=(height_bm*height_bm)*opt_bmi;
        Weightrange=weight_bm-opt_weight;
    }


    public void optimal_bmi(){
        String age_str=in_age.getText().toString();
        int in_age=Integer.parseInt(age_str);

        if (in_age>=17 & in_age<=19){
            opt_bmi=21;
        }
        else if (in_age>=19 & in_age<=24){
            opt_bmi=22;
        }
        else if (in_age>=24 & in_age<=34){
            opt_bmi=23;
        }
        else if (in_age>=34 & in_age<=44){
            opt_bmi=24;
        }
        else if (in_age>=44 & in_age<=54){
            opt_bmi=25;
        }
        else if (in_age>=54 & in_age<=64){
            opt_bmi=26;
        }
        else if (in_age > 64){
            opt_bmi=27;
        }

    }


}


