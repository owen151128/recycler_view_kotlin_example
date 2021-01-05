package kr.owens.rvke.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kr.owens.rvke.databinding.TvDataTypeBinding

class DataAdapter(private val items: MutableList<String>, private val context: Context) :
    RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TvDataTypeBinding.inflate(LayoutInflater.from(context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvData.text = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

class ViewHolder(tvDataTypeBinding: TvDataTypeBinding) :
    RecyclerView.ViewHolder(tvDataTypeBinding.root) {
    val tvData = tvDataTypeBinding.tvData
}