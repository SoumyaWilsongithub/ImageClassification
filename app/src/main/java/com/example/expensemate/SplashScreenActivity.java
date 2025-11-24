package com.example.expensemate;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper; // Import Looper
import android.widget.ImageView; // Import ImageView (This was missing)
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {

    TextView text;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        text = findViewById(R.id.splash_text);
        image = findViewById(R.id.splash_logo);

        // Use Looper.getMainLooper() to avoid deprecation warnings on newer Android versions
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
            finish(); // close splash
        }, 4000);
    }
}
