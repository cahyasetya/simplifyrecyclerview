package id.my.developer.simplifyrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by light on 16/08/2017.
 */

public abstract class BRecyclerView<ViewHolder extends BViewHolder, T> extends RecyclerView.Adapter<ViewHolder>{

    private Context context;
    private List<T> itemList;

    public BRecyclerView(Context context, List<T> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    public View getView(ViewGroup parent){
        return LayoutInflater.from(parent.getContext()).inflate(getLayout(),parent,false);
    }

    public abstract int getLayout();

    @Override
    public abstract ViewHolder onCreateViewHolder(ViewGroup parent, int viewType);

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bind(itemList.get(position));
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
