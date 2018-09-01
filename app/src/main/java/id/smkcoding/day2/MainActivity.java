package id.smkcoding.day2;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    private EditText email, password;
    private Button login;

    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auth = FirebaseAuth.getInstance();

        email = findViewById(R.id.mainEmailAddress);
        password = findViewById(R.id.mainPassword);

        login = findViewById(R.id.mainButtonLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // TODO : get all values
                String emailText = email.getText().toString();
                String passwordText = password.getText().toString();

                Pattern VALID_EMAIL_ADDRESS_REGEX =
                        Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                                Pattern.CASE_INSENSITIVE);

                Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(emailText);

                // TODO : cek input
                if (TextUtils.isEmpty(emailText)){
                    // TODO : cek email
                    email.setError("Email tidak boleh kosong");
                    email.requestFocus();
                } else if (!matcher.find()){
                    // TODO : cek email Regexp
                    email.setError("Format email salah");
                    email.requestFocus();
                } else if (TextUtils.isEmpty(passwordText)){
                    // TODO : cek password
                    password.setError("Password tidak boleh kosong");
                    password.requestFocus();
                } else {
                    // TODO : Login

                    auth.signInWithEmailAndPassword(emailText, passwordText)
                            .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()){
                                        FirebaseUser user = auth.getCurrentUser();

                                        if (user != null){
                                            Toast.makeText(MainActivity.this, user.getUid(), Toast.LENGTH_SHORT).show();
                                        } else {
                                            Toast.makeText(MainActivity.this, "Login gagal", Toast.LENGTH_SHORT).show();
                                        }
                                    } else {
                                        Toast.makeText(MainActivity.this, "Login gagal", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                }
            }
        });

    }
}
