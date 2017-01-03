package com.totoro_fly.earthquake;

/**
 * Created by totoro-fly on 2017/1/2.
 */

public class Earthquake {
    private String mag;
    private String place;
    private String time;

    public Earthquake(String mag, String place, String time) {
        this.mag = mag;
        this.place = place;
        this.time = time;
    }

    public String getMag() {
        return mag;
    }

    public void setMag(String mag) {
        this.mag = mag;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
