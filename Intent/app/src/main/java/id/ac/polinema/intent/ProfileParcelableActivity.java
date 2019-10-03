package id.ac.polinema.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import id.ac.polinema.intent.model.User;

public class ProfileParcelableActivity extends AppCompatActivity {

    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    public static final String USER_KEY = "user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // TODO: display value here
            User user = getIntent().getParcelableExtra(USER_KEY);
            String username = user.getUsername();
            String name = user.getName();
            int age = user.getAge();

            usernameText.setText(username);
            nameText.setText(name);
            ageText.setText(String.valueOf(age));
        }
    }
}
