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

public class HotelsFragment extends Fragment {
    public HotelsFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.activity_module_adapter, container, false );
        final ArrayList<Module> module = new ArrayList <Module>();

        module.add( new Module( R.mipmap.tolip_logo, getString( R.string.tolip),R.mipmap.tolip,getString( R.string.tolip_address),getString( R.string.tolip_about) ) );
        module.add( new Module( R.mipmap.hilton_logo, getString( R.string.hilton),R.mipmap.hilton,getString( R.string.hilton_address),getString( R.string.hilton_about) ) );
        module.add( new Module( R.mipmap.four_seasons_logo, getString( R.string.four_seasons),R.mipmap.fourseasons,getString( R.string.fourseasons_address),getString( R.string.fourseasons_about) ) );
       module.add( new Module( R.mipmap.helnan_logo, getString( R.string.helnan),R.mipmap.helnan,getString( R.string.helnan_address),getString( R.string.helnan_about) ) );
        module.add( new Module( R.mipmap.romance_logo, getString( R.string.romance),R.mipmap.romance,getString( R.string.romance_address),getString( R.string.romance_about) ) );

        ModuleAdapter adapter = new ModuleAdapter( getActivity(), module );

        ListView listView =  rootView.findViewById( R.id.list );

        listView.setAdapter( adapter );
        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView <?> parent, View view, int position, long id) {
                Module module1 = module.get( position );
                Intent intent = new Intent( getActivity(), Details.class );
                intent.putExtra( "key",  module1 );
                startActivity( intent );

            }
        } );

        return rootView;
    }

}
