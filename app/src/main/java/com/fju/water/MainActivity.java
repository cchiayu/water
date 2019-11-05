package com.fju.water;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.TextUtils;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edMonth;
    private EditText edNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        EditText month;
        EditText next;
        edMonth = findViewById(R.id.month);
        edNext = findViewById(R.id.next);
        edMonth.setText("");
        edNext.setText("");

        new AlertDialog.Builder(this)
                .setTitle("每月抄表費用")
                .setMessage("費用")
                .setPositiveButton("OK", null)
                .show();
        new AlertDialog.Builder(this)
                .setTitle("隔月抄表費用")
                .setMessage("費用")
                .setPositiveButton("OK", null)
                .show();
        if (! TextUtils.isEmpty(edNext.getText().toString())){
            float degree = Float.parseFloat(edNext.getText().toString());
            float money = 0;
            if(degree<21){
                money = 7.35f*degree
            }
        }

  /*  public void calculate{
        if (1 <= edMonth <= 10) {
            month = (float) (month * 7.35);
        } else if (11 <= edMonth <= 30) {
            month = (float) (month * 9.45 - 21);
        } else if (31 <= edMonth <= 50) {
            month = (float) (month * 11.55 - 84);
        } else if (51 <= edMonth) {
            month = (float) (month * 12.075 - 110.25);
        }

        if (1 <= edNext <= 20) {
            month = (float) (next * 7.35);
        } else if (21 <= edNext <= 60) {
            month = (float) (next * 9.45 - 42);
        } else if (61 <= edNext <= 100) {
            month = (float) (next * 11.55 - 168);
        } else if (101 <= edNext) {
            month = (float) (next * 12.075 - 220.5);
}
        }*/

            FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
