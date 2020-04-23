package sg.edu.rp.c346.demoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Get the button and set the OnClickListener
        Button btnDone = (Button) findViewById(R.id.button);
        btnDone.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                EditText etName = findViewById(R.id.editTextName);
                EditText etAge = findViewById(R.id.editTextAge);
                String[] info = {etName.getText().toString(),
                        etAge.getText().toString()};
                Intent i = new Intent(MainActivity.this,
                        Main2Activity.class);
                i.putExtra("info", info);
                startActivity(i);
            }
        });
    }
}
