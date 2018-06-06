
package com.example.a3mr.alextourguide;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        module.add( new Module( R.mipmap.citadel_of_qaitbay, getString( R.string.CitadelofQaitbay) ) );
        module.add( new Module( R.mipmap.library_of_alexandria, getString( R.string.LibraryOfAlexandria) ) );
        module.add( new Module( R.mipmap.montaza_palace, getString( R.string.MontazaPalace) ) );
        module.add( new Module( R.mipmap.pompeys_pillar, getString( R.string.PompeysPillar) ) );
        module.add( new Module( R.mipmap.unknown_soldier, getString( R.string.UnknownSoldier) ) );

        ModuleAdapter adapter = new ModuleAdapter( getActivity(), module );

        ListView listView = rootView.findViewById( R.id.list );

        listView.setAdapter( adapter );

        return rootView;
    }
}
