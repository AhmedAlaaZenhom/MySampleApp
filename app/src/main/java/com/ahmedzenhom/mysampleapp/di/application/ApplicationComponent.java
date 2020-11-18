package com.ahmedzenhom.mysampleapp.di.application;

import android.app.Application;
import android.content.Context;

import com.ahmedzenhom.mysampleapp.MySampleApp;
import com.ahmedzenhom.mysampleapp.pref.SettingPref;
import com.ahmedzenhom.mysampleapp.pref.UserPref;
import com.ahmedzenhom.mysampleapp.network.NetworkManager;
import com.ahmedzenhom.mysampleapp.network.SocketManager;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component( modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(MySampleApp app);

    Application getApplication();

    @ApplicationContext
    Context getContext();

    NetworkManager getNetworkManager();

    SettingPref getSettingPref();

    UserPref getUserPref();

    SocketManager getSocketManager();

}
