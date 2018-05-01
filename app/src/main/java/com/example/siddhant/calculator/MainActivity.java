package com.example.siddhant.calculator;

import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper dbh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dbh = new DatabaseHelper(this);
        final android.widget.Button btn_add = findViewById(R.id.btn_add);
        final android.widget.Button btn_sbtract = findViewById(R.id.btn_sbtract);
        final android.widget.Button btn_mult = findViewById(R.id.btn_mult);
        final android.widget.Button btn_div = findViewById(R.id.btn_div);
        final android.widget.Button btn_ext = findViewById(R.id.btn_ext);
        final android.widget.Button btn_clr = findViewById(R.id.btn_clr);

        final EditText value1 = findViewById(R.id.value1);
        final EditText value2 = findViewById(R.id.value2);
        final TextView value3 = findViewById(R.id.textView);

        btn_add.setOnClickListener(new android.view.View.OnClickListener()
        {
            public void onClick(android.view.View v)
            {

                double out  = Double.parseDouble(value1.getText().toString()) + Double.parseDouble(value2.getText().toString());
                value3.setText(String.valueOf(out));
                boolean isInserted = dbh.insertData(value1.getText().toString(),value2.getText().toString(), value3.getText().toString());
                if (isInserted == true)
                    Toast.makeText(MainActivity.this,"Data inserted..", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this,"Data is not inserted..", Toast.LENGTH_LONG).show();
            }
        }  );

        btn_sbtract.setOnClickListener(new android.view.View.OnClickListener()
        {
            public void onClick(android.view.View v)
            {

                double out  = Double.parseDouble(value1.getText().toString()) - Double.parseDouble(value2.getText().toString());
                value3.setText(String.valueOf(out));
                boolean isInserted = dbh.insertData(value1.getText().toString(),value2.getText().toString(), value3.getText().toString());
                if (isInserted == true)
                    Toast.makeText(MainActivity.this,"Data inserted..", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this,"Data is not inserted..", Toast.LENGTH_LONG).show();
            }
        }  );

        btn_mult.setOnClickListener(new android.view.View.OnClickListener()
        {
            public void onClick(android.view.View v)
            {

                double out  = Double.parseDouble(value1.getText().toString()) * Double.parseDouble(value2.getText().toString());
                value3.setText(String.valueOf(out));
                boolean isInserted = dbh.insertData(value1.getText().toString(),value2.getText().toString(), value3.getText().toString());
                if (isInserted == true)
                    Toast.makeText(MainActivity.this,"Data inserted..", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this,"Data is not inserted..", Toast.LENGTH_LONG).show();
            }
        }  );

        btn_div.setOnClickListener(new android.view.View.OnClickListener()
        {
            public void onClick(android.view.View v)
            {

                double out  = Double.parseDouble(value1.getText().toString()) / Double.parseDouble(value2.getText().toString());
                value3.setText(String.valueOf(out));
                boolean isInserted = dbh.insertData(value1.getText().toString(),value2.getText().toString(), value3.getText().toString());
                if (isInserted == true)
                    Toast.makeText(MainActivity.this,"Data inserted..", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this,"Data is not inserted..", Toast.LENGTH_LONG).show();
            }
        }  );


        btn_ext.setOnClickListener(new android.view.View.OnClickListener()
        {
            public void onClick(android.view.View v)
            {
                System.exit(0);

            }
        }  );

        btn_clr.setOnClickListener(new android.view.View.OnClickListener()
        {
            public void onClick(android.view.View v)
            {
                value1.setText("");
                value2.setText("");
                value3.setText("");

            }
        }  );


    }


}
