package com.akaiyukiusagi.flexboxsmaple

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FlexboxViewModel: ViewModel() {

    val itemsList = arrayListOf(
        "十四代", "花陽浴", "而今", "No.6", "陽乃鳥", "花邑", "信州亀齢", "川中島 幻舞",
        "ソガペールエフィス", "飛露喜", "楽器正宗", "鳳凰美田", "亀泉", "写楽",
        "くどき上手", "新政", "醸し人九平次", "加茂錦", "赤武", "菊鷹", "風の森",
        "作", "澤屋まつもと", "王祿", "山間", "鍋島", "町田酒造", "農口尚彦研究所"
    )

    val itemsLiveData: MutableLiveData<ArrayList<String>> by lazy {
        MutableLiveData<ArrayList<String>>()
    }


}