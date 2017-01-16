package com.example.admin.dagger2_2017_01_14_11_39.component;

import com.example.admin.dagger2_2017_01_14_11_39.module.ActivityModule;
import com.example.admin.dagger2_2017_01_14_11_39.view.MainActivity;

import dagger.Component;


/**
 * 描述说明  <br/>
 * Author : luokaixuan <br/>
 * CreateDate : 2017/1/14 11:45 <br/>
 * Modified : luokaixuan <br/>
 * ModifiedDate : 2017/1/14 11:45 <br/>
 * Email : 1005949566@qq.com <br/>
 * Version 1.0
 */
@Component(modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity activity);
//    void inject(BaseActivity activity);
}
