package app.com.example.android.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

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


        return inflater.inflate(R.layout.fragment_main, container, false);
    }




}
