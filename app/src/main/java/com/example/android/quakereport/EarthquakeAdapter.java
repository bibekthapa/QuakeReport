package com.example.android.quakereport;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by HOME on 8/22/2016.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {


    public EarthquakeAdapter(EarthquakeActivity earthquakeActivity, ArrayList<Earthquake> earthquakes) {
        super(earthquakeActivity,0,earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView=convertView;

        if(listItemView==null)
        {
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item_row,parent,false);


        }

        Earthquake currentEarthquake=getItem(position);



        TextView loc=(TextView)listItemView.findViewById(R.id.location1);
       loc.setText(currentEarthquake.getLocation());
        TextView mag=(TextView)listItemView.findViewById(R.id.magnitude);
        mag.setText(currentEarthquake.getMag());

        String location=currentEarthquake.getLocation();
        String[] loc1=location.split("of");

        TextView direction=(TextView)listItemView.findViewById(R.id.location1);
        direction.setText(loc1[0]+"of");

        TextView place=(TextView)listItemView.findViewById(R.id.location2);
        place.setText(loc1[1]);



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


}
