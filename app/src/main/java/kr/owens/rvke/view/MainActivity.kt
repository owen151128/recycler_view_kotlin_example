package kr.owens.rvke.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kr.owens.rvke.adapter.DataAdapter
import kr.owens.rvke.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var activityMainBinding: ActivityMainBinding

    private val dataList: MutableList<String> by lazy { mutableListOf() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        val data = mutableListOf<String>()

        for (i in 0 until 30) {
            data.add(('a' + i).toString())
        }

        addDataList(data)
        activityMainBinding.owenRecyclerView.layoutManager = LinearLayoutManager(this)
        activityMainBinding.owenRecyclerView.adapter = DataAdapter(dataList, this)
    }

    private fun addDataList(data: List<String>) {
        dataList.addAll(data)
    }
}