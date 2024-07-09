package com.example.chuyennhietdo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edtF,edtC;
    Button btntoC, btntoF, btnCL;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edtC = findViewById(R.id.edtC);
        edtF =findViewById(R.id.edtF);
        btntoC=findViewById(R.id.btntoC);
        btntoF=findViewById(R.id.brntoF);
        btnCL=findViewById(R.id.btnCL);
        btntoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int c = Integer.parseInt(edtC.getText().toString());
                double f = c*9.5+3.2;
                edtF.setText(f+"");
            }
        });
    }
}