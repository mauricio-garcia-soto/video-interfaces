package com.example.video
import com.example.video.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

import androidx.compose.ui.layout.Layout

import androidx.recyclerview.widget.RecyclerView
import com.example.video.databinding.ViewMovieItemBinding
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide

class VideoAdapter(private val movies: List<Movie>) : RecyclerView.Adapter<VideoAdapter.ViewHolder>() {
    class ViewHolder(private val binding: ViewMovieItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(movie: Movie) {
            binding.textView.text = movie.title
            Glide.with(binding.root.context).load(movie.cover).into(binding.imageView)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ViewMovieItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(movies[position])
    }

    override fun getItemCount(): Int {
      return movies.size
    }




}





