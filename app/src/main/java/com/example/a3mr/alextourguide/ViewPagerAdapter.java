package com.example.a3mr.alextourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ViewPagerAdapter extends PagerAdapter {
    private Context context;
    private LayoutInflater layoutInflater;
    private Integer[] images = {R.drawable.citadel_of_qaitbay, R.drawable.montaza_palace, R.drawable.stanley_bridge, R.drawable.galagolaseafood_logo, R.drawable.kfc_logo, R.drawable.pizza_hut_logo, R.drawable.tolip, R.drawable.hilton, R.drawable.fourseasons};

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService( context.LAYOUT_INFLATER_SERVICE );
        View view = layoutInflater.inflate( R.layout.alex_imag, null );
        ImageView img =  view.findViewById( R.id.images );
        img.setScaleType( ImageView.ScaleType.CENTER_CROP );
        img.setImageResource( images[position] );
        ViewPager vp = (ViewPager) container;
        vp.addView( view, null );
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView( view );
    }
}
