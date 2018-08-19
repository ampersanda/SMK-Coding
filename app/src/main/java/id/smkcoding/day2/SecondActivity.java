package id.smkcoding.day2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView secondText = findViewById(R.id.secondText);

        String text = getIntent().getStringExtra("kata");

        secondText.setText(text);
    }
}
