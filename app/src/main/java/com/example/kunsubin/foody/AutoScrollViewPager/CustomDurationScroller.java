package com.example.kunsubin.foody.AutoScrollViewPager;
import android.view.animation.Interpolator;
import android.content.Context;
import android.widget.Scroller;

/**
 * Created by kunsubin on 4/5/2017.
 */

public class CustomDurationScroller extends Scroller {
    private double scrollFactor = 1;

    public CustomDurationScroller(Context context) {
        super(context);
    }

    public CustomDurationScroller(Context context, Interpolator interpolator) {
        super(context,  interpolator);
    }

    public void setScrollDurationFactor(double scrollFactor) {
        this.scrollFactor = scrollFactor;
    }

    @Override
    public void startScroll(int startX, int startY, int dx, int dy, int duration) {
        super.startScroll(startX, startY, dx, dy, (int)(duration * scrollFactor));
    }
}