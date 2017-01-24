package com.totoro_fly.earthquake;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by totoro-fly on 2017/1/24.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    private static final String TAG = EarthquakeLoader.class.getSimpleName();
    private String mUrl;

    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        if (mUrl == null)
            return null;
        List<Earthquake> earthquakeArrayList = QueryUtils.fetchEatrhQuakeDate(mUrl);
        return earthquakeArrayList;
    }
}
