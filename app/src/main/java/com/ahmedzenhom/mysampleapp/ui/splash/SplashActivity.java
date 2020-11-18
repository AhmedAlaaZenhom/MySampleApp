package com.ahmedzenhom.mysampleapp.ui.splash;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.lifecycle.ViewModelProvider;

import com.ahmedzenhom.mysampleapp.R;
import com.ahmedzenhom.mysampleapp.base.BaseActivity;
import com.ahmedzenhom.mysampleapp.databinding.ActivitySplashBinding;
import com.ahmedzenhom.mysampleapp.ui.host.HostActivity;
import com.ahmedzenhom.mysampleapp.utils.StringUtils;

import es.dmoral.toasty.Toasty;

public class SplashActivity extends BaseActivity<ActivitySplashBinding> {

    private SplashViewModel viewModel;

    @Override
    protected ActivitySplashBinding getViewBinding() {
        return ActivitySplashBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void inject() {
        daggerComponent.inject(this);
        viewModel = new ViewModelProvider(this, viewModelFactory).get(SplashViewModel.class);
    }

    @Override
    protected void onViewCreated() {
        startAnimation();
        getConfigs();
    }

    private void startAnimation(){
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.splash);
        animation.setInterpolator(new AccelerateInterpolator());
        animation.setDuration(600);
        viewBinding.ivLogo.setAnimation(animation);
    }

    private void getConfigs(){
        viewModel.getConfigs().observe(this, configResponse -> {
            Toasty.success(SplashActivity.this, StringUtils.getString(R.string.toast_message)).show();
            startActivity(HostActivity.getActivityIntent(SplashActivity.this));
            finish();
        });
    }

}