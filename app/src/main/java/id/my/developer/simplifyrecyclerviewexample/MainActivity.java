package id.my.developer.simplifyrecyclerviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.my.developer.simplifyrecyclerviewexample.adapter.list.UserListAdapter;
import id.my.developer.simplifyrecyclerviewexample.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        List<User> userList = new ArrayList<>();

        User user = new User("light");
        for(int i=0; i<5; i++) userList.add(user);
        UserListAdapter adapter = new UserListAdapter(this, userList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
