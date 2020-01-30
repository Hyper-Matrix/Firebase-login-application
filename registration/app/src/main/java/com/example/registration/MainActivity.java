package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {
    EditText etname, etsurname;
    Button btadd, btsave;
    ArrayList<person> data;
    TextView tvresults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etname = findViewById(R.id.etname);
        etsurname = findViewById(R.id.etsurname);
        ArrayList<person> data = new ArrayList<person>();
tvresults= findViewById(R.id.tvresults);
loadData();
    }
    public void btnadddata(View v)
    {
        String name = etname.getText().toString().trim();
        String surname = etsurname.getText().toString().trim();

        person person = new person(name,surname);
        data.add(person);
        setTextToView();
    }

    private void setTextToView() {
        String text = "";
        for(int i =0; i <data.size();i++){
            text = text + data.get(i).getName()+""+data.get(i).getSurname();

        }
        tvresults.setText(text);


    }
public void loadData()
   {
        data.clear();
        File file = getApplicationContext().getFileStreamPath("Data.txt");
        String read;
        if(file.exists())
        {
            try{
                BufferedReader reader = new BufferedReader(new InputStreamReader(openFileInput("Data.txt")));
                while ((read = reader.readLine()) != "null")
                {
                    StringTokenizer token = new StringTokenizer(read,",");
                    person person = new person(token.nextToken(), token.nextToken());
                    data.add(person);
                }
                reader.close();
                    setTextToView();
            }
            catch (IOException e)
            {

            }

        }


    }
    public void btnsavedata(View v)
    {
        try
        {
            FileOutputStream file = openFileOutput("Data.txt",MODE_PRIVATE);
            OutputStreamWriter output = new OutputStreamWriter(file);
            for(int i=0;i<  data.size();i++){
             output.write(data.get(i).getName()+","+data.get(i).getSurname());

            }
            output.flush();
            output.close();
            Toast.makeText(this,"Successfully saved",Toast.LENGTH_SHORT).show();
        }
        catch(IOException e)
        {
         Toast.makeText(this,e.getMessage(),Toast.LENGTH_SHORT).show();
        }
    }
}
