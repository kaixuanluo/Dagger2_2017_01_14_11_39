package com.example.admin.dagger2_2017_01_14_11_39.view;

import android.os.Bundle;
import android.util.Log;

import com.example.admin.dagger2_2017_01_14_11_39.R;
import com.example.admin.dagger2_2017_01_14_11_39.component.ActivityComponent;
import com.example.admin.dagger2_2017_01_14_11_39.component.DaggerActivityComponent;
import com.example.admin.dagger2_2017_01_14_11_39.module.UserModule;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Inject
    UserModule mUserModule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent activityComponent = DaggerActivityComponent
                .builder()
//                .activityModule(new ActivityModule())
                .build();

        activityComponent.inject(this);

        Log.e(" userModule "," userModule " + mUserModule);

    }
}
