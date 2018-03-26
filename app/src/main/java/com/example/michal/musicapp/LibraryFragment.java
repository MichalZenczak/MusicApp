package com.example.michal.musicapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

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

        final ArrayList<LibraryListItem> myLibrary = new ArrayList<>();
        myLibrary.add(new LibraryListItem(R.string.library_artists, R.drawable.ic_people_black_24dp));
        myLibrary.add(new LibraryListItem(R.string.library_albums, R.drawable.ic_album_black_24dp));
        myLibrary.add(new LibraryListItem(R.string.library_songs, R.drawable.ic_music_note_black_24dp));

        final LibraryItemAdapter libraryItemAdapter = new LibraryItemAdapter(getActivity(), myLibrary);
        final ListView listView = rootView.findViewById(R.id.library_item_list);
        listView.setAdapter(libraryItemAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast myToast = Toast.makeText(getContext(),"Item clicked!", Toast.LENGTH_SHORT);
                myToast.show();

                LibraryListItem selectedItem = myLibrary.get(position);

                Intent myIntent = new Intent(getContext(),LibraryItemActivity.class);
                myIntent.putExtra("selectedItem", selectedItem.getItemTextResourceId());
                startActivity(myIntent);


            }
        });


        return rootView;
    }
}
