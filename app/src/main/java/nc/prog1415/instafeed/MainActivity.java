package nc.prog1415.instafeed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Store> storeList = new ArrayList<>();
    private RecyclerView recyclerView;
    private StoreListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        mAdapter = new StoreListAdapter(storeList, this);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }
    //build android menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //build android menu
        menu.add("About");
        menu.add("Help");
        menu.add("Home");
        menu.add("Log Out");
        return super.onCreateOptionsMenu(menu);
    }
    // onclick for android menus
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // About
        if(item.getTitle().toString()=="About"){

        }
        // Help
        else if(item.getTitle().toString()=="Help"){

        }
        // Home
        else if(item.getTitle().toString()=="Home"){

        }
        // Log Out
        else if(item.getTitle().toString()=="Log Out"){

        }
        return super.onOptionsItemSelected(item);
    }

    private void prepareMovieData() {
        Store movie = new Store("Mad Max: Fury Road", "Action & Adventure", "2015");
        storeList.add(movie);

        movie = new Store("Inside Out", "Animation, Kids & Family", "2015");
        storeList.add(movie);

        movie = new Store("Star Wars: Episode VII - The Force Awakens", "Action", "2015");
        storeList.add(movie);

        movie = new Store("Shaun the Sheep", "Animation", "2015");
        storeList.add(movie);

        movie = new Store("The Martian", "Science Fiction & Fantasy", "2015");
        storeList.add(movie);

        movie = new Store("Mission: Impossible Rogue Nation", "Action", "2015");
        storeList.add(movie);

        movie = new Store("Up", "Animation", "2009");
        storeList.add(movie);

        movie = new Store("Star Trek", "Science Fiction", "2009");
        storeList.add(movie);

        movie = new Store("The LEGO Movie", "Animation", "2014");
        storeList.add(movie);

        movie = new Store("Iron Man", "Action & Adventure", "2008");
        storeList.add(movie);

        movie = new Store("Aliens", "Science Fiction", "1986");
        storeList.add(movie);

        movie = new Store("Chicken Run", "Animation", "2000");
        storeList.add(movie);

        movie = new Store("Back to the Future", "Science Fiction", "1985");
        storeList.add(movie);

        movie = new Store("Raiders of the Lost Ark", "Action & Adventure", "1981");
        storeList.add(movie);

        movie = new Store("Goldfinger", "Action & Adventure", "1965");
        storeList.add(movie);

        movie = new Store("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
        storeList.add(movie);

        mAdapter.notifyDataSetChanged();
    }
}
