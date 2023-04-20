package com.helloreactnative;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CocosGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cocos_game);
        initButtonEventListener();
        initGameName();
    }

    private void initButtonEventListener() {
        Button button = (Button) findViewById(R.id.btnHome);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }

    private void initGameName() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String gameId = extras.getString("gameId");
            TextView txtGameName = (TextView) findViewById(R.id.txtGameName);
            if (txtGameName != null) {
                txtGameName.setText(gameId);
            }
        }
    }
}