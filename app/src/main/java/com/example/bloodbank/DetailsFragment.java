package com.example.bloodbank;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.ListFragment;

public class DetailsFragment extends ListFragment {
    TextView item, price;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.detailsinfo, container,
                false);
        item = (TextView) view.findViewById(R.id.item);
        price = (TextView) view.findViewById(R.id.price);
        return view;
    }
    public void change(String items, String prices) {
        item.setText(items);
        price.setText(prices);
    }
}
