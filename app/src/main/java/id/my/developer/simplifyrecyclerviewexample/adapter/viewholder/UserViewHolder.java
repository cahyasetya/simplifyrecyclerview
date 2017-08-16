package id.my.developer.simplifyrecyclerviewexample.adapter.viewholder;

import android.view.View;
import android.widget.TextView;

import id.my.developer.simplifyrecyclerview.BViewHolder;
import id.my.developer.simplifyrecyclerviewexample.R;
import id.my.developer.simplifyrecyclerviewexample.model.User;

/**
 * Created by light on 16/08/2017.
 */

public class UserViewHolder extends BViewHolder<User> {
    TextView textView;
    public UserViewHolder(View itemView) {
        super(itemView);

        textView=(TextView)itemView.findViewById(R.id.textView);
    }

    @Override
    public void bind(User item) {
        textView.setText(item.getName());
    }
}
