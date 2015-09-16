package com.example.realnapster.myfragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A placeholder fragment containing a simple view.
 */
public class FragmentListFragment extends Fragment {

    public FragmentListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_fragment_list, container, false);
        ArrayAdapter adapter= ArrayAdapter.createFromResource(getActivity(), R.array.Clubs, android.R.layout.simple_list_item_1);
        final ListView listView=(ListView)v.findViewById(R.id.lst);
        listView.setAdapter(adapter);
        return v;
    }
}
