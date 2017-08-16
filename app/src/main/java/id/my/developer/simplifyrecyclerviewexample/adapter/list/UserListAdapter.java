package id.my.developer.simplifyrecyclerviewexample.adapter.list;

import android.content.Context;
import android.view.ViewGroup;

import java.util.List;

import id.my.developer.simplifyrecyclerview.BRecyclerView;
import id.my.developer.simplifyrecyclerviewexample.R;
import id.my.developer.simplifyrecyclerviewexample.adapter.viewholder.UserViewHolder;
import id.my.developer.simplifyrecyclerviewexample.model.User;

/**
 * Created by light on 16/08/2017.
 */

public class UserListAdapter extends BRecyclerView<UserViewHolder, User> {
    public UserListAdapter(Context context, List<User> itemList) {
        super(context, itemList);
    }

    @Override
    public int getLayout() {
        return R.layout.user_item;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new UserViewHolder(getView(parent));
    }
}
