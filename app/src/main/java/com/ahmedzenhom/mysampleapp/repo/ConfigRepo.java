package com.ahmedzenhom.mysampleapp.repo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.ahmedzenhom.mysampleapp.base.BaseRepo;
import com.ahmedzenhom.mysampleapp.model.response.ConfigResponse;

import java.util.concurrent.TimeUnit;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class ConfigRepo extends BaseRepo {

    @Inject
    public ConfigRepo() {
    }

    public LiveData<ConfigResponse> getConfigs(){
        MutableLiveData<ConfigResponse> liveData = new MutableLiveData<>();
        Observable<ConfigResponse> observable= Observable.create(emitter -> {
            emitter.onNext(new ConfigResponse());
            emitter.onComplete();
        });
        disposable.add(observable
                .subscribeOn(Schedulers.io())
                .delay(1000, TimeUnit.MILLISECONDS)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(liveData::setValue, this::handleError));
        return liveData;
    }


}
