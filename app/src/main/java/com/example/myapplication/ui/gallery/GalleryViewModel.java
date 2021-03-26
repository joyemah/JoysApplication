package com.example.myapplication.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("EMAH JOY USEN\n"+
                "MATRIC NO: 17CJ022490\n" +
                "CEN 414\n");
    }

    public LiveData<String> getText() {
        return mText;
    }
}