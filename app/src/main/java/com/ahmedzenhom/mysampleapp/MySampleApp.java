package com.ahmedzenhom.mysampleapp;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;

import com.ahmedzenhom.mysampleapp.di.application.ApplicationComponent;
import com.ahmedzenhom.mysampleapp.di.application.ApplicationModule;
import com.ahmedzenhom.mysampleapp.di.application.DaggerApplicationComponent;
import com.ahmedzenhom.mysampleapp.utils.LocaleHelper;
import com.miguelbcr.ui.rx_paparazzo2.RxPaparazzo;
import com.yariksoffice.lingver.Lingver;

import es.dmoral.toasty.Toasty;
import timber.log.Timber;

public class MySampleApp extends Application {
    protected ApplicationComponent applicationComponent;

    private static Context context;
    private static MySampleApp app;

    public static MySampleApp get(Context context) {
        return (MySampleApp) context.getApplicationContext();
    }

    public static MySampleApp getInstance() {
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        context = app.getApplicationContext();

        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        Lingver.init(this, LocaleHelper.getLanguage(this));

        RxPaparazzo.register(this);

        Toasty.Config.getInstance()
                .allowQueue(false)
                .apply();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(LocaleHelper.onAttach(base));
    }

    public void notifyLanguageChanged() {
        context = LocaleHelper.onAttach(app);
    }

    public static Context getContext() {
        return context;
    }

    public ApplicationComponent getComponent(){
        return applicationComponent;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        context = LocaleHelper.onAttach(this);
    }
}
