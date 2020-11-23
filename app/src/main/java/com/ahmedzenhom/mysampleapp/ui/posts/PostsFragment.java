package com.ahmedzenhom.mysampleapp.ui.posts;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.ahmedzenhom.mysampleapp.base.BaseFragment;
import com.ahmedzenhom.mysampleapp.databinding.FragmentPostsBinding;

public class PostsFragment extends BaseFragment<FragmentPostsBinding> {
    @Override
    protected FragmentPostsBinding getViewBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentPostsBinding.inflate(inflater, container, false);
    }

    @Override
    protected void inject() {

    }

    @Override
    protected void onViewCreated() {

    }
}
