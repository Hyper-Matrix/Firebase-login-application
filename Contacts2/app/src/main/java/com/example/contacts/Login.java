package com.example.contacts;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
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

public class Login extends AppCompatActivity {
    private View mProgressView;
    private View mLoginFormView;
    private TextView tvLoad;

    EditText etmail,etpass;
    Button btnlogin,btnregister;
    TextView tvreset;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mLoginFormView = findViewById(R.id.login_form);
        mProgressView = findViewById(R.id.login_progress);
        tvLoad = findViewById(R.id.tvLoad);


        etmail = findViewById(R.id.etmail);
        etpass =findViewById(R.id.etpass);
        btnlogin = findViewById(R.id.btnlogin);
        btnregister = findViewById(R.id.btnregister);
        tvreset = findViewById(R.id.tvreset);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               if(etmail.getText().toString().isEmpty() || etpass.getText().toString().isEmpty())
               {
                   Toast.makeText(Login.this,"Please enter all fields",Toast.LENGTH_SHORT).show();
               }
               else
               {
                   String email = etmail.getText().toString().trim();
                   String password = etpass.getText().toString().trim();
                   showProgress(true);
                   tvLoad.setText("Logging in>>>>");
                   Backendless.UserService.login(email, password, new AsyncCallback<BackendlessUser>() {
                       @Override
                       public void handleResponse(BackendlessUser response) {
                           Toast.makeText(Login.this,"Logged in successfully",Toast.LENGTH_SHORT).show();
                           Intent intent = new Intent(Login.this,MainActivity.class);
                           startActivity(intent);
                           Login.this.finish();
                       }

                       @Override
                       public void handleFault(BackendlessFault fault) {
                           Toast.makeText(Login.this,"Error!!!"+fault.getMessage(),Toast.LENGTH_SHORT).show();
                           showProgress(false);

                       }
                   }, true);
               }
            }
        });


        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this,Register.class);
                startActivity(intent);

            }
        });


        tvreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etmail.getText().toString().isEmpty()){
                    Toast.makeText(Login.this,"Please enter the email and then reset password",Toast.LENGTH_SHORT).show();
                }
else{
   String email = etmail.getText().toString().trim();
    Backendless.UserService.restorePassword(email, new AsyncCallback<Void>() {
        @Override
        public void handleResponse(Void response) {
            Toast.makeText(Login.this,"Reset instructions sent to email",Toast.LENGTH_SHORT).show();
       showProgress(false);
        }

        @Override
        public void handleFault(BackendlessFault fault) {
            Toast.makeText(Login.this,"Error!!!"+fault.getMessage(),Toast.LENGTH_SHORT).show();
            showProgress(false);

        }
    });


                }
            }
        });

    }
    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
    private void showProgress(final boolean show) {
        // On Honeycomb MR2 we have the ViewPropertyAnimator APIs, which allow
        // for very easy animations. If available, use these APIs to fade-in
        // the progress spinner.
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
            // The ViewPropertyAnimator APIs are not available, so simply show
            // and hide the relevant UI components.
            mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
            tvLoad.setVisibility(show ? View.VISIBLE : View.GONE);
            mLoginFormView.setVisibility(show ? View.GONE : View.VISIBLE);
        }
    }
}
