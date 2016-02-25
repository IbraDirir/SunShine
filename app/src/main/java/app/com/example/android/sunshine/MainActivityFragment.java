package app.com.example.android.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> mForcastAdapter;

    public MainActivityFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String[] forecastArray = new String[]{"Today-Sunny-88/63",
                "Tomorrow-foggy-70/46",
                "weds-cloudy-72/63",
                "Thurs-Rainy-64/51",
                "Fri-foggy-70/46",
                "Sat-sunny-76/68"

        };


        List<String> weekForcast = new ArrayList<>(
        Arrays.asList(forecastArray));


      //Now that we have some dummy forcast data, create an arrrayAdapter.
      //The ArrayAddapter will take data from a source (like our dummy forcast)
      //use it to populate the listView it's attached to
       mForcastAdapter =
                new ArrayAdapter<String>(
                        //the current context(this fragment's parent activity )
                        getActivity(),
                        //ID of the list item layout
                R.layout.list_item_forecast,
                        //ID of the textView to populate
                        R.id.list_item_forecast_text_view,
                        //forcast Data
                        weekForcast );






        return inflater.inflate(R.layout.fragment_main, container, false);
    }




}
