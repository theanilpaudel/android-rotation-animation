package com.theanilpaudel.rotatinganimation;

import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.Transformation;

/**
 * Created by nitv on 10/24/17.
 */

public class Rotation {
    View view;
    RotateAnimation anim;
    float fromDegree, toDegree, pivotX, pivotY;
    int pivotXType, pivotYType;


    /**
     * Repeat the animation indefinitely.
     */
    public static final int INFINITE = -1;

    /**
     * When the animation reaches the end and the repeat count is INFINTE_REPEAT
     * or a positive value, the animation restarts from the beginning.
     */
    public static final int RESTART = 1;

    /**
     * When the animation reaches the end and the repeat count is INFINTE_REPEAT
     * or a positive value, the animation plays backward (and then forward again).
     */
    public static final int REVERSE = 2;

    /**
     * Can be used as the start time to indicate the start time should be the current
     * time when is invoked for the
     * first animation frame. This can is useful for short animations.
     */
    public static final int START_ON_FIRST_FRAME = -1;

    /**
     * The specified dimension is an absolute number of pixels.
     */
    public static final int ABSOLUTE = 0;

    /**
     * The specified dimension holds a float and should be multiplied by the
     * height or width of the object being animated.
     */
    public static final int RELATIVE_TO_SELF = 1;

    /**
     * The specified dimension holds a float and should be multiplied by the
     * height or width of the parent of the object being animated.
     */
    public static final int RELATIVE_TO_PARENT = 2;

    /**
     * Requests that the content being animated be kept in its current Z
     * order.
     */
    public static final int ZORDER_NORMAL = 0;

    /**
     * Requests that the content being animated be forced on top of all other
     * content for the duration of the animation.
     */
    public static final int ZORDER_TOP = 1;

    /**
     * Requests that the content being animated be forced under all other
     * content for the duration of the animation.
     */
    public static final int ZORDER_BOTTOM = -1;

    public Rotation(View view, float fromDegree, float toDegree) {
        this.view = view;
        anim = new RotateAnimation(fromDegree, toDegree);
    }

    public Rotation(View view, float fromDegree, float toDegree, float pivotX, float pivotY) {
        this.view = view;
        anim = new RotateAnimation(fromDegree, toDegree, pivotX, pivotY);

    }

    public Rotation(View view, float fromDegree, float toDegree, float pivotX, float pivotY, int pivotXType, int pivotYType) {
        this.view = view;
        anim = new RotateAnimation(fromDegree, toDegree, pivotXType, pivotX, pivotYType, pivotY);
    }

    public void roatateView(long duration) {

        anim.setInterpolator(new LinearInterpolator());
        anim.setRepeatCount(Animation.INFINITE);
        anim.setDuration(duration);

        view.startAnimation(anim);
    }

    public void stopRotation(long after) {
        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                view.setAnimation(null);
            }
        };
        handler.postDelayed(runnable, after);

    }

}
