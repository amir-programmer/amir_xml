package com.example.amirhosein;
//package com.example.bmi;

import android.content.Context;
import android.widget.LinearLayout;

public class CustomLayout extends LinearLayout {
    public CustomLayout(Context context) {
        super(context);
        this.setOrientation(VERTICAL);

//        Array main=new Array();
//        main.init(this,context);

        com.example.amirhosein.BMI main=new com.example.amirhosein.BMI();
        main.init(this,context);


    }
}

