package com.aryanto.movieactor

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aryanto.movieactor.databinding.ItemBinding

class HomeAdapter(
    private val personList: List<Person>
): RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {
    class HomeViewHolder( private val binding: ItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(person: Person){
            binding.apply {
                tvItemName.text = person.name
                tvItemDescription.text = person.desc
                imageView.setImageResource(person.photo)

                root.setOnClickListener {
                    val intent = Intent(root.context, DetailActivity::class.java)
                    intent.putExtra("person", person)
                    root.context.startActivity(intent)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return personList.size
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(personList[position])
    }
}