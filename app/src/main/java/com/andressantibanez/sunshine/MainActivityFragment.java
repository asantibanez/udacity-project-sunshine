package com.andressantibanez.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        ArrayList<String> forecast = new ArrayList<>();
        forecast.add("Today - Sunny - 88 / 63");
        forecast.add("Tomorrow - Foggy - 70 / 46");
        forecast.add("Weds - Cloudy - 72 / 63");
        forecast.add("Thurs - Rainy - 64 / 51");
        forecast.add("Fri - Foggy - 70 / 46");
        forecast.add("Sat - Sunny - 76 / 68");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                forecast
        );

        ListView listView = (ListView) view.findViewById(R.id.listview_forecast);
        listView.setAdapter(adapter);

        return view;
    }
}
