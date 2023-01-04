package com.example.numbereight;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button loginButton = (Button) findViewById(R.id.submit_button);
        loginButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
//                dummyLogin();
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);
            }
        });
    }
//    public void dummyLogin("email", "password") {
//
//        String email = null;
//        String password = null;
//
//        // flag to keep track of whether the login was successful
//        boolean loginSuccessful = false;
//
//        // loop through the users array
//        for (int i = 0; i < users.length; i++) {
//            // check if the email and password match those of the current user
//            if (email.equals(users[i].getEmail()) && password.equals(users[i].getPassword())) {
//                // if they match, set the flag to true and break out of the loop
//                loginSuccessful = true;
//                break;
//            }
//        }
//        if (email.equals("email") && password.equals("password")) {
//            Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show();
//        } else {
//            Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    public class User {
//        private String firstName;
//        private String lastName;
//        private String email;
//        private String password;
//
//        public User(String firstName, String lastName, String email, String password) {
//            this.firstName = firstName;
//            this.lastName = lastName;
//            this.email = email;
//            this.password = password;
//            User[] users = new User[7];
//
//
//
//            // Create some dummy user objects
//            User user1 = new User("mathieu", "houde", "mathieu.houde@codeboxx.biz", "password");
//            User user2 = new User("patrick", "thibault", "patrick.thibault@codeboxx.biz", "password");
//            User user3 = new User("francis", "patry-jessop", "francis.patry-jessop@codeboxx.biz", "password");
//            User user4 = new User("david", "amyot", "david.amyot@codeboxx.biz", "password");
//            User user5 = new User("marie-eve", "goupil", "marie-eve.goupil@codeboxx.biz", "password");
//            User user6 = new User("francois", "boivin", "francois.boivin@codeboxx.biz", "password");
//            User user7 = new User("timothy", "wever", "timothy.wever@codeboxx.biz", "password");
//
//// Add the dummy users to the array
//            users[0] = user1;
//            users[1] = user2;
//            users[2] = user3;
//            users[3] = user4;
//            users[4] = user5;
//            users[5] = user6;
//            users[6] = user7;
//
//            public String getEmail() {
//                return email;
//            }
//
//            public String getPassword() {
//                return password;
//            }
//        }
//    }


}