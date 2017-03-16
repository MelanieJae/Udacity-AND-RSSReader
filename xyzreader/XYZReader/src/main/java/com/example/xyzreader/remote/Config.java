package com.example.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

import timber.log.Timber;

public class Config {
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            url = new URL("https://dl.dropboxusercontent.com/u/231329/xyzreader_data/data.json" );
        } catch (MalformedURLException ignored) {
            Timber.e("Error: Malformed URL");
        }

        BASE_URL = url;
    }
}
