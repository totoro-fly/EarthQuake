package com.totoro_fly.earthquake;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * Created by totoro-fly on 2017/1/2.
 */

public class QueryUtils {
    private static final String TAG = "QueryUtils ";

    public QueryUtils() {

    }

    public static ArrayList<Earthquake> fetchEatrhQuakeDate(String stringUrl) {
        URL url = QueryUtils.createUrl(stringUrl);
        String jsonResponse = QueryUtils.makeHTTPRequst(url);
        ArrayList<Earthquake> earthquakesList = QueryUtils.extractEarthquakes(jsonResponse);
        return earthquakesList;
    }

    private static URL createUrl(String stringUrl) {
        URL url = null;
        try {
            url = new URL(stringUrl);
        } catch (MalformedURLException e) {
            Log.e(TAG, "createUrl ", e);
            e.printStackTrace();
        }
        return url;
    }

    private static String makeHTTPRequst(URL url) {
        if (url == null)
            return null;
        HttpURLConnection httpURLConnection = null;
        InputStream inputStream = null;
        String jsonResponse = "";
        try {
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setReadTimeout(4 * 1000);
            httpURLConnection.setConnectTimeout(6 * 1000);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                inputStream = httpURLConnection.getInputStream();
                jsonResponse = readFromInputStream(inputStream);
            }

        } catch (IOException e) {
            Log.e(TAG, "makeHTTPRequst ", e);
            e.printStackTrace();
        } finally {
            if (inputStream != null)
                try {
                    inputStream.close();
                } catch (IOException e) {
                    Log.e(TAG, "makeHTTPRequst inputStream close", e);
                    e.printStackTrace();
                }
            if (httpURLConnection != null)
                httpURLConnection.disconnect();
        }
        return jsonResponse;
    }

    private static String readFromInputStream(InputStream inputStream) {
        StringBuilder stringBuilder = new StringBuilder();
        String line = "";
        if (inputStream != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, Charset.forName("UTF-8"));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            try {
                line = bufferedReader.readLine();
                while (line != null) {
                    stringBuilder.append(line);
                    line = bufferedReader.readLine();
                }
            } catch (IOException e) {
                Log.e(TAG, "readFromInputStream ", e);
                e.printStackTrace();
            }
        }
        return stringBuilder.toString();
    }

    private static ArrayList<Earthquake> extractEarthquakes(String stringJson) {
        if (stringJson.isEmpty()) {
            return null;
        }
        ArrayList<Earthquake> earthquakes = new ArrayList<Earthquake>();
        try {
            JSONObject baseJsonResponse = new JSONObject(stringJson);
            JSONArray earthquakeArray = baseJsonResponse.getJSONArray("features");
            for (int i = 0; i < earthquakeArray.length(); i++) {
                JSONObject currentEatthquake = earthquakeArray.getJSONObject(i);
                JSONObject properties = currentEatthquake.getJSONObject("properties");
                String magnitude = properties.getString("mag");
                String location = properties.getString("place");
                String time = properties.getString("time");
                String url = properties.getString("url");
                Earthquake earthquake = new Earthquake(magnitude, location, time, url);
                earthquakes.add(earthquake);
            }
        } catch (JSONException e) {
            Log.e(TAG, "extractEarthquakes ", e);
            e.printStackTrace();
        }
        return earthquakes;
    }
}
