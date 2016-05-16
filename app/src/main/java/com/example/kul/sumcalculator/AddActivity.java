package com.example.kul.sumcalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.helper.ItemTouchUIUtil;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {

    Button addButton,subButton;
    EditText edittext1,edittext2;
    TextView result;
    //double num1,num2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        addButton = (Button)findViewById(R.id.button);
        edittext1=(EditText)findViewById(R.id.editText) ;
        edittext2=(EditText)findViewById(R.id.editText2);
        result=(TextView)findViewById(R.id.textView);
        subButton=(Button)findViewById(R.id.button2);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                int a= Integer.parseInt(value1);
                int b= Integer.parseInt(value2);
                int sum= a+b;
                result.setText(Double.toString(sum));

            }
        });
        subButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                String value1=edittext1.getText().toString();
                String value2=edittext2.getText().toString();
                int a= Integer.parseInt(value1);
                int b= Integer.parseInt(value2);
                int sub=a-b;
                result.setText(Double.toString(sub));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
