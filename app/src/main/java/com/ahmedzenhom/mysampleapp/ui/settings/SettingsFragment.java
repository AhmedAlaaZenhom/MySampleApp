package com.ahmedzenhom.mysampleapp.ui.settings;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.ahmedzenhom.mysampleapp.base.BaseFragment;
import com.ahmedzenhom.mysampleapp.databinding.FragmentSettingsBinding;

public class SettingsFragment extends BaseFragment<FragmentSettingsBinding> {
    @Override
    protected FragmentSettingsBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentSettingsBinding.inflate(inflater, container, false);
    }

    @Override
    protected void inject() {

    }

    @Override
    protected void onViewCreated() {

    }
}
