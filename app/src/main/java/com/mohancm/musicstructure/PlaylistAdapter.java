package com.mohancm.musicstructure;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.mohancm.musicstructure.Fragments.AlbumsFragment;
import com.mohancm.musicstructure.Fragments.ArtistFragment;
import com.mohancm.musicstructure.Fragments.PlaylistFragment;
import com.mohancm.musicstructure.Fragments.SongsFragment;
import com.mohancm.musicstructure.Fragments.StationsFragment;

public class PlaylistAdapter extends FragmentPagerAdapter {

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new PlaylistFragment();
            case 1:
                return new StationsFragment();
            case 2:
                return new ArtistFragment();
            case 3:
                return new AlbumsFragment();
            case 4:
                return new SongsFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }

    private int numOfTabs;

    PlaylistAdapter(FragmentManager fragmentManager, int numOfTabs) {
        super(fragmentManager);
        this.numOfTabs = numOfTabs;
    }
}
