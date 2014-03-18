package com.pasanlive.another.app.louncher;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button launchDefaultButton = (Button) findViewById(R.id.launchDefault);
        launchDefaultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getPackageManager().getLaunchIntentForPackage("com.pasanlive.parent.app");
                startActivity(intent);
            }
        });

        Button launchButton = (Button) findViewById(R.id.launch);
        launchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.setComponent(new ComponentName("com.pasanlive.parent.app", "com.pasanlive.parent.app.SecondaryActivity"));
                intent.putExtra("name", "Pasan");
                startActivity(intent);
            }
        });


    }
}
