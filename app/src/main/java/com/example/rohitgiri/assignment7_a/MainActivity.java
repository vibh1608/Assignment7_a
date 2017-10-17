package com.example.rohitgiri.assignment7_a;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText medittext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void searchActivity(View v)
    {
        Intent searchintent = new Intent();
        searchintent.setAction(Intent.ACTION_WEB_SEARCH);
        medittext=(EditText) findViewById(R.id.edit);
        String str = medittext.getText().toString();
        searchintent.putExtra(SearchManager.QUERY,str);
        startActivity(searchintent);
    }
}
