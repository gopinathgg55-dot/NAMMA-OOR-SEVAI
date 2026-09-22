package com.example.nammaoorsevai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class WorkerListActivity extends AppCompatActivity {

    Button btnRegisterNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_list);

        // Initialize Register Button
        btnRegisterNow = findViewById(R.id.btnRegisterNow);

        if (btnRegisterNow != null) {
            btnRegisterNow.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Open Register Activity
                    Intent intent = new Intent(WorkerListActivity.java, RegisterActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}
