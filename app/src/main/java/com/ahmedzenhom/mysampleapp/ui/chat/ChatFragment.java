package com.ahmedzenhom.mysampleapp.ui.chat;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.ahmedzenhom.mysampleapp.base.BaseFragment;
import com.ahmedzenhom.mysampleapp.databinding.FragmentChatBinding;

public class ChatFragment extends BaseFragment<FragmentChatBinding> {
    @Override
    protected FragmentChatBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentChatBinding.inflate(inflater, container, false);
    }

    @Override
    protected void inject() {

    }

    @Override
    protected void onViewCreated() {

    }
}
