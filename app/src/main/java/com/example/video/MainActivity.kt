package com.example.video

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.video.databinding.ActivityMainBinding
import androidx.recyclerview.widget.GridLayoutManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.layoutManager = GridLayoutManager(this,2)
        binding.recycler.adapter = VideoAdapter(
            listOf(
                Movie("title 1", "https://loremflickr.com/320/240?lock=1"),
                Movie("title2", "https://loremflickr.com/320/240?lock=2"),
                Movie("title3", "https://loremflickr.com/320/240?lock=3"),
                Movie("title4", "https://loremflickr.com/320/240?lock=4"),
                Movie("title5", "https://loremflickr.com/320/240?lock=5")
            ),
            object : MovieClickListener{
                override fun onMovieClick(movie: Movie) {
                    Toast.makeText(this@MainActivity,movie.title, Toast.LENGTH_SHORT).show()
                }

            }
        )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy")
    }
}
