package sg.edu.rp.c346.id22021136.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView modc110;
    TextView modc203;
    TextView modc206;
    TextView modc218;
    TextView modc346;
    TextView modg953;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        modc110 = findViewById(R.id.textViewC110);
        modc203 = findViewById(R.id.textViewC203);
        modc206 = findViewById(R.id.textViewC206);
        modc218 = findViewById(R.id.textViewC218);
        modc346 = findViewById(R.id.textViewC346);
        modg953 = findViewById(R.id.textViewG953);


        modc110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShowModules.class);
                intent.putExtra("ModuleCode", "C110");
                startActivity(intent);
            }
        });

        modc203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShowModules.class);
                intent.putExtra("ModuleCode", "C203");
                startActivity(intent);
            }
        });

        modc206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShowModules.class);
                intent.putExtra("ModuleCode", "C206");
                startActivity(intent);
            }
        });

        modc218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShowModules.class);
                intent.putExtra("ModuleCode", "C218");
                startActivity(intent);
            }
        });

        modc346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShowModules.class);
                intent.putExtra("ModuleCode", "C346");
                startActivity(intent);
            }
        });

        modg953.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShowModules.class);
                intent.putExtra("ModuleCode", "G953");
                startActivity(intent);
            }
        });

    }
}