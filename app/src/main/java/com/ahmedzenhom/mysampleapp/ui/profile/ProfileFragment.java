package com.ahmedzenhom.mysampleapp.ui.profile;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.ahmedzenhom.mysampleapp.base.BaseFragment;
import com.ahmedzenhom.mysampleapp.databinding.FragmentProfileBinding;

public class ProfileFragment extends BaseFragment<FragmentProfileBinding> {
    @Override
    protected FragmentProfileBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentProfileBinding.inflate(inflater, container, false);
    }

    @Override
    protected void inject() {

    }

    @Override
    protected void onViewCreated() {

    }
}
