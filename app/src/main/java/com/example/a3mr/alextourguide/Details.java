package com.example.a3mr.alextourguide;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    ImageView placeimg;
    public Toolbar mToolbar;
    TextView about;
    TextView address;
    LinearLayout loc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_details );
        placeimg = findViewById( R.id.place_image );
        mToolbar = findViewById( R.id.toolbar );
        address = findViewById( R.id.location_address );
        about = findViewById( R.id.description );
        loc = findViewById( R.id.location );


        Intent intent = getIntent();
        Module module = intent.getParcelableExtra( "key" );
        mToolbar.setTitle( module.getTitle() );
        placeimg.setImageResource( module.getPlace_image() );
        address.setText( module.getAddress() );
        about.setText( module.getAbout() );

        final String locationMap = "geo:0,0?q=" + module.getAddress();

        loc.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Creates an Intent that will load a map of the selected place
                Uri uri1 = Uri.parse( locationMap );
                Intent mapIntent = new Intent( Intent.ACTION_VIEW, uri1 );
                mapIntent.setPackage( "com.google.android.apps.maps" );
                startActivity( mapIntent );
            }
        } );


    }

}

