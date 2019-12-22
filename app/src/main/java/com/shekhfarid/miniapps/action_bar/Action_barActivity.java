package com.shekhfarid.miniapps.action_bar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.shekhfarid.miniapps.R;

import com.shekhfarid.miniapps.home.HomeActivity;

public class Action_barActivity extends AppCompatActivity {

private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar);
        btn=findViewById(R.id.edit_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Action_barActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }

        });
    }
}

