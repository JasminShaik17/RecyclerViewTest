package cubex.mahesh.recyclerviewtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
        var rview:RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rview = findViewById(R.id.rview1)
        var lManager = LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL,
                false)
        rview?.layoutManager = lManager
        rview?.adapter = MyAdapter(this)
    }
}
