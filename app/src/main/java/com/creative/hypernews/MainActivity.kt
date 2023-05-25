package com.creative.hypernews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

lateinit var recyclerView: RecyclerView
lateinit var myAdapter: MyAdapter
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var news  = ArrayList<Model>()
        recyclerView = findViewById(R.id.newsport)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        addnews(news)
        recyclerView.adapter = MyAdapter(news)
    }

    private fun addnews(news : ArrayList<Model>) {
        var new = listOf<Model>(
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
            Model("The President of Bangladesh","In tour of India to deal water"),
        )
        news.addAll(new)
    }
}