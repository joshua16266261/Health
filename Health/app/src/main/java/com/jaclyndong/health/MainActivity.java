package com.jaclyndong.health;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button openSettings;
    private Button readSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openSettings = (Button) findViewById(R.id.btnSettings);
        readSettings = (Button) findViewById(R.id.btnRead);

       /* openSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);
            }
        });

            //@Override
            *//*public void onClick(View v){
                Intent intent = new Intent(this, SettingsActivity.class);
                startActivity(intent);
            }*/

    }

    public void btnSettings_onClick(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void btnRead_onClick(View view) {
    }
}
