package com.totoro_fly.earthquake;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class EarthquakeActivity extends AppCompatActivity {


    @Bind(R.id.list_view_activity_earthquake)
    ListView listViewActivityEarthquake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthquake);
        ButterKnife.bind(this);
        final ArrayList<Earthquake> earthquakesArrayList = QueryUtils.extractEarthquakes();
        final EarthquakeAdapter earthquakeAdapter = new EarthquakeAdapter(this, earthquakesArrayList);
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
