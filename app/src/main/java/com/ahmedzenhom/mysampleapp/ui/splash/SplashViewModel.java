package com.ahmedzenhom.mysampleapp.ui.splash;

import androidx.lifecycle.LiveData;

import com.ahmedzenhom.mysampleapp.base.BaseViewModel;
import com.ahmedzenhom.mysampleapp.model.ErrorModel;
import com.ahmedzenhom.mysampleapp.model.response.ConfigResponse;
import com.ahmedzenhom.mysampleapp.repo.ConfigRepo;

import javax.inject.Inject;

public class SplashViewModel extends BaseViewModel {

    @Inject
    ConfigRepo configRepo;

    @Inject
    public SplashViewModel() {
    }

    @Override
    protected LiveData<ErrorModel> getErrorLiveData() {
        addErrorObservers(configRepo);
        return super.getErrorLiveData();
    }

    LiveData<ConfigResponse> getConfigs(){
        return configRepo.getConfigs();
    }

    @Override
    protected void onCleared() {
        configRepo.dispose();
        super.onCleared();
    }
}
