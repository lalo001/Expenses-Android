package android.lalo.com.expenses;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Intent it = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(it);
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        finish();
    }
}
