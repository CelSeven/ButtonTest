package com.cellseven.celina.buttontest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class MyProfile extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
    }
    public void startMyActivity(View view) {
        super.onPause();
        Intent intent = new Intent(this, MyActivity.class);
        startActivity(intent);
    }
    public void startMyProfile(View view) {
        super.onPause();
        Intent intent = new Intent(this, MyProfile.class);
        startActivity(intent);
    }
    public void startMyGallery(View view) {
        super.onPause();
        Intent intent = new Intent(this, MyGallery.class);
        startActivity(intent);
    }
}
