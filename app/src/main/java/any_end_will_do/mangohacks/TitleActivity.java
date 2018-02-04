package any_end_will_do.mangohacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TitleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void signUpButton(View v){
        Button button = (Button) v;

        if (v == findViewById(R.id.sign_up)){
            try{
                Intent CU = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivity(CU);
            }catch(Exception e){

            }

        }
        if (v == findViewById(R.id.login)){
            try{
                Intent CU = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(CU);
            }catch(Exception e){

            }

        }
    }
}
