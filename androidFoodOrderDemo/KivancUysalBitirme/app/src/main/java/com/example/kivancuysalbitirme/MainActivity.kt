package com.example.kivancuysalbitirme

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var productAdapter: ProductAdapter
    private lateinit var productList: ArrayList<Product>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        productList = arrayListOf(
            Product("Ayran", "₺3", "http://kasimadalan.pe.hu/yemekler/resimler/ayran.png"),
            Product("Baklava", "₺25", "http://kasimadalan.pe.hu/yemekler/resimler/baklava.png"),
            Product("Fanta", "₺6", "http://kasimadalan.pe.hu/yemekler/resimler/fanta.png"),
            Product("Izgara Somon", "₺55", "http://kasimadalan.pe.hu/yemekler/resimler/izgarasomon.png"),
            Product("Kofte", "₺30", "http://kasimadalan.pe.hu/yemekler/resimler/kofte.png"),
            Product("Pizza", "₺45", "http://kasimadalan.pe.hu/yemekler/resimler/pizza.png"),
            Product("Su", "2", "http://kasimadalan.pe.hu/yemekler/resimler/su.png"),
            Product("Tavuk", "₺20", "http://kasimadalan.pe.hu/yemekler/resimler/izgaratavuk.png")
        )

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        productAdapter = ProductAdapter(productList)
        recyclerView.adapter = productAdapter


    }
}