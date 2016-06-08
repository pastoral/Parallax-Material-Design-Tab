package com.example.munirulhoque.mattab;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import com.example.munirulhoque.mattab.adapter.SectionAdapter;
import com.example.munirulhoque.mattab.ui.OneFragment;
import com.example.munirulhoque.mattab.ui.ThreeFragment;
import com.example.munirulhoque.mattab.ui.TwoFragment;

public class MainActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(toolbar);
       // getSupportActionBar().setTitle("Parallax Tabs");
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.main_collapsing);
        collapsingToolbarLayout.setTitleEnabled(false);


       /* ImageView header = (ImageView) findViewById(R.id.main_imageview);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.purple2);
        Palette.from(bitmap).generate(new Palette.PaletteAsyncListener(){
            @Override
            public void onGenerated(Palette palette) {
                int vibrantColor = palette.getVibrantColor(getResources().getColor(R.color.vibrant));
                int vibrantDarkColor = palette.getDarkVibrantColor(getResources().getColor(R.color.vibrant_dark));
                collapsingToolbarLayout.setContentScrimColor(vibrantColor);
                collapsingToolbarLayout.setStatusBarScrimColor(vibrantDarkColor);
               // Palette.Swatch vibrantSwatch = palette.getVibrantSwatch();
               // Palette.Swatch vibrantDarkSwatch = palette.getDarkMutedSwatch();

                  //  collapsingToolbarLayout.setContentScrimColor(vibrantSwatch.getRgb());
                  //  collapsingToolbarLayout.setStatusBarScrimColor(vibrantDarkSwatch.getRgb());

            }
        });*/
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */

    private void setupViewPager(ViewPager viewPager) {
        SectionAdapter sectionAdapter = new SectionAdapter(getSupportFragmentManager());
        sectionAdapter.addFrag(new OneFragment(),"ONE");
        sectionAdapter.addFrag(new TwoFragment() , "TWO");
        sectionAdapter.addFrag(new ThreeFragment() , "THREE");
        viewPager.setAdapter(sectionAdapter);
    }
}
