package es.catmobi.cards;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by oriolfernandez on 02/12/13.
 */
public class ScreenSlidePageAdapter extends FragmentStatePagerAdapter {
    private int numberOfPages=5;



    public ScreenSlidePageAdapter(FragmentManager fm) {
        super(fm);
    }
    public ScreenSlidePageAdapter(FragmentManager fm,int numberOfPages) {
        super(fm);
        this.numberOfPages=numberOfPages;
    }
    @Override
    public Fragment getItem(int position) {
        return new ScreenSlidePageFragment();
    }

    @Override
    public int getCount() {
        return numberOfPages;
    }

}
