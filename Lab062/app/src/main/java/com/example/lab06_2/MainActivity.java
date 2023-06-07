package com.example.lab06_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    private RecyclerView recyclerView;
    private ProductAdapter productAdapter;
    private List<Product> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.productRecyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        productList = new ArrayList<>();
        productList.add(new Product("Pharmacity","Pharmacity",R.drawable.product01));
        productList.add(new Product("Registry","Registry", R.drawable.product02));
        productList.add(new Product("Cartwheel","Registry", R.drawable.product03));
        productList.add(new Product("Clothing","Registry", R.drawable.product04));
        productList.add(new Product("Shoes","Registry", R.drawable.product05));
        productList.add(new Product("Accessories","Registry", R.drawable.product06));
        productList.add(new Product("Baby","Registry", R.drawable.product07));
        productList.add(new Product("Home","Registry", R.drawable.product08));
        productList.add(new Product("Patio & garden","Registry", R.drawable.product09));

        productAdapter = new ProductAdapter(productList);
        recyclerView.setAdapter(productAdapter);

    }

    private List<Product> createProductList() {
        List<Product> products = new ArrayList<>();

        return products;
    }

}