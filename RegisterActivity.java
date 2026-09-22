package com.example.nammaoorsevai;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    EditText etName, etPhone, etExperience;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Initialize UI components
        etName = findViewById(R.id.etName);
        etPhone = findViewById(R.id.etPhone);
        etExperience = findViewById(R.id.etExperience);
        btnSubmit = findViewById(R.id.btnSubmit);

        // Submit Button Click Listener
        if (btnSubmit != null) {
            btnSubmit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String name = etName.getText().toString().trim();
                    String phone = etPhone.getText().toString().trim();
                    String experience = etExperience.getText().toString().trim();

                    // Check if fields are empty
                    if (name.isEmpty() || phone.isEmpty() || experience.isEmpty()) {
                        Toast.makeText(RegisterActivity.class, "தயவுசெய்து அனைத்து விவரங்களையும் நிரப்பவும்", Toast.LENGTH_SHORT).show();
                    } else {
                        // Success Message (You can connect this to a Database or Firebase later)
                        Toast.makeText(RegisterActivity.class, "வெற்றிகரமாக பதிவு செய்யப்பட்டது!", Toast.LENGTH_LONG).show();
                        finish(); // Close activity and go back
                    }
                }
            });
        }
    }
}
