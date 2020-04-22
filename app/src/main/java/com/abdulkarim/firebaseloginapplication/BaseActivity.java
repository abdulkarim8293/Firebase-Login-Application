package com.abdulkarim.firebaseloginapplication;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class BaseActivity extends AppCompatActivity {

    public static FirebaseAuth getFireBaseAuth(){
        return FirebaseAuth.getInstance();
    }

    public DatabaseReference getRootDatabaseReference(){
        return FirebaseDatabase.getInstance().getReference();
    }
}
