package com.akaiyukiusagi.flexboxsmaple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.google.android.flexbox.*
import kotlinx.android.synthetic.main.activity_main.*

data class FlexboxItem(val name: String)

class MainActivity : AppCompatActivity() {

    val viewModel: FlexboxViewModel by viewModels()
    private val adapter = FlexboxAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flexboxLayoutManager = FlexboxLayoutManager(this)

//        flexboxLayoutManager.flexDirection  = FlexDirection.ROW         // 配置方向を指定
//        flexboxLayoutManager.flexWrap       = FlexWrap.WRAP             // 折り返し方法を指定
//        flexboxLayoutManager.justifyContent = JustifyContent.FLEX_START // 主軸方向の揃え位置を指定
//        flexboxLayoutManager.alignItems     = AlignItems.STRETCH        // 交差軸方向の揃え位置を指定

        // RecyclerViewのLayoutManagerに、カスタムしたFlexboxLayoutManagerを指定
        recycler_view.layoutManager = flexboxLayoutManager
        recycler_view.adapter = adapter

        viewModel.itemsLiveData.value = viewModel.itemsList

        viewModel.itemsLiveData.observe(this, Observer { value ->
            val items = ArrayList<FlexboxItem>()
            value.map { items.add(FlexboxItem(it)) }
            adapter.setItems(items)
        })

        button.setOnClickListener {
            viewModel.itemsList.add(editText.text.toString())
            viewModel.itemsLiveData.value = viewModel.itemsList
        }
    }

}

// 出典：https://qiita.com/t-nonomura/items/6d8763563a713012de9b