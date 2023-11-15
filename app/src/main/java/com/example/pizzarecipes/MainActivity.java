package com.example.pizzarecipes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<PizzaRecipeItem> pizzaRecipeItems = new ArrayList<>();
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.margherita_pizza,
                Utils.MARGHERITA_PIZZA_TITLE,
                Utils.MARGHERITA_PIZZA_DESCRIPTION,
                Utils.MARGHERITA_PIZZA_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.homemade_cheese_pizza,
                Utils.HOMEMADE_CHEESE_PIZZA_TITLE,
                Utils.HOMEMADE_CHEESE_PIZZA_DESCRIPTION,
                Utils.HOMEMADE_CHEESE_PIZZA_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.taco_pizza,
                Utils.TACO_PIZZA_TITLE,
                Utils.TACO_PIZZA_DESCRIPTION,
                Utils.TACO_PIZZA_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.spinach_artichoke_pizza,
                Utils.SPANISH_ARTICHOKE_PIZZA_TITLE,
                Utils.SPANISH_ARTICHOKE_PIZZA_DESCRIPTION,
                Utils.SPANISH_ARTICHOKE_PIZZA_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.quattro_formaggi_pizza,
                Utils.QUATTRO_FORMAGGI_PIZZA_TITLE,
                Utils.QUATTRO_FORMAGGI_PIZZA_DESCRIPTION,
                Utils.QUATTRO_FORMAGGI_PIZZA_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.red_pepper_pizza,
                Utils.RED_PEPPER_PIZZA_TITLE,
                Utils.RED_PEPPER_PIZZA_DESCRIPTION,
                Utils.RED_PEPPER_PIZZA_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.greek_pizza_with_feta,
                Utils.GREEK_PIZZA_TITLE,
                Utils.GREEK_PIZZA_DESCRIPTION,
                Utils.GREEK_PIZZA_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.olive_pizza,
                Utils.OLIVE_PIZZA_TITLE,
                Utils.OLIVE_PIZZA_DESCRIPTION,
                Utils.OLIVE_PIZZA_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.everything_basil_pizza,
                Utils.EVERYTHING_BASIL_PIZZA_TITLE,
                Utils.EVERYTHING_BASIL_PIZZA_DESCRIPTION,
                Utils.EVERYTHING_BASIL_PIZZA_RECIPE));
        pizzaRecipeItems.add(new PizzaRecipeItem(R.drawable.goat_cheese_pizza,
                Utils.GOAT_CHEESE_PIZZA_TITLE,
                Utils.GOAT_CHEESE_PIZZA_DESCRIPTION,
                Utils.GOAT_CHEESE_PIZZA_RECIPE));

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        adapter = new PizzaRecipeAdapter(pizzaRecipeItems);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}