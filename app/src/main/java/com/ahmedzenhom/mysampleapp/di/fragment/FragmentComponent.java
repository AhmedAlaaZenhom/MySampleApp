package com.ahmedzenhom.mysampleapp.di.fragment;

import com.ahmedzenhom.mysampleapp.base.BaseFragment;
import com.ahmedzenhom.mysampleapp.di.application.ApplicationComponent;
import com.ahmedzenhom.mysampleapp.di.baseview.BaseViewModule;
import com.ahmedzenhom.mysampleapp.di.viewmodel.ViewModelModule;

import dagger.Component;

@FragmentScope
@Component(dependencies = ApplicationComponent.class, modules = {ViewModelModule.class, BaseViewModule.class,})
public interface FragmentComponent {
}
