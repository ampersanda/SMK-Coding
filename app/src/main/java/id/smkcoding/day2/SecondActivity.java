package id.smkcoding.day2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private EditText secondEdit;
    private Button secondButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        secondEdit = findViewById(R.id.secondEdit);
        secondButton = findViewById(R.id.secondButton);

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("kata", secondEdit.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });

    }
}
