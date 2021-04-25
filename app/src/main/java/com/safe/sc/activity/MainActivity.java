package com.safe.sc.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

import com.safe.sc.R;
import com.safe.sc.base.BaseActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {
    @BindView(R.id.take_photo_rl)
    RelativeLayout mTakePhotoRl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.take_photo_rl})
    public void onViewClick(View view) {
        switch (view.getId()) {
            case R.id.take_photo_rl:
                break;
        }
    }
}