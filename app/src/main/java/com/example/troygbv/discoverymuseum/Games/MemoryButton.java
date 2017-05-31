package com.example.troygbv.discoverymuseum.Games;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.widget.AppCompatDrawableManager;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

import com.example.troygbv.discoverymuseum.R;

public class MemoryButton extends android.support.v7.widget.AppCompatButton {

    protected int row;
    protected int column;
    protected int frontDrawableId;

    protected boolean isFlipped = false;
    protected boolean isMatched = false;

    protected Drawable front;
    protected Drawable back;

    public MemoryButton(Context context, int r, int c, int frontImageDrawableId){

        super(context);
        row = r;
        column = c;
        frontDrawableId = frontImageDrawableId;


        front = AppCompatDrawableManager.get().getDrawable(context, frontImageDrawableId);
        back = AppCompatDrawableManager.get().getDrawable(context, R.drawable.button_question_mark);

        setBackground(back);

        GridLayout.LayoutParams tempParams = new GridLayout.LayoutParams(GridLayout.spec(r), GridLayout.spec(c));

        tempParams.width = (int) getResources().getDisplayMetrics().density * 50;
        tempParams.height = (int) getResources().getDisplayMetrics().density * 50;

        setLayoutParams(tempParams);
    }

    public boolean isMatched() {
        return isMatched;
    }

    public void setMatched(boolean matched) {
        isMatched = matched;

        final Toast toast = Toast.makeText(this.getContext(), "It's a Match!", Toast.LENGTH_SHORT);
        toast.show();

        //handler to shorten toast time
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        }, 1000);
    }

    public int getFrontDrawableId() {
        return frontDrawableId;
    }

    public void flip() {

        if (isMatched){
            return;
    }

        else if (isFlipped){
            setBackground(back);

            final Toast toast = Toast.makeText(this.getContext(), "Try Again!", Toast.LENGTH_SHORT);
            toast.show();

            Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                }
            }, 700);

            isFlipped = false;
        } else {
            setBackground(front);
            isFlipped = true;
        }

    }
}
