package com.example.android.quakereport;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

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



        TextView loc=(TextView)listItemView.findViewById(R.id.location);
       loc.setText(currentEarthquake.getLocation());
        TextView mag=(TextView)listItemView.findViewById(R.id.magnitude);
        mag.setText(currentEarthquake.getMag());
        TextView date=(TextView)listItemView.findViewById(R.id.date);
        date.setText(currentEarthquake.getDate());




        return listItemView;


    }}
