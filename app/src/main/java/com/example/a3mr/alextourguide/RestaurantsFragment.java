package com.example.a3mr.alextourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {
    public RestaurantsFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.activity_module_adapter, container, false );
        final ArrayList <Module> module = new ArrayList <Module>();

        module.add( new Module( R.mipmap.galagolaseafood_logo, getString( R.string.galagolaseafood) ) );
        module.add( new Module( R.mipmap.kfc_logo, getString( R.string.kfc) ) );
        module.add( new Module(R.mipmap.pizza_hut_logo, getString( R.string.pizza_hut) ) );
        module.add( new Module( R.mipmap.ole_logo, getString( R.string.Ole_cafe) ) );
        module.add( new Module( R.mipmap.pablo_logo, getString( R.string.pablo_cafe_restaurant) ) );

        ModuleAdapter adapter = new ModuleAdapter( getActivity(), module );

        ListView listView =  rootView.findViewById( R.id.list );

        listView.setAdapter( adapter );
        return rootView;
    }
}





