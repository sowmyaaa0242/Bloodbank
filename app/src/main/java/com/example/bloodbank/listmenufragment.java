package com.example.bloodbank;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.fragment.app.ListFragment;

public class listmenufragment extends ListFragment {
    String[] items = new String[] { "Sowmya","Asha","Teju","Pavan","Yashwanth" };
    String[] prices = new String[]{"Rs 10","Rs 15","Rs 20","Rs 30","Rs 10"};
       @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.lisstitemsinfo, container,
                false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, items);
        setListAdapter(adapter);
        return view;
    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        DetailsFragment txt = (DetailsFragment)getFragmentManager().findFragmentById(R.id.fragment3);
        txt.change("Item: "+ items[position],"Price: "+
                prices[position]);
        getListView().setSelector(android.R.color.holo_orange_dark);
    }
}


