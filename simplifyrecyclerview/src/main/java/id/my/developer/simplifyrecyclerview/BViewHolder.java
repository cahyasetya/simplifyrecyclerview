package id.my.developer.simplifyrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by light on 16/08/2017.
 */

public abstract class BViewHolder<T> extends RecyclerView.ViewHolder {

    public BViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bind(T item);
}
