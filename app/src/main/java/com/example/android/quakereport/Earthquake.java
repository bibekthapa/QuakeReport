package com.example.android.quakereport;

/**
 * Created by HOME on 8/21/2016.
 */
public class Earthquake {
    private String title,location;
    private int time,tsunami;
    private float felt,latlong,depth;
    private String date;
    private long mTimeInMilliseconds;
    private Double mag;
    private String url;


    public Earthquake(Double mag, String location, long mTimeInMilliseconds,String url) {
        this.mag = mag;
        this.location = location;
        this.mTimeInMilliseconds=mTimeInMilliseconds;
        this.url=url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public void setmTimeInMilliseconds(long mTimeInMilliseconds) {
        this.mTimeInMilliseconds = mTimeInMilliseconds;
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

    public Double getMag() {
        return mag;
    }

    public void setMag(Double mag) {
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
