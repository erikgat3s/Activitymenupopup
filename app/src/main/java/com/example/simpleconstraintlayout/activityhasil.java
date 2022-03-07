package com.example.simpleconstraintlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activityhasil extends AppCompatActivity {
    TextView txEmail, txPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityhasil_2);

        txEmail = findViewById(R.id.tvEmail);

        txPassword = findViewById(R.id.tvPassword);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString("a");
        String pass = bundle.getString("b");

        txEmail.setText(email);
        txPassword.setText(pass);
    }
}