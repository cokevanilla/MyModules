package sg.edu.rp.c346.id22021136.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowModules extends AppCompatActivity {
    TextView ModCode;
    TextView ModDetails;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_modules);
        ModDetails = findViewById(R.id.moduleDetails);
        btnBack = findViewById(R.id.buttonBck);

        Intent received = getIntent();
        String ModCode = received.getStringExtra("ModuleCode");

        if(ModCode.equals("C110")) {
            ModDetails.setText(String.format("Module Code: C110\nModule Name: Programming Fundamentals I\nAcademic Year: 2023\nSemester: 1\nModule Credit: 4\nVenue: W55L"));
        } else if (ModCode.equals("C203")) {
            ModDetails.setText(String.format("Module Code: C203\nModule Name: Web Appln Development in php\nAcademic Year: 2023\nSemester: 1\nModule Credit: 4\nVenue: W64M"));
        } else if (ModCode.equals("C206")) {
            ModDetails.setText(String.format("Module Code: C206\nModule Name: Software Development Process\nAcademic Year: 2023\nSemester: 1\nModule Credit: 4\nVenue: W64M"));
        } else if (ModCode.equals("C218")) {
            ModDetails.setText(String.format("Module Code: C218\nModule Name: UI/UX Design for Apps\nAcademic Year: 2023\nSemester: 1\nModule Credit: 4\nVenue: W64M"));
        } else if (ModCode.equals("C346")) {
            ModDetails.setText(String.format("Module Code: C346\nModule Name: Mobile App Development\nAcademic Year: 2023\nSemester: 1\nModule Credit: 4\nVenue: E63A"));
        } else if (ModCode.equals("G953")) {
            ModDetails.setText(String.format("Module Code: G953\nModule Name: Life Skills III\nAcademic Year: 2023\nSemester: 1\nModule Credit: 1\nVenue: HBL"));
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }


}