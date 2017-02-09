package com.totoro_fly.earthquake;

import android.app.LoaderManager;
import android.content.Context;
import android.content.Intent;
import android.content.Loader;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class EarthquakeActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<Earthquake>> {


    @Bind(R.id.list_view_activity_earthquake)
    ListView listViewActivityEarthquake;
    @Bind(R.id.empty_view)
    TextView emptyView;
    EarthquakeAdapter earthquakeAdapter;
    private static final String USGS_REQUEST_URL = "http://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&orderby=time&minmag=6&limit=10";
    private static final int EARTHQUAKE_LOADER_ID = 1;
    @Bind(R.id.progress)
    ProgressBar progress;
    boolean isConnected;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);
        ButterKnife.bind(this);
        listViewActivityEarthquake.setEmptyView(emptyView);
        earthquakeAdapter = new EarthquakeAdapter(this, new ArrayList<Earthquake>());
        listViewActivityEarthquake.setAdapter(earthquakeAdapter);
        listViewActivityEarthquake.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Earthquake currentEarthquake = (Earthquake) earthquakeAdapter.getItem(i);
                Uri earthquakeUri = Uri.parse(currentEarthquake.getUrl());
                Intent websitIntent = new Intent(Intent.ACTION_VIEW, earthquakeUri);
                if (websitIntent.resolveActivity(getPackageManager()) != null)
                    startActivity(websitIntent);
            }
        });

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        isConnected = networkInfo != null && networkInfo.isConnectedOrConnecting();
        if (isConnected) {
            getLoaderManager().initLoader(EARTHQUAKE_LOADER_ID, null, this);
        } else {
            progress.setVisibility(View.GONE);
            emptyView.setText("无网络连接");
        }
    }

    @Override
    public Loader<List<Earthquake>> onCreateLoader(int i, Bundle bundle) {
        return new EarthquakeLoader(this, USGS_REQUEST_URL);
    }

    @Override
    public void onLoadFinished(Loader<List<Earthquake>> loader, List<Earthquake> earthquakes) {
        if (earthquakes == null)
            return;
        emptyView.setText("无数据");
        progress.setVisibility(View.GONE);
        earthquakeAdapter.clear();
        if (earthquakes != null && !earthquakes.isEmpty()) {
            earthquakeAdapter.addAll(earthquakes);
        }
    }

    @Override
    public void onLoaderReset(Loader<List<Earthquake>> loader) {
        earthquakeAdapter.clear();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
