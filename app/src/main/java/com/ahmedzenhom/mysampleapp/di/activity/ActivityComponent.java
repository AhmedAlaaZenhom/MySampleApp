package com.ahmedzenhom.mysampleapp.di.activity;

import com.ahmedzenhom.mysampleapp.base.BaseActivity;
import com.ahmedzenhom.mysampleapp.di.application.ApplicationComponent;
import com.ahmedzenhom.mysampleapp.di.baseview.BaseViewModule;
import com.ahmedzenhom.mysampleapp.di.viewmodel.ViewModelModule;
import com.ahmedzenhom.mysampleapp.ui.host.HostActivity;
import com.ahmedzenhom.mysampleapp.ui.splash.SplashActivity;

import dagger.Component;

@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = {ViewModelModule.class, BaseViewModule.class,})
public interface ActivityComponent {
    void inject(SplashActivity activity);
    void inject(HostActivity activity);
}
