package com.example.sakshi.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public abstract class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bttn;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       Button bttn = findViewById(R.id.button);
                bttn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent myActivity =new Intent(MainActivity.this, secondActivity.class)
                                startActivity(myActivity)

                    }
                }


    }






    }
}
