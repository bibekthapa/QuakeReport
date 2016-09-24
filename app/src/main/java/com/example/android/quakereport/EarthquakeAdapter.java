package com.example.android.quakereport;

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
 * Created by HOME on 8/22/2016.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {
    private static final String LOCATION_SEPARATOR = " of ";


    public EarthquakeAdapter(EarthquakeActivity earthquakeActivity, ArrayList<Earthquake> earthquakes) {
        super(earthquakeActivity,0,earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView=convertView;
        String primaryLocation;
        String locationOffset;

        if(listItemView==null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item_row,parent,false);


        }

        Earthquake currentEarthquake=getItem(position);




        TextView mag=(TextView)listItemView.findViewById(R.id.magnitude);

        mag.setText(formatMagnitude(currentEarthquake.getMag()));

        String originalLocation=currentEarthquake.getLocation();
        if (originalLocation.contains(LOCATION_SEPARATOR)) {
            String[] parts = originalLocation.split(LOCATION_SEPARATOR);
            locationOffset = parts[0] + LOCATION_SEPARATOR;
            primaryLocation = parts[1];
        } else {
            locationOffset = getContext().getString(R.string.near_the);
            primaryLocation = originalLocation;
        }

        TextView primaryLocationView = (TextView) listItemView.findViewById(R.id.primary_location);
        primaryLocationView.setText(primaryLocation);

        TextView locationOffsetView = (TextView) listItemView.findViewById(R.id.location_offset);
        locationOffsetView.setText(locationOffset);


        Date dateobject=new Date(currentEarthquake.getmTimeInMilliseconds());


        TextView date=(TextView)listItemView.findViewById(R.id.date);

        date.setText(formatDate(dateobject));


        TextView time=(TextView)listItemView.findViewById(R.id.time);
        time.setText(formatTime(dateobject));




        return listItemView;


    }
    private String formatTime(Date dateobject)
    {
        SimpleDateFormat timeFormat=new SimpleDateFormat("hh:mm a");
        return timeFormat.format(dateobject);

    }

    private String formatDate(Date dateobject)
    {
        SimpleDateFormat dateFormat=new SimpleDateFormat("LLL dd,yyy");
        return dateFormat.format(dateobject);

    }
    private  String formatMagnitude(Double magnitude)
    {
        DecimalFormat magnitudeFormat = new DecimalFormat("0.0");
        return magnitudeFormat.format(magnitude);


    }


}
