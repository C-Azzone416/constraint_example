package com.ualr.constraintlayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO 03: We can manipulate the visibility of the view in a group by just modifying the visibility of the group
        Group imageGroup = findViewById(R.id.image_group);
        imageGroup.setVisibility(View.GONE);
    }
}
