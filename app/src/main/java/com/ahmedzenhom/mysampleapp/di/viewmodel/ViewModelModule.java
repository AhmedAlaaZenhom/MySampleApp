package com.ahmedzenhom.mysampleapp.di.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.ahmedzenhom.mysampleapp.ui.host.HostViewModel;
import com.ahmedzenhom.mysampleapp.ui.splash.SplashViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

// *** IMPORTANT ***
// The module must have at least one @IntoMap ViewModel
// Otherwise the HashMap Won't be created
// And you'll get a dagger compiling error
@Module
abstract public class ViewModelModule {

    @Binds
    abstract ViewModelProvider.Factory bindsViewModelFactory(DaggerViewModelFactory factory);

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel.class)
    abstract ViewModel provideSplashViewModel(SplashViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(HostViewModel.class)
    abstract ViewModel provideHostViewModel(HostViewModel viewModel);

}
