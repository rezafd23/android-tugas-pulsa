package com.example.android_tugas_pulsa.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.android_tugas_pulsa.model.Pulsa;
import com.example.android_tugas_pulsa.model.PulsaResponse;
import com.example.android_tugas_pulsa.networking.PulsaRepositories;

public class PulsaViewModel extends ViewModel {
    private MutableLiveData<PulsaResponse> mutableLiveData;
    private PulsaRepositories pulsaRepositories;

    public void init(){
        if (mutableLiveData!=null){
            return;
        }
        pulsaRepositories = PulsaRepositories.getInstance();
        mutableLiveData=pulsaRepositories.getPulsa();
    }

    public LiveData<PulsaResponse> getPulsa(){
        return mutableLiveData;
    }

    public LiveData<PulsaResponse> buyPulsa(Pulsa pulsa){
        if (mutableLiveData==null){
            pulsaRepositories =PulsaRepositories.getInstance();
        }
        mutableLiveData=pulsaRepositories.buyPulsa(pulsa);
        return mutableLiveData;
    }
}
