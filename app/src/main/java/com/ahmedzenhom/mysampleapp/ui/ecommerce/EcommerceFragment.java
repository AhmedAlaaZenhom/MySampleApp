package com.ahmedzenhom.mysampleapp.ui.ecommerce;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.ahmedzenhom.mysampleapp.base.BaseFragment;
import com.ahmedzenhom.mysampleapp.databinding.FragmentEcommerceBinding;

public class EcommerceFragment extends BaseFragment<FragmentEcommerceBinding> {
    @Override
    protected FragmentEcommerceBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentEcommerceBinding.inflate(inflater, container, false);
    }

    @Override
    protected void inject() {

    }

    @Override
    protected void onViewCreated() {

    }
}
