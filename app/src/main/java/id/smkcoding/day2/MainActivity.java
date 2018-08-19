package id.smkcoding.day2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ambil referensi ID dari Layout XML
        final TextView text1 = findViewById(R.id.text1);
        Button buttonMinus = findViewById(R.id.buttonMinus);
        Button buttonPlus = findViewById(R.id.buttonPlus);

        // set onClick action ke buttonMinus
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text1Text = text1.getText().toString();
                int text1number = Integer.valueOf(text1Text);
                text1number--;
//                text1number = text1number - 1;
//                text1number -= 1;
                text1.setText(String.valueOf(text1number));
            }
        });

        // set onClick action ke buttonPlus
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text1Text = text1.getText().toString();
                int text1number = Integer.valueOf(text1Text);

                int newNumber = text1number + 1;
                text1.setText(String.valueOf(newNumber));
            }
        });







        Button buttonPindah = findViewById(R.id.buttonPindah);

        buttonPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // IMPLICIT INTENT

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                // String, int, Object
//                intent.putExtra("kode paket", "Laptop");
                startActivity(intent);
                finish();




                // EXPLICIT INTENT
//                Intent explicitIntent = new Intent(Intent.ACTION_DIAL);
//                explicitIntent.setData(Uri.parse("tel:082234671637"));
//                startActivity(explicitIntent);

            }
        });


        final EditText editKata =  findViewById(R.id.editKata);
        Button buttonKirim = findViewById(R.id.buttonKirim);

        buttonKirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra("kata", editKata.getText().toString());

                editKata.setText("");

                startActivity(intent);
            }
        });
    }
}
