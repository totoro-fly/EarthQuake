package com.totoro_fly.earthquake;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

import static com.totoro_fly.earthquake.QueryUtils.extractEarthquakes;

public class EarthquakeActivity extends AppCompatActivity {


    @Bind(R.id.list_view_activity_earthquake)
    ListView listViewActivityEarthquake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);
        ButterKnife.bind(this);
        ArrayList<Earthquake> earthquakesArrayList = QueryUtils.extractEarthquakes();
        EarthquakeAdapter earthquakeAdapter = new EarthquakeAdapter(this, earthquakesArrayList);
        listViewActivityEarthquake.setAdapter(earthquakeAdapter);
    }
}
