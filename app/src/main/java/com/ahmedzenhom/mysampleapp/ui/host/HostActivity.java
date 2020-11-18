package com.ahmedzenhom.mysampleapp.ui.host;

import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

import android.content.Context;
import android.content.Intent;

import com.ahmedzenhom.mysampleapp.R;
import com.ahmedzenhom.mysampleapp.base.BaseActivity;
import com.ahmedzenhom.mysampleapp.databinding.ActivityHostBinding;

public class HostActivity extends BaseActivity<ActivityHostBinding> {

    public static Intent getActivityIntent(Context context){
        Intent intent = new Intent(context, HostActivity.class);
        return intent;
    }

    private HostViewModel viewModel;

    @Override
    protected ActivityHostBinding getViewBinding() {
        return ActivityHostBinding.inflate(getLayoutInflater());
    }

    @Override
    protected void inject() {
        daggerComponent.inject(this);
        viewModel = new ViewModelProvider(this, viewModelFactory).get(HostViewModel.class);
    }

    @Override
    protected void onViewCreated() {

    }

}