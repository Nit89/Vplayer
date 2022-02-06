package com.example.vplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.vplayer.databinding.ActivityFoldersBinding
import com.example.vplayer.databinding.FragmentFoldersBinding

class FoldersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityFoldersBinding.inflate(layoutInflater)
        setTheme(R.style.coolPinkNav)
        setContentView(binding.root)
        val tempList = ArrayList<Video>()
        tempList.add(MainActivity.videoList[0])
        tempList.add(MainActivity.videoList[1])
        tempList.add(MainActivity.videoList[2])
        tempList.add(MainActivity.videoList[3])
        tempList.add(MainActivity.videoList[4])
        tempList.add(MainActivity.videoList[5])
        tempList.add(MainActivity.videoList[6])


        val position = intent.getIntExtra("position", 0)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = MainActivity.folderList[position].folderName
        binding.VideoRVFA.setHasFixedSize(true)
        binding.VideoRVFA.setItemViewCacheSize(10)
        binding.VideoRVFA.layoutManager = LinearLayoutManager(this@FoldersActivity)
        binding.VideoRVFA.adapter = VideoAdapter(this@FoldersActivity, tempList)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return true
    }
}