package com.dicoding.picodiploma.kota

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KotaAdapter (
    private val context: Context,
    private val images: List<Kota>,
    val listener: (Kota) -> Unit
) : RecyclerView.Adapter<KotaAdapter.ImageViewHolder>() {
    class ImageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageSrc = view.findViewById<ImageView>(R.id.gambar)
        val title = view.findViewById<TextView>(R.id.nama)
        val desc = view.findViewById<TextView>(R.id.deskripsi)
        fun bindView(image: Kota, listener: (Kota) -> Unit) {
            imageSrc.setImageResource(image.gambarSrc)
            title.text = image.titleGambar
            desc.text = image.deskripsiGambar
            itemView.setOnClickListener { listener(image) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder =
        ImageViewHolder(LayoutInflater.from(context).inflate(R.layout.item_kota, parent, false))

    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bindView(images[position], listener)
    }
}