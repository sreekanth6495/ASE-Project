package com.example.rust.ufo;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

<<<<<<< HEAD:Increment-2/Source/ufo/app/src/main/java/com/example/rust/ufo/documents.java
public class documents extends AppCompatActivity {
=======
//import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
>>>>>>> 5d99259722ed85eb1569d51feee4d1cb7fa6cf5b:Increment - 2/Source/ufo/app/src/main/java/com/example/rust/ufo/HomepageActivity.java

public class HomepageActivity extends AppCompatActivity {
    //private FirebaseAuth auth;
    private static Button LogOut;
    private static TextView Title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
<<<<<<< HEAD:Increment-2/Source/ufo/app/src/main/java/com/example/rust/ufo/documents.java
        setContentView(R.layout.activity_documents);
    }
}
=======
        setContentView(R.layout.activity_homepage);
        Title =(TextView)findViewById(R.id.tvTitle);

        LogOut = (Button) findViewById(R.id.idlogout);
        LogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomepageActivity.this, LoginActivity.class));
            }
        });
       /* auth.signOut();
       LogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


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
        });*/
    }}
>>>>>>> 5d99259722ed85eb1569d51feee4d1cb7fa6cf5b:Increment - 2/Source/ufo/app/src/main/java/com/example/rust/ufo/HomepageActivity.java
