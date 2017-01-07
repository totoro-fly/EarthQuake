package com.totoro_fly.earthquake;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by totoro-fly on 2017/1/2.
 */

public class EarthquakeAdapter extends ArrayAdapter {
    private static final String LOCATION_SEPARATOR = "of";
    String primaryLocation;
    String locationOffset;

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
        GradientDrawable magnitudeCircle = (GradientDrawable) magnitudeTtextView.getBackground();
        double magnitude = Double.parseDouble(earthquake.getMag());
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        String mag = decimalFormat.format(magnitude);
        int magnitudeColor = getMannitudeColor(magnitude);
        magnitudeCircle.setColor(magnitudeColor);
        magnitudeTtextView.setText(mag);

        TextView locationOffsetView = (TextView) itemView.findViewById(R.id.location_offset);
        TextView primaryLocationTtextView = (TextView) itemView.findViewById(R.id.primary_location);
        String originalLocation = earthquake.getPlace();
        if (originalLocation.contains(LOCATION_SEPARATOR)) {
            String[] parts = originalLocation.split(LOCATION_SEPARATOR);
            locationOffset = parts[0] + LOCATION_SEPARATOR;
            primaryLocation = parts[1];
        } else {
            locationOffset = getContext().getString(R.string.near_the);
            primaryLocation = originalLocation;
        }
        locationOffsetView.setText(locationOffset);
        primaryLocationTtextView.setText(primaryLocation);

        TextView dateTtextView = (TextView) itemView.findViewById(R.id.date);
        TextView timeTtextView = (TextView) itemView.findViewById(R.id.time);
        long timeInMilliseconds = Long.parseLong(earthquake.getTime());
        Date date = new Date(timeInMilliseconds);
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM DD,yyyy");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        String dateToDispaly = dateFormat.format(date);
        String timeToDispaly = timeFormat.format(date);
        dateTtextView.setText(dateToDispaly);
        timeTtextView.setText(timeToDispaly);

        return itemView;
    }

    private int getMannitudeColor(double magnitude) {
        int magnitudeColorResourceId;
        int magnitudeFloor = (int) Math.floor(magnitude);
        switch (magnitudeFloor) {
            case 0:
            case 1:
                magnitudeColorResourceId = R.color.magnitude1;
                break;
            case 2:
                magnitudeColorResourceId = R.color.magnitude2;
                break;
            case 3:
                magnitudeColorResourceId = R.color.magnitude3;
                break;
            case 4:
                magnitudeColorResourceId = R.color.magnitude4;
                break;
            case 5:
                magnitudeColorResourceId = R.color.magnitude5;
                break;
            case 6:
                magnitudeColorResourceId = R.color.magnitude6;
                break;
            case 7:
                magnitudeColorResourceId = R.color.magnitude7;
                break;
            case 8:
                magnitudeColorResourceId = R.color.magnitude8;
                break;
            case 9:
                magnitudeColorResourceId = R.color.magnitude9;
                break;
            default:
                magnitudeColorResourceId = R.color.magnitude10;
                break;
        }
        return ContextCompat.getColor(getContext(), magnitudeColorResourceId);

    }
}
