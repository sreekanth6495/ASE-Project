package com.example.rust.ufo;

<<<<<<< HEAD
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class HomepageActivity extends AppCompatActivity {
   // private FirebaseAuth auth;
    private static Button LogOut;
=======
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class HomepageActivity extends AppCompatActivity {

>>>>>>> 5d99259722ed85eb1569d51feee4d1cb7fa6cf5b
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
<<<<<<< HEAD

        LogOut = (Button) findViewById(R.id.idlogout);
        LogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomepageActivity.this, LoginActivity.class));
            }
        });
       /*auth.signOut();
       LogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
   forgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, Forgotpassword.class));
            }
        });

// this listener will be called when there is change in firebase user session
                FirebaseAuth.AuthStateListener authListener = new FirebaseAuth.AuthStateListener() {
                    @Override
                    public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                        FirebaseUser user = firebaseAuth.getCurrentUser();
                        if (user == null) {
                            // user auth state is changed - user is null
                            // launch login activity
                            startActivity(new Intent(HomepageActivity.this, LoginActivity.class));
                            finish();
                        }
                    }
                };
            }
        });
    }*/}
=======
    }
>>>>>>> 5d99259722ed85eb1569d51feee4d1cb7fa6cf5b
}
