package com.billykybe.fitme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CreateAccount extends AppCompatActivity {


    ImageView eye = findViewById(R.id.ca_eye);
    TextView rememberMe = findViewById(R.id.rememberMe_txt);
    ImageView rememberCheck = findViewById(R.id.ca_remcheck);
    TextView signUp = findViewById(R.id.ca_continue);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);


        rememberMe.setOnClickListener(view -> {



            if (rememberCheck.getVisibility()== View.INVISIBLE){

                //save login data
                rememberCheck.setVisibility(View.VISIBLE);


            }else {

                //dont save data
                rememberCheck.setVisibility(View.INVISIBLE);
            }

        });

        eye.setOnClickListener(view -> {

            if (eye.getResources().equals(R.drawable.design_ic_visibility_off)){
                eye.setImageResource(R.drawable.design_ic_visibility);
            }else {
                eye.setImageResource(R.drawable.design_ic_visibility_off);

            }

        });


        signUp.setOnClickListener(view -> {

        });
    }
}