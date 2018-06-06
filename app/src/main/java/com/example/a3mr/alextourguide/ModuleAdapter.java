package com.example.a3mr.alextourguide;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;


public class ModuleAdapter extends ArrayAdapter<Module> {


    public ModuleAdapter(Context context, ArrayList <Module> module) {
        super( context, 0, module );
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType( position );
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from( getContext() ).inflate(
                    R.layout.activity_module, parent, false );
        }
        Module module = getItem( position );
        ImageView imageView=listItemView.findViewById( R.id.p_icon );
        imageView.setImageResource( module.getImg() );
        TextView textView =listItemView.findViewById( R.id.title );
        textView.setText( module.getTitle() );
        return listItemView;
    }
}
