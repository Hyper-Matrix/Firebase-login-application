package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;
import com.backendless.async.callback.AsyncCallback;
import com.backendless.exceptions.BackendlessFault;

public class Register extends AppCompatActivity {
    private View mProgressView;
    private View mLoginFormView;
    private TextView tvLoad;

    EditText retname,retemail,retpass,retrepass;
    Button rbtnregister;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        mLoginFormView = findViewById(R.id.login_form);
        mProgressView = findViewById(R.id.login_progress);
        tvLoad = findViewById(R.id.tvLoad);

        retname = findViewById(R.id.retname);
        retemail=findViewById(R.id.retemail);
        retpass=findViewById(R.id.retpass);
        retrepass=findViewById(R.id.retrepass);
        rbtnregister = findViewById(R.id.rbtnregister);


        rbtnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(retname.getText().toString().isEmpty() || retemail.getText().toString().isEmpty()
                || retpass.getText().toString().isEmpty() || retrepass.getText().toString().isEmpty())
                {
                    Toast.makeText(Register.this,"Please Enter All Fields!!!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(retpass.getText().toString().trim().equals(retrepass.getText().toString().trim()) ){



                        String name =retname.getText().toString().trim();
                        String email = retemail.getText().toString().trim();
                        String password = retpass.getText().toString().trim();

                        BackendlessUser user = new BackendlessUser();
                        user.setEmail(email);
                        user.setPassword(password);
                        user.setProperty("name",name);
                        showProgress(true);
                        tvLoad.setText("Busy registering user!!!Please wait...");
                        Backendless.UserService.register(user, new AsyncCallback<BackendlessUser>() {
                            @Override
                            public void handleResponse(BackendlessUser response) {
                                Toast.makeText(Register.this, "User successfully registered", Toast.LENGTH_SHORT).show();
                                Register.this.finish();
                            }


                            @Override
                            public void handleFault(BackendlessFault fault) {
                                Toast.makeText(Register.this,"Error"+fault.getMessage(),Toast.LENGTH_SHORT).show();
                                showProgress(false);

                            }
                        });


                    }
                    else{

                        Toast.makeText(Register.this,"Please Re-enter password correctly",Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });




    }
    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
    private void showProgress(final boolean show) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
            int shortAnimTime = getResources().getInteger(android.R.integer.config_shortAnimTime);

            mLoginFormView.setVisibility(show ? View.GONE : View.VISIBLE);
            mLoginFormView.animate().setDuration(shortAnimTime).alpha(
                    show ? 0 : 1).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    mLoginFormView.setVisibility(show ? View.GONE : View.VISIBLE);
                }
            });

            mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
            mProgressView.animate().setDuration(shortAnimTime).alpha(
                    show ? 1 : 0).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
                }
            });

            tvLoad.setVisibility(show ? View.VISIBLE : View.GONE);
            tvLoad.animate().setDuration(shortAnimTime).alpha(
                    show ? 1 : 0).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    tvLoad.setVisibility(show ? View.VISIBLE : View.GONE);
                }
            });
        } else {

            mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
            tvLoad.setVisibility(show ? View.VISIBLE : View.GONE);
            mLoginFormView.setVisibility(show ? View.GONE : View.VISIBLE);
        }
    }
}
