package com.example.nano.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private MovieAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.movies_list);
        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(new Movie(R.mipmap.house_karakter, "After Earth" , "2013" , "12:30"));
        moviesList.add(new Movie(R.mipmap.house, "Baby Driver" , "2017", "12:35"));
        moviesList.add(new Movie(R.mipmap.chris_hemsworth_lead, "Deadpool" , "2016", "12:30"));
        moviesList.add(new Movie(R.mipmap.jobs_jpg, "Divergent" , "2014", "12:30"));
        moviesList.add(new Movie(R.mipmap.gettyimages_902530290, "Fight Club" , "1999", "12:40"));
        moviesList.add(new Movie(R.mipmap.thor, "Jaws" , "1975", "12:50"));
        moviesList.add(new Movie(R.mipmap.chris_hemsworth_lead, "Pirates of the Caribbean" , "2011", "12:30"));
        moviesList.add(new Movie(R.mipmap.jobs_jpg, "Star Wars" , "2016", "12:20"));
        moviesList.add(new Movie(R.mipmap.house_karakter, "The Grey" , "2011", "12:11"));

        mAdapter = new MovieAdapter(this,moviesList);
        listView.setAdapter(mAdapter);
    }
}
