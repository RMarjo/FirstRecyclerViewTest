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
        animalList.add(new Animal("Chat", "https://static.wamiz.fr/images/articles/facebook/article/interpreter-attitudes-chat-fb-5942b57e03e2d.jpg"));
        animalList.add(new Animal("Chien", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR04yehMFOVrI60jFe3GlC8-r7QRCNCzgkasHClyp_54tV8PaPV5Q"));
        animalList.add(new Animal("Oiseaux", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdCPTy46oJqwcdobjtxDzch4M7_pJCNIxu4JZcC6DtJ9wllRVmYw"));
        animalList.add(new Animal("Poisson", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQRKIKRrNhYGV4O2aBo2w6Tu09oJUKK8Qr9IXqgzv34uUIScTIlTg"));
        animalList.add(new Animal("Reptile", "http://www.animalzoo.ro/wp-content/uploads/2016/12/soparla-cu-limba-albastra.jpg"));
        animalList.add(new Animal("Cheval", "http://www.animal-totem.fr/wp-content/uploads/cheval-Animal-Totem-1.jpg"));
        animalList.add(new Animal("Dinosaure","https://pteapotes.files.wordpress.com/2014/06/capsciences-t-rex-dinosaure-exposition-atelier-animation-bordeaux-enfant-machoire-dent-taille-robot-automate.jpg"));

        recyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);
        adapter.setItems(animalList);


    }


}
