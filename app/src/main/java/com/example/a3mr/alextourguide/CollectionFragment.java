package com.example.a3mr.alextourguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class CollectionFragment extends Fragment {
    public CollectionFragment() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.activity_module_adapter, container, false );
        final ArrayList <Module> module = new ArrayList <Module>();

        module.add( new Module( R.drawable.tolip_logo, getString( R.string.tolip ), R.drawable.tolip, getString( R.string.tolip_address ), getString( R.string.tolip_about ) ) );
        module.add( new Module( R.drawable.hilton_hotels_and_resorts_logo, getString( R.string.hilton ), R.drawable.hilton, getString( R.string.hilton_address ), getString( R.string.hilton_about ) ) );
        module.add( new Module( R.drawable.montaza_palace, getString( R.string.MontazaPalace ), R.drawable.montaza_palace, getString( R.string.montaza_address ), getString( R.string.montaza_about ) ) );
        module.add( new Module( R.drawable.galagolaseafood_logo, getString( R.string.galagolaseafood ), R.drawable.galagolaseafood, getString( R.string.galagola_address ), getString( R.string.galagola_about ) ) );
        module.add( new Module( R.drawable.unknown_soldier, getString( R.string.UnknownSoldier ), R.drawable.unknown_soldier, getString( R.string.unknown_soldier_address ), getString( R.string.unknown_soldier_about ) ) );
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
