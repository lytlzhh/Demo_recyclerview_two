package com.example.llw.demo_recyclerview_two;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by llw on 2016/6/12.
 */
public class Itemdecraction extends RecyclerView.ItemDecoration {
    int itemsiza = 0;

    public Itemdecraction(int itemsiza) {
        this.itemsiza = itemsiza;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.top = itemsiza;
        outRect.bottom = itemsiza;

    }
}
