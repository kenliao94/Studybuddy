package com.example.kenliao.studybuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    TextView greeting_box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the default msg
        demo first_msg = createDefaultMsg();
        greeting_box = (TextView)findViewById(R.id.fillable);
        greeting_box.setText(first_msg.get_name());
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
                return true;
            case R.id.view_group:
                return true;
            case R.id.account_setting:
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private demo createDefaultMsg(){
        //method that create the default message
        return new demo("Hi Ken");
    }
}
