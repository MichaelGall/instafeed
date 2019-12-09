package nc.prog1415.instafeed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final Button loginButton = (Button) this.findViewById(R.id.loginButton);
        final EditText textEmail = (EditText) this.findViewById(R.id.textEmail);
        final EditText textPassword = (EditText) this.findViewById(R.id.textPassword);
        final EditText textPasswordConfirm = (EditText) this.findViewById(R.id.textPasswordConfirm);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //obtain user's input
                String email = textEmail.getText().toString();
                String password = textPassword.getText().toString();
                String confirmPassword = textPasswordConfirm.getText().toString();

                Intent intent = new Intent();
                //set the intents data to the user's input
                //intent.setData(Uri.parse(info));
                //set the result and finish this activity, go to main
                LoginActivity.this.setResult(1, intent);
                startMainActivity();
                LoginActivity.this.finish();
            }
        });

    }
    private void startMainActivity(){
        Intent mainIntent = new Intent(this, MainActivity.class);
        startActivity(mainIntent);
        finish();
    }

}
