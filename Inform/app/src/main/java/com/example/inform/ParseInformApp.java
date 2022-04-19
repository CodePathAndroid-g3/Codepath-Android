package com.example.inform;

import android.app.Application;

import com.parse.Parse;

public class ParseInformApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //initialize parse
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("TFAdN8RQwugbk6phMih8NNvuEe9kUEs5gvBAsVhY")
                .clientKey("tQYZFm9vESujogEZaH5qs60HWwB7XKxkW4YQ0ZTp")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
