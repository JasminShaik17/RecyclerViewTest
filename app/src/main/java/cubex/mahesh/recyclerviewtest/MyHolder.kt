package cubex.mahesh.recyclerviewtest

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MyHolder:RecyclerView.ViewHolder
{
    var iview:ImageView?=null
    var tv1:TextView?=null
    var tv2:TextView?=null
    var del:ImageView?=null

    constructor(v:View) : super(v) {
        iview = v.findViewById(R.id.iview)
        tv1 = v.findViewById(R.id.tv1)
        tv2 = v.findViewById(R.id.tv2)
        del = v.findViewById(R.id.del)
    }

}