package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by MartiniF on 19/02/2016.
 */
public class ThreeTwoImageView extends ImageView {

    public ThreeTwoImageView (Context context) {
        super(context);
    }

    public ThreeTwoImageView (Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    public ThreeTwoImageView (Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int threeTwoHeight = MeasureSpec.getSize(widthMeasureSpec) * 2/3;
        int threeTwoHeightSpec = MeasureSpec.makeMeasureSpec(threeTwoHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, threeTwoHeightSpec);
    }
}
