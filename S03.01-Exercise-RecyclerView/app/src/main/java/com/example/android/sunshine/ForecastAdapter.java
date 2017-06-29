package com.example.android.sunshine;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Amar on 6/28/2017.
 */
/*
// Within ForecastAdapter.java /////////////////////////////////////////////////////////////////
// TODO Done (15) Add a class file called ForecastAdapter
// TODO Done (16) Create a class within ForecastAdapter called ForecastAdapterViewHolder
// TODO Done (17) Extend RecyclerView.ViewHolder
//TODO Done (18) Create a public final TextView variable called mWeatherTextView

    // TODO Done  (19) Create a constructor for this class that accepts a View as a parameter
    // TODO Done (20) Call super(view) within the constructor for ForecastAdapterViewHolder
    // TODO Done (21) Using view.findViewById, get a reference to this layout's TextView and save it to mWeatherTextView
 // TODO Done(22) Extend RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>

    // TODO Done (23) Create a private string array called mWeatherData
     // TODO Done (24) Override onCreateViewHolder
    // TODO Done (25) Within onCreateViewHolder, inflate the list item xml into a view
    // TODO Done (26) Within onCreateViewHolder, return a new ForecastAdapterViewHolder with the above view passed in as a parameter

    // TODO Done (27) Override onBindViewHolder
    // TODO Done (28) Set the text of the TextView to the weather for this list item's position

    // TODO Done (29) Override getItemCount
    // TODO Done (30) Return 0 if mWeatherData is null, or the size of mWeatherData if it is not null

    // TODO Done (31) Create a setWeatherData method that saves the weatherData to mWeatherData
    // TODO Done (32) After you save mWeatherData, call notifyDataSetChanged
// TODO Done (47) Create the default constructor (we will pass in parameters in a later lesson)


*/

public class ForecastAdapter extends RecyclerView.Adapter<ForecastAdapter.ForecastAdapterViewHolder>
        {
private String[] mWeatherData;

            public ForecastAdapter()
            {

            }

            class ForecastAdapterViewHolder extends RecyclerView.ViewHolder
            {
                public final TextView mWeatherTextView;

                public ForecastAdapterViewHolder(View view)
                {
                    super(view);
                    mWeatherTextView =(TextView) view.findViewById(R.id.tv_weather_data);
                }



            }
            @Override
            public ForecastAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType)
            {
                Context context = viewGroup.getContext();
                int layoutIdForListItem = R.layout.forecast_list_item;
                LayoutInflater inflater = LayoutInflater.from(context);
                boolean shouldAttachToParentImmediately = false;

                View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
                return new ForecastAdapterViewHolder(view);
            }


            @Override
            public void onBindViewHolder(ForecastAdapterViewHolder forecastAdapterViewHolder, int position)
            {
                String weatherForThisDay = mWeatherData[position];
                forecastAdapterViewHolder.mWeatherTextView.setText(weatherForThisDay);
            }

            @Override
            public int getItemCount()
            {
                if (null == mWeatherData) return 0;
                return mWeatherData.length;

            }
            public void setWeatherData(String[] weatherData) {
                mWeatherData = weatherData;
                notifyDataSetChanged();
            }
        }
