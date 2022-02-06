package com.example.vplayer

import android.content.Context
import android.content.Intent
import android.text.format.DateUtils
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.vplayer.databinding.FolderViewBinding
import com.example.vplayer.databinding.VideoViewBinding

class FoldersAdapter(private val context: Context, private var foldersList: ArrayList<Folder>):
    RecyclerView.Adapter<FoldersAdapter.MyHolder>() {
    class MyHolder(binding:FolderViewBinding):RecyclerView.ViewHolder(binding.root) {
        val folderName = binding.folderNameFV
        val root = binding.root

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        return MyHolder(FolderViewBinding.inflate(LayoutInflater.from(context),parent , false))
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
       holder.folderName.text= foldersList[position].folderName
        holder.root.setOnClickListener {
            val intent = Intent(context, FoldersActivity::class.java)
            intent.putExtra("position" , position)
            ContextCompat.startActivity(context, intent , null)
        }

    }

    override fun getItemCount(): Int {
        return foldersList.size
    }

}