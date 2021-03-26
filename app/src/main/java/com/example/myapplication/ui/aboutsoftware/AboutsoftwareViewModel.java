package com.example.myapplication.ui.aboutsoftware;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutsoftwareViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public AboutsoftwareViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("5million in Q3, 2018. - The number of persons in the labour force (i.e. people who are able and willing to work increased from 75.94 million in Q3 2015 to 80.66 million in Q3 2016 to 85.1 million in Q3，2017 to 90.5million in Q3, 2018．");
    }

    public LiveData<String> getText() {
        return mText;
    }
}