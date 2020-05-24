package com.example.tumblrPost.mainActivity

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.example.tumblrPost.R
import com.example.tumblrPost.adapter.TumblrDataAdapter
import com.example.tumblrPost.commonUtil.StaticVariable.INTENT_WEATHER_DATA
import com.example.tumblrPost.config.Config.DEFAULTBLOG
import com.example.tumblrPost.config.Config.JKINGBLOG
import com.example.tumblrPost.model.TumblrPostModel
import com.example.tumblrPost.secondActivity.SecondActivity
import com.example.tumblrPost.viewInterface.TumblrItemClickListener
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class MainActivity : AppCompatActivity(), TumblrItemClickListener {

    private val tumblrViewModel: TumblrViewModel by viewModel()
    private val userInfoAdapter = TumblrDataAdapter(this, this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Set the toolbar as support action bar
        initView() // 初始化介面
        observeViewModelData() // 建立observe
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // 設置要用哪個menu檔做為選單
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        // 取得點選項目的id
        val id: Int = item.itemId

        if (id == R.id.action_first) {
            tumblrViewModel.searchTumblrInfo(JKINGBLOG)
            return true
        } else if (id == R.id.action_second) {
            tumblrViewModel.searchTumblrInfo(DEFAULTBLOG)
            return true
        }
        return super.onOptionsItemSelected(item)
    }


    /*初始化recycleView adapter*/
    private fun initView() {
        rvOpenDataList.adapter = userInfoAdapter
    }

    /*使用觀察者模式，監聽資料是否刷新*/
    private fun observeViewModelData() {
        tumblrViewModel.tumblrLiveData.observe(this, Observer {
            /*新資料新增進Adapter*/
            userInfoAdapter.submitList(it)
        })
    }

    /*Adapter 點擊事件回傳*/
    override fun onItemClicked(tumblrPostModel: TumblrPostModel?) {
        val intent = Intent(this@MainActivity, SecondActivity::class.java)
        tumblrPostModel?.let {
            intent.putExtra(INTENT_WEATHER_DATA, it)
        }
        startActivity(intent)
    }
}

