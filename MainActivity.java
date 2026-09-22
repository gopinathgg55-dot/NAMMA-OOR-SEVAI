package com.example.nammaoorsevai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnLoomWorkers, btnMarriageHall, btnIyer, btnMarriageBrokers, 
           btnMelam, btnCooking, btnTreeClimbing, btnElectrical, 
           btnConstruction, btnMechanic, btnDriver, btnAgriculture, 
           btnPainting, btnEmergency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize Buttons
        btnLoomWorkers = findViewById(R.id.btnLoomWorkers);
        btnMarriageHall = findViewById(R.id.btnMarriageHall);
        btnIyer = findViewById(R.id.btnIyer);
        btnMarriageBrokers = findViewById(R.id.btnMarriageBrokers);
        btnMelam = findViewById(R.id.btnMelam);
        btnCooking = findViewById(R.id.btnCooking);
        btnTreeClimbing = findViewById(R.id.btnTreeClimbing);
        btnElectrical = findViewById(R.id.btnElectrical);
        btnConstruction = findViewById(R.id.btnConstruction);
        btnMechanic = findViewById(R.id.btnMechanic);
        btnDriver = findViewById(R.id.btnDriver);
        btnAgriculture = findViewById(R.id.btnAgriculture);
        btnPainting = findViewById(R.id.btnPainting);
        btnEmergency = findViewById(R.id.btnEmergency);

        // Click Listener for Service Buttons
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WorkerListActivity.class);
                startActivity(intent);
            }
        };

        // Set Click Listeners to all buttons if they are not null
        if (btnLoomWorkers != null) btnLoomWorkers.setOnClickListener(listener);
        if (btnMarriageHall != null) btnMarriageHall.setOnClickListener(listener);
        if (btnIyer != null) btnIyer.setOnClickListener(listener);
        if (btnMarriageBrokers != null) btnMarriageBrokers.setOnClickListener(listener);
        if (btnMelam != null) btnMelam.setOnClickListener(listener);
        if (btnCooking != null) btnCooking.setOnClickListener(listener);
        if (btnTreeClimbing != null) btnTreeClimbing.setOnClickListener(listener);
        if (btnElectrical != null) btnElectrical.setOnClickListener(listener);
        if (btnConstruction != null) btnConstruction.setOnClickListener(listener);
        if (btnMechanic != null) btnMechanic.setOnClickListener(listener);
        if (btnDriver != null) btnDriver.setOnClickListener(listener);
        if (btnAgriculture != null) btnAgriculture.setOnClickListener(listener);
        if (btnPainting != null) btnPainting.setOnClickListener(listener);
        if (btnEmergency != null) btnEmergency.setOnClickListener(listener);
    }
}
