package cubex.mahesh.recyclerviewtest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
        var rview:RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rview = findViewById(R.id.rview1)
        var lManager = LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,
                false)
        rview?.layoutManager = lManager
        rview?.adapter = MyAdapter(this)
    }

    fun  fab(v:View)
    {
    var sBar =    Snackbar.make(v,"Don't Click Me...",
                Snackbar.LENGTH_INDEFINITE)
     sBar.setAction("Dismiss", object : View.OnClickListener {
         override fun onClick(v: View?) {
             sBar.dismiss()
         }
     })
    sBar.show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean
    {
        menuInflater.inflate(R.menu.mymenu,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        Toast.makeText(this,
                item?.title,Toast.LENGTH_LONG).show()

        return super.onOptionsItemSelected(item)
    }

} // MainActicity
