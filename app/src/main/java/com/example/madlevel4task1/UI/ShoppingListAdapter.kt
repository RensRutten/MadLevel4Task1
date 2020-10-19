package com.example.madlevel4task1.UI

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.madlevel4task1.Model.Product
import com.example.madlevel4task1.R
import kotlinx.android.synthetic.main.product.view.*

class ShoppingListAdapter(private val products: List<Product>) :
    RecyclerView.Adapter<ShoppingListAdapter.ViewHolder>() {


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun databind(product: Product) {
            itemView.TvName.text = product.ProductName
            itemView.TvQuantity.text = product.ProductQuantity.toString()
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.product, parent, false)
        )

    }

    override fun getItemCount(): Int {
        return products.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.databind(products[position])
    }


}