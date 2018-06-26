package com.example.mrenaud.recyclertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    private MyAdapter Species = new MyAdapter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<MyObject> retrieveItems = newSpecies(); // ??????? ... ??????? <= ???
        Species.setItems(retrieveItems);

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(new MyAdapter());
    }

    public void newSpecies() {
        Species.add(new MyObject("Chat", "https://static.wamiz.fr/images/articles/facebook/article/interpreter-attitudes-chat-fb-5942b57e03e2d.jpg"));
        Species.add(new MyObject("Chien", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR04yehMFOVrI60jFe3GlC8-r7QRCNCzgkasHClyp_54tV8PaPV5Q"));
        Species.add(new MyObject("Oiseaux", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdCPTy46oJqwcdobjtxDzch4M7_pJCNIxu4JZcC6DtJ9wllRVmYw"));
        Species.add(new MyObject("Poisson", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRKIKRrNhYGV4O2aBo2w6Tu09oJUKK8Qr9IXqgzv34uUIScTIlTg"));
        Species.add(new MyObject("Reptile", "http://www.animalzoo.ro/wp-content/uploads/2016/12/soparla-cu-limba-albastra.jpg"));
        Species.add(new MyObject("Cheval", "http://www.animal-totem.fr/wp-content/uploads/cheval-Animal-Totem-1.jpg"));
        Species.add(new MyObject("Dinosaure","https://pteapotes.files.wordpress.com/2014/06/capsciences-t-rex-dinosaure-exposition-atelier-animation-bordeaux-enfant-machoire-dent-taille-robot-automate.jpg"));

    }

}
