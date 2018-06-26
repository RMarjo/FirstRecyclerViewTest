package com.example.mrenaud.recyclertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private AnimalListAdapter adapter = new AnimalListAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List <Animal> animalList = new ArrayList();
        animalList.add(new Animal("chat","https://static.wamiz.fr/images/articles/facebook/article/chaton-fb-593eb3ebd3c5d.jpg"));
        animalList.add(new Animal("chien","http://www.holidogtimes.com/fr/wp-content/uploads/sites/2/2017/12/corgi-raisons-fi.png?2e4e73"));
        animalList.add(new Animal("poisson","https://www.poisson-or.com/6624-home_default/pseudotropheus-greshakei-m-8-10-cm.jpg"));

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);

        List<Animal> retrieveItems = animalList;
        adapter.setItems(retrieveItems);


    }


}
