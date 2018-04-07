package com.example.michal.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class LibraryFragment extends Fragment {

    public LibraryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_library, container, false);
        // Populate the array with custom class objects
        final ArrayList<LibraryListItem> myLibrary = new ArrayList<>();
        myLibrary.add(new LibraryListItem(R.string.library_artists, R.drawable.ic_people_black_24dp));
        myLibrary.add(new LibraryListItem(R.string.library_albums, R.drawable.ic_album_black_24dp));
        myLibrary.add(new LibraryListItem(R.string.library_songs, R.drawable.ic_music_note_black_24dp));
        // A custom adapter to populate the ListView with the objects in the array
        final LibraryItemAdapter libraryItemAdapter = new LibraryItemAdapter(getActivity(), myLibrary);
        final ListView listView = rootView.findViewById(R.id.library_item_list);
        listView.setAdapter(libraryItemAdapter);
        // Set clickListeners on the list items
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                LibraryListItem selectedItem = myLibrary.get(position);
                // When an Item in the list is clicked start a new activity
                Intent myIntent = new Intent(getContext(), LibraryItemActivity.class);
                // Put extra information to the intent in order to receive it in the new activity
                myIntent.putExtra("selectedItem", selectedItem.getItemTextResourceId());
                startActivity(myIntent);
            }
        });
        return rootView;
    }
}
