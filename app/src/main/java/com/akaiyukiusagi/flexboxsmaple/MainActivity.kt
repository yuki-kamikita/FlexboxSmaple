package com.akaiyukiusagi.flexboxsmaple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.flexbox.*
import kotlinx.android.synthetic.main.activity_main.*

data class FlexboxItem(val name: String)

class MainActivity : AppCompatActivity() {

    private val items = ArrayList<FlexboxItem>()
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

        val testItems = arrayOf(
            "十四代", "花陽浴", "而今", "No.6", "陽乃鳥", "花邑", "信州亀齢", "川中島 幻舞 ",
            "ソガペールエフィス", "飛露喜", "楽器正宗", "鳳凰美田", "亀泉", "写楽",
            "くどき上手", "新政", "醸し人九平次", "加茂錦", "赤武", "菊鷹", "風の森",
            "作", "澤屋まつもと", "王祿", "山間", "鍋島", "町田酒造", "農口尚彦研究所"
        )
        testItems.map { items.add(FlexboxItem(it)) }
        adapter.setItems(items)
    }

}

// 出典：https://qiita.com/t-nonomura/items/6d8763563a713012de9b