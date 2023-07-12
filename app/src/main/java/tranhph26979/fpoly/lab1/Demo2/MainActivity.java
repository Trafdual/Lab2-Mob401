package tranhph26979.fpoly.lab1.Demo2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import tranhph26979.fpoly.lab1.R;

public class MainActivity extends AppCompatActivity {
Button demo21,demo22,demo23;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       demo21=findViewById(R.id.demo21);
        demo22=findViewById(R.id.demo22);
        demo23=findViewById(R.id.demo23);
        demo21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, tranhph26979.fpoly.lab1.Demo2.demo21.class));
            }
        });
        demo22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Demo22MainActivity.class));
            }
        });
        demo23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Demo23MainActivity.class));
            }
        });
    }
}