package any_end_will_do.mangohacks;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUpActivity extends AppCompatActivity {

    private FirebaseAuth fireAuth;

    private TextView email;
    private TextView password;
    private TextView name;
    private TextView industry;
    private TextView company;
    private TextView phone;

    private ProgressDialog progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        progress = new ProgressDialog(this);

        fireAuth = FirebaseAuth.getInstance();

        email = findViewById(R.id.email_edit_textview);
        password = findViewById(R.id.password_edit_textview);
        name = findViewById(R.id.name_edit_textview);
        industry = findViewById(R.id.industry_edit_textview);
        company = findViewById(R.id.company_edit_textview);
        phone = findViewById(R.id.phone_edit_textview);



        Button button = (Button) findViewById(R.id.signup_button);

        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                register();
            }
        });



    }



    public void register(){
       String e  = email.getText().toString().trim();
       String p = password.getText().toString().trim();
       String n = name.getText().toString();
       String in = industry.getText().toString();
       String co = company.getText().toString();
       String pho = phone.getText().toString();

       if(TextUtils.isEmpty(e)){
           Toast.makeText(this, "Please enter email", Toast.LENGTH_SHORT).show();
           return;
       }

       if(TextUtils.isEmpty(p)){
           Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show();
           return;
       }

        progress.setMessage("Registering User...");
        progress.show();

        fireAuth.createUserWithEmailAndPassword(e, p)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Toast.makeText(SignUpActivity.this, "Registration success", Toast.LENGTH_SHORT).show();
                            progress.hide();


                        } else {
                            // If sign in fails, display a message to the user.
                            Toast.makeText(SignUpActivity.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                        }

                        // ...
                    }
                });


    }


}
