package com.nikki.ideal.r2_tickcrossanim;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.crosstick)
    ImageView crossTickView;
    private boolean isChecked;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        onClick();
    }

    @OnClick(R.id.rootview)
    void onClick() {
        isChecked = !isChecked;
        final int[] stateSet = {android.R.attr.state_checked * (isChecked ? 1 : -1)};
        crossTickView.setImageState(stateSet, true);

    }
}
