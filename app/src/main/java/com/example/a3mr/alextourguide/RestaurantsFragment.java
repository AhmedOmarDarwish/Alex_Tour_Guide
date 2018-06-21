package com.example.a3mr.alextourguide;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {
    public RestaurantsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.activity_module_adapter, container, false );
        final ArrayList <Module> module = new ArrayList <Module>();

        module.add( new Module( R.drawable.galagolaseafood_logo, getString( R.string.galagolaseafood ), R.drawable.galagolaseafood, getString( R.string.galagola_address ), getString( R.string.galagola_about ) ) );
        module.add( new Module( R.drawable.kfc_logo, getString( R.string.kfc ), R.drawable.kfc, getString( R.string.kfc_address ), getString( R.string.kfc_about ) ) );
        module.add( new Module( R.drawable.pizza_hut_logo, getString( R.string.pizza_hut ), R.drawable.pizza_hut, getString( R.string.pizza_hut_address ), getString( R.string.pizza_hut_about ) ) );
        module.add( new Module( R.drawable.ole_logo, getString( R.string.Ole_cafe ), R.drawable.ole_cafe, getString( R.string.ole_cafe_address ), getString( R.string.ole_cafe_about ) ) );
        module.add( new Module( R.drawable.pablo_logo, getString( R.string.pablo_cafe_restaurant ), R.drawable.pablo_cafe_restaurant, getString( R.string.pablo_cafe_address ), getString( R.string.pablo_cafe_about ) ) );

        ModuleAdapter adapter = new ModuleAdapter( getActivity(), module );

        ListView listView = rootView.findViewById( R.id.list );

        listView.setAdapter( adapter );
        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                Module module1 = module.get( position );
                Intent intent = new Intent( getActivity(), Details.class );
                intent.putExtra( "key", module1 );
                startActivity( intent );

            }
        } );

        return rootView;
    }
}





