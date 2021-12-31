package com.client.soulstudio.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.client.soulstudio.data.model.Books
import com.client.soulstudio.data.model.Item
import com.client.soulstudio.data.model.VolumeInfo
import com.client.soulstudio.databinding.ItemBooksBinding
import javax.inject.Inject

class MainAdapter @Inject constructor(
) : RecyclerView.Adapter<MainAdapter.MyViewHolder>() {
    private var books = ArrayList<Item>()

    inner class MyViewHolder(
        private val binding: ItemBooksBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(myBooks: Item) {
            binding.myBooks = myBooks
            binding.executePendingBindings()

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemBinding =
            ItemBooksBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(itemBinding)
    }

    override fun getItemCount(): Int = books.size

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(books[position])
    }

    fun setData(list: List<Item>) {
        books.clear()
        books.addAll(list)
    }
}