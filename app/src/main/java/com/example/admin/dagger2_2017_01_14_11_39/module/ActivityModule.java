package com.example.admin.dagger2_2017_01_14_11_39.module;

import com.example.admin.dagger2_2017_01_14_11_39.view.MainActivity;

import dagger.Module;
import dagger.Provides;

/**
 * 描述说明  <br/>
 * Author : luokaixuan <br/>
 * CreateDate : 2017/1/14 11:44 <br/>
 * Modified : luokaixuan <br/>
 * ModifiedDate : 2017/1/14 11:44 <br/>
 * Email : 1005949566@qq.com <br/>
 * Version 1.0
 */
@Module
public class ActivityModule {

    @Provides
    public UserModule provideUserModule() {
        return new UserModule();
    }

    @Provides
    public MainActivity provideMainActivity() {
        return new MainActivity();
    }

}
