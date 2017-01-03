package com.totoro_fly.earthquake;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by totoro-fly on 2017/1/2.
 */

public class EarthquakeAdapter extends ArrayAdapter {


    public EarthquakeAdapter(Context context, ArrayList<Earthquake> textViewResourceId) {
        super(context, 0, textViewResourceId);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
        if (itemView == null)
            itemView = LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item, parent, false);
        Earthquake earthquake = (Earthquake) getItem(position);
        TextView magnitudeTtextView = (TextView) itemView.findViewById(R.id.magnitude);
        magnitudeTtextView.setText(earthquake.getMag());
        TextView locationTtextView = (TextView) itemView.findViewById(R.id.primary_location);
        locationTtextView.setText(earthquake.getPlace());
        TextView timeTtextView = (TextView) itemView.findViewById(R.id.time);
        long timeInMilliseconds = Long.parseLong(earthquake.getTime());
        Date date = new Date(timeInMilliseconds);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM DD,yyyy");
        String dateToDispaly = dateFormat.format(date);
        timeTtextView.setText(dateToDispaly);
        return itemView;
    }
}
