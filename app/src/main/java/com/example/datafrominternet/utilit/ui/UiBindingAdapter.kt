package com.example.datafrominternet.utilit.ui

import android.widget.ImageView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.datafrominternet.R
import com.example.datafrominternet.internet.DataItem
import com.example.datafrominternet.overview.CountryGridAdapter

@BindingAdapter("imageUrl")
fun ImageView.findUrl(imgUrl: String?) {
    imgUrl?.let {
        val imgUri = imgUrl.toUri().buildUpon().scheme("http").build()
        this.load(imgUri) {
            placeholder(R.drawable.loading_animation)
            error(R.drawable.ic_baseline_broken_image_24)
        }
    }
}

@BindingAdapter("listData")
fun RecyclerView.bindRecycleView(data: List<DataItem>?) {
    if (this.adapter == null) {
        this.adapter = CountryGridAdapter()
    }
    val adapter = this.adapter as CountryGridAdapter
    adapter.submitList(data)
}
