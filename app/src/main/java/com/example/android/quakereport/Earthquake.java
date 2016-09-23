package com.example.android.quakereport;

/**
 * Created by HOME on 8/21/2016.
 */
public class Earthquake {
    private String title,location,mag,date;
    private int time,tsunami;
    private float felt,latlong,depth;

    public Earthquake(String mag, String location, String date) {
        this.mag = mag;
        this.location = location;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMag() {
        return mag;
    }

    public void setMag(String mag) {
        this.mag = mag;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTsunami() {
        return tsunami;
    }

    public void setTsunami(int tsunami) {
        this.tsunami = tsunami;
    }

    public float getFelt() {
        return felt;
    }

    public void setFelt(float felt) {
        this.felt = felt;
    }

    public float getLatlong() {
        return latlong;
    }

    public void setLatlong(float latlong) {
        this.latlong = latlong;
    }

    public float getDepth() {
        return depth;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }
}
