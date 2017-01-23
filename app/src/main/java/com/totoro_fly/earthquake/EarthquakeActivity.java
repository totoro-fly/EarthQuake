package com.totoro_fly.earthquake;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.net.URL;
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class EarthquakeActivity extends AppCompatActivity {


    @Bind(R.id.list_view_activity_earthquake)
    ListView listViewActivityEarthquake;
    private static final String USGS_REQUEST_URL = "http://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&orderby=time&minmag=6&limit=10";
    EarthquakeAsyncTask earthquakeAsyncTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);
        ButterKnife.bind(this);
        earthquakeAsyncTask = new EarthquakeAsyncTask();
        earthquakeAsyncTask.execute(USGS_REQUEST_URL);
    }

    private class EarthquakeAsyncTask extends AsyncTask<String, Void, ArrayList<Earthquake>> {

        @Override
        protected ArrayList doInBackground(String... urls) {
            if (urls.length < 1 || urls[0] == null)
                return null;
            URL url = QueryUtils.createUrl(urls[0]);
            String jsonResponse = QueryUtils.makeHTTPRequst(url);
            ArrayList<Earthquake> earthquakesList = QueryUtils.extractEarthquakes(jsonResponse);
            return earthquakesList;
        }

        @Override
        protected void onPostExecute(ArrayList<Earthquake> earthquakeList) {
            if (earthquakeList == null)
                return;
            updateUI(earthquakeList);
        }
    }

    private void updateUI(ArrayList<Earthquake> earthquakeArrayList) {
        final EarthquakeAdapter earthquakeAdapter = new EarthquakeAdapter(this, earthquakeArrayList);
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
    }
}
