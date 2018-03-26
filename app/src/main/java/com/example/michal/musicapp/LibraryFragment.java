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

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_library, container, false);

        final ArrayList<LibraryItem> myLibrary = new ArrayList<>();
        myLibrary.add(new LibraryItem(R.string.library_artists, R.drawable.ic_people_black_24dp));
        myLibrary.add(new LibraryItem(R.string.library_albums, R.drawable.ic_album_black_24dp));
        myLibrary.add(new LibraryItem(R.string.library_songs, R.drawable.ic_music_note_black_24dp));

        // TODO: Create layout for items in library list plus an adapter
        final LibraryItemAdapter libraryItemAdapter = new LibraryItemAdapter(getActivity(), myLibrary);

        final ListView listView = rootView.findViewById(R.id.library_item_list);
        listView.setAdapter(libraryItemAdapter);

        return rootView;
    }
}
