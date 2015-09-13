package com.example.kenliao.studybuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class viewGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewgroup);
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
        //decide what to do with different button clicks
        switch(id){
            case R.id.create_group:
                Intent goCreateGroup = new Intent(this, create_group.class);
                this.startActivity(goCreateGroup);
                break;
            case R.id.view_group:
                Intent goCreateGroup1 = new Intent(this, viewGroup.class);
                this.startActivity(goCreateGroup1);
                break;
            case R.id.account_setting:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
