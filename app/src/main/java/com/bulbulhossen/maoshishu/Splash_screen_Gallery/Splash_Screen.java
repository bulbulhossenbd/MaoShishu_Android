package com.bulbulhossen.maoshishu.Splash_screen_Gallery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bulbulhossen.maoshishu.Main_Activity_Gallery.MainActivity;
import com.bulbulhossen.maoshishu.R;


public class Splash_Screen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_splash__screen);

        Thread loading = new Thread() {
            public void run() {
                try {
                    sleep(2000);
                    Intent main = new Intent(Splash_Screen.this, MainActivity.class);
                    startActivity(main);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    finish();
                }
            }
        };

        loading.start();
    }

}
