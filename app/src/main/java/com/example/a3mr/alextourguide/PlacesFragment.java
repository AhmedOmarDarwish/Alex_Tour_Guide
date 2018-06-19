
package com.example.a3mr.alextourguide;


import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.support.v4.app.Fragment;

import java.util.ArrayList;

public class PlacesFragment extends Fragment {
    public PlacesFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.activity_module_adapter, container, false );

        final ArrayList <Module> module = new ArrayList <Module>();
        module.add( new Module( R.mipmap.citadel_of_qaitbay, getString( R.string.CitadelofQaitbay ),R.mipmap.citadel_of_qaitbay,getString( R.string.qaitbay_address),getString( R.string.qaitbay_about) ) );
        module.add( new Module( R.mipmap.library_of_alexandria, getString( R.string.LibraryOfAlexandria ),R.mipmap.library_of_alexandria,getString( R.string.library_address),getString( R.string.library_about) ) );
        module.add( new Module( R.mipmap.montaza_palace, getString( R.string.MontazaPalace ),R.mipmap.montaza_palace,getString( R.string.montaza_address),getString( R.string.montaza_about)  ) );
        module.add( new Module( R.mipmap.pompeys_pillar, getString( R.string.PompeysPillar ),R.mipmap.pompeys_pillar,getString( R.string.pompeys_address),getString( R.string.pompeys_about) ) );
        module.add( new Module( R.mipmap.unknown_soldier, getString( R.string.UnknownSoldier ),R.mipmap.unknown_soldier,getString( R.string.unknown_soldier_address),getString( R.string.unknown_soldier_about) ) );

        ModuleAdapter adapter = new ModuleAdapter( getActivity(), module );

        final ListView listView = rootView.findViewById( R.id.list );

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
