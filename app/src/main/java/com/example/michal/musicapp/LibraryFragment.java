package com.example.michal.musicapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class LibraryFragment extends Fragment {


    public LibraryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_library, container, false);

        final ArrayList<String> artists = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            artists.add("Artist " + i);
        }
        final ArrayAdapter adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, artists);
        final ListView listView = rootView.findViewById(R.id.library_item_list);
        listView.setAdapter(adapter);


        // Inflate the layout for this fragment
        return rootView;
    }

}
