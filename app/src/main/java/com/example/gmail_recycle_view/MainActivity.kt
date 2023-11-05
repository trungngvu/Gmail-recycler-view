package com.example.gmail_recycle_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val data  = ArrayList<ItemViewModel>()
        data.add(ItemViewModel("OneDrive ", "Những kỷ niệm của bạn từ ngày này", "Đơn hàng #231030ABTS1MQW của bạn đã được giao thành công ngày 01/11/2023. ", "10:04AM"))
        data.add(ItemViewModel("OneDrive ", "Những kỷ niệm của bạn từ ngày này", "Đơn hàng #231030ABTS1MQW của bạn đã được giao thành công ngày 01/11/2023. ", "10:04AM"))
        data.add(ItemViewModel("OneDrive ", "Những kỷ niệm của bạn từ ngày này", "Đơn hàng #231030ABTS1MQW của bạn đã được giao thành công ngày 01/11/2023. ", "10:04AM"))
        data.add(ItemViewModel("OneDrive ", "Những kỷ niệm của bạn từ ngày này", "Đơn hàng #231030ABTS1MQW của bạn đã được giao thành công ngày 01/11/2023. ", "10:04AM"))
        data.add(ItemViewModel("OneDrive ", "Những kỷ niệm của bạn từ ngày này", "Đơn hàng #231030ABTS1MQW của bạn đã được giao thành công ngày 01/11/2023. ", "10:04AM"))
        data.add(ItemViewModel("OneDrive ", "Những kỷ niệm của bạn từ ngày này", "Đơn hàng #231030ABTS1MQW của bạn đã được giao thành công ngày 01/11/2023. ", "10:04AM"))
        data.add(ItemViewModel("OneDrive ", "Những kỷ niệm của bạn từ ngày này", "Đơn hàng #231030ABTS1MQW của bạn đã được giao thành công ngày 01/11/2023. ", "10:04AM"))
        data.add(ItemViewModel("OneDrive ", "Những kỷ niệm của bạn từ ngày này", "Đơn hàng #231030ABTS1MQW của bạn đã được giao thành công ngày 01/11/2023. ", "10:04AM"))
        data.add(ItemViewModel("OneDrive ", "Những kỷ niệm của bạn từ ngày này", "Đơn hàng #231030ABTS1MQW của bạn đã được giao thành công ngày 01/11/2023. ", "10:04AM"))

        val adapter = ItemAdapter(data)
        recyclerView.adapter = adapter
    }
}