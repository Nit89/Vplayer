package com.example.vplayer

import android.net.Uri
import android.security.AppUriAuthenticationPolicy
import java.nio.file.Path

data class Video(val id :String , val title:String , val duration :Long = 0 , val folderName:String , val size :String , val path: String , val artUri:Uri)
