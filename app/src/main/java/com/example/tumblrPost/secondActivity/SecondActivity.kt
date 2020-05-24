package com.example.tumblrPost.secondActivity

import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.tumblrPost.R
import com.example.tumblrPost.commonUtil.StaticVariable.INTENT_WEATHER_DATA
import com.example.tumblrPost.commonUtil.setTumblrImage
import com.example.tumblrPost.commonUtil.setTumblrText
import com.example.tumblrPost.model.TumblrPostModel
import com.google.gson.Gson
import com.lavidatec.wacare.KotlinUtil.fromJson
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        getIntentData()
    }

    /** 取得 intent extra 資料  */
    private fun getIntentData() {
        val data = intent.getSerializableExtra(INTENT_WEATHER_DATA)
        data?.let {
            val tumblrModel = Gson().fromJson<TumblrPostModel>(Gson().toJson(data))
            setTumblrText(tumblrModel, tvSecondText)
            if (tumblrModel.type == "video") {
                videoSecondPlayer.visibility = View.VISIBLE
                ivSecondImage.visibility = View.GONE
                tumblrModel.videoUrl?.let {
                    val video: Uri = Uri.parse(it)
                    videoSecondPlayer.setVideoURI(video)
                    videoSecondPlayer.setOnPreparedListener { mp ->
                        mp.isLooping = true
                        videoSecondPlayer.start()
                    }
                }
            } else {
                videoSecondPlayer.visibility = View.GONE
                ivSecondImage.visibility = View.VISIBLE
                setTumblrImage(this, tumblrModel, ivSecondImage)
            }
        }
    }

}