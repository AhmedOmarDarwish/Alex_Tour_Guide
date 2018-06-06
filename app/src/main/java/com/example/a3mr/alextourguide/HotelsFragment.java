package com.example.a3mr.alextourguide;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {
    public HotelsFragment(){}
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate( R.layout.activity_module_adapter, container, false );
        final ArrayList<Module> module = new ArrayList <Module>();

        module.add( new Module( R.drawable.img1, "Hot" ) );
        module.add( new Module( R.drawable.img1, "Hot" ) );
        module.add( new Module( R.drawable.img1, "Hot" ) );
        module.add( new Module( R.drawable.img1, "Hot" ) );
        module.add( new Module( R.drawable.img1, "Hot" ) );

        ModuleAdapter adapter = new ModuleAdapter( getActivity(), module );

        ListView listView =  rootView.findViewById( R.id.list );

        listView.setAdapter( adapter );
        return rootView;
    }
}
